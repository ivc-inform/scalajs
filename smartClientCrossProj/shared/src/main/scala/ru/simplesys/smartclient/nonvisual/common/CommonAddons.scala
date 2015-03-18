package ru.simplesys
package smartclient
package nonvisual
package common

import prickle._
import scala.collection._
import scala.util.{Failure, Try, Success}

//import scala.scalajs.js


trait SimpleStringEnum {
  def asString: String
}

trait SimpleStringEnumObj[T <: SimpleStringEnum] {
  @inline implicit def stringEnumToJS(p: T): String = p.asString
//  @inline implicit def stringToEnum(p: String): T = formatMap(p)

  def formatMap: Map[String, T]

  implicit object SimpleStringEnumObjUnpickler extends Unpickler[T] {
    def unpickle[P](pickle: P, state: mutable.Map[String, Any])(implicit config: PConfig[P]) = {
      val ret = config.readString(pickle).flatMap {str =>
        formatMap.get(str) match {
          case Some(el) => Success(el)
          case None => Failure[T](new NoSuchElementException(str))
        }
      }
      ret
    }
  }

}
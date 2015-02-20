package ru.simplesys
package smartclient
package nonvisual
package common

import scala.scalajs.js


trait SimpleStringEnum {
  def asString: String
}

trait SimpleStringEnumObj[T <: SimpleStringEnum] {
  @inline implicit def stringEnumToJS(p: T): js.Any = p.asString

  def formatMap: Map[String, T]
}
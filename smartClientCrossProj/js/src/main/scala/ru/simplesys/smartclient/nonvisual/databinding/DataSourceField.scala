package ru.simplesys
package smartclient
package nonvisual
package databinding

import cmntypes.SCProps

import scala.scalajs.js
import ru.simplesys.macrojs._

import scala.scalajs.js.annotation.JSName

import smartclient.nonvisual.types.SCType

trait DataSourceField[T] extends js.Object {
  def name: String

  @JSName("type")
  /*protected*/ def fieldType: String
}

//object DataSourceField extends SCApply[DataSourceField[_], DataSourceFieldProps[_]] {
//  implicit class ToDataSourceFieldExt[T](dsf: DataSourceField[T]) {
//    @inline def fieldType: SCType[T] =
//  }
//}

//trait DataSourceFieldProps[T] extends SCProps {
//  var name:
//}


//we need support of Props type in macro, even under collection types
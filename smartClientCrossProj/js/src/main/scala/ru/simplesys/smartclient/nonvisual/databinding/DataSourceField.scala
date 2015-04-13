package ru.simplesys
package smartclient
package nonvisual
package databinding

import cmntypes.{PropOpt, SCProps}

import scala.scalajs.js
import macrojs._

import scala.scalajs.js.annotation.JSName

import smartclient.nonvisual.types.SCType

trait DataSourceField[T] extends js.Object {
  def name: String = js.native
  def title : String = js.native
  @JSName("type")
  def fieldType: String = js.native
}

//object DataSourceField extends SCApply[DataSourceField[_], DataSourceFieldProps[_]] {
//  implicit class ToDataSourceFieldExt[T](dsf: DataSourceField[T]) {
//    @inline def fieldType: SCType[T] =
//  }
//}

class DataSourceFieldProps[T](nameParam: String, titleParam : String, fieldTypeParam: SCType[T]) extends SCProps {
  var name = nameParam
  var title = titleParam

  private var _fieldType = noProp[SCType[T]]
  def fieldType: PropOpt[SCType[T]] = _fieldType
  def fieldType_=(t: PropOpt[SCType[T]]): Unit = {
    _fieldType = t
    _type = _fieldType.map(_.name).toSCPropOpt
  }

  private var _type = noSCProp[String]
  def `type` = _type

  fieldType = fieldTypeParam
}



package ru.simplesys
package smartclient
package nonvisual
package databinding

import macrojs._

import cmntypes._
import smartclient.nonvisual.common.SCClass
import rpc._

import scala.scalajs.js


trait DataSource extends SCClass {
  def dataURL: String = js.native
  def fields: js.Array[DataSourceField[_]] = js.native
  protected def dataFormat: String = js.native
  protected def dataProtocol: String = js.native
  protected def getDataProtocol(r: DSRequest): String = js.native
  def operationBindings: js.Array[OperationBinding] = js.native
  def requestProperties: js.Object = js.native

  def useStrictJSON: Boolean = js.native
}


class DataSourceProps extends SCProps {
  var dataURL = noSCProp[String]
  //here could be DataSourceField too

  private var _fields = noSCProp[Either[Seq[DataSourceField[_]], Seq[DataSourceFieldProps[_]]]]

  def fields_=(f: Seq[DataSourceFieldProps[_]])(implicit i1: scala.Predef.DummyImplicit): Unit = _fields = SCPropVal(Right(f))
  def fields_=(f: Seq[DataSourceField[_]])(implicit i1: scala.Predef.DummyImplicit, i2: scala.Predef.DummyImplicit): Unit = _fields = SCPropVal(Left(f))
  def fields: SCPropOpt[Either[Seq[DataSourceField[_]], Seq[DataSourceFieldProps[_]]]] = _fields

  var dataFormat = noSCProp[DSDataFormat]
  var dataProtocol = noSCProp[DSProtocol]
  var operationBindings = noSCProp[Seq[OperationBindingProps]]
  var requestProperties = noSCProp[DSRequestProps]
  var useStrictJSON = noSCProp[Boolean]
}

object DataSource extends SCApply[DataSource, DataSourceProps] {
    implicit class ToDataSourceExt(ds: DataSource) {
      @inline def dataFormat: DSDataFormat = DSDataFormat.formatMap(ds.dataFormat)
      @inline def dataProtocol: DSProtocol = DSProtocol.formatMap(ds.dataProtocol)
      @inline def getDataProtocol(r: DSRequest): DSProtocol = DSProtocol.formatMap(ds.getDataProtocol(r))
  }
}



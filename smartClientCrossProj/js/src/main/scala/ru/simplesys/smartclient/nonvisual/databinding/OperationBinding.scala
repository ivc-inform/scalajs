package ru.simplesys
package smartclient
package nonvisual
package databinding

import macrojs._

import cmntypes._
import smartclient.nonvisual.common.SCClass
import rpc._

import scala.scalajs.js


class OperationBinding extends js.Object {
  def allowAdvancedCriteria: Boolean = js.native
  def allowAdvancedCriteria_(isAllow: Boolean): Unit = js.native

  def allowMultiUpdate: Boolean = js.native

  def autoJoinTransactions: Boolean = js.native

  protected def dataFormat: String = js.native
  protected def dataProtocol: String = js.native
  protected def dataTransport: String = js.native

  def dataURL: String = js.native
  def defaultParams: js.Object = js.native
  def invalidateCache: Boolean = js.native

  protected def operationType: String = js.native

  def preventHTTPCaching: Boolean = js.native

  def requestProperties: js.Object = js.native
  def requiresAuthentication: Boolean = js.native
}

object OperationBinding /*extends SCApp*/ {
  implicit class ToOperationBindingExt(ob: OperationBinding) {
    @inline def dataFormat: DSDataFormat = DSDataFormat.formatMap(ob.dataFormat)
    @inline def dataProtocol: DSProtocol = DSProtocol.formatMap(ob.dataProtocol)
    @inline def dataTransport: RPCTransport = RPCTransport.formatMap(ob.dataTransport)
    @inline def operationType: DSOperationType = DSOperationType.formatMap(ob.operationType)
  }

}


class OperationBindingProps extends SCProps {
  var allowAdvancedCriteria = noSCProp[Boolean]
  var allowMultiUpdate = noSCProp[Boolean]
  var autoJoinTransactions = noSCProp[Boolean]
  //var dataFormat: SCPropOpt[DSDataFormat] = DSDataFormat.JSon
  var dataFormat = noSCProp[DSDataFormat]
  //var dataProtocol: SCPropOpt[DSProtocol] = DSProtocol.PostParams
  var dataProtocol = noSCProp[DSProtocol]
  //var dataTransport: SCPropOpt[RPCTransport] = RPCTransport.XmlHttpRequest
  var dataTransport = noSCProp[RPCTransport]
  var dataURL = noSCProp[String]
  var defaultParams = noSCProp[js.Object]
  var invalidateCache = noSCProp[Boolean]
  var operationType = noSCProp[DSOperationType]
  var preventHTTPCaching = noSCProp[Boolean]
  var requestProperties = noSCProp[DSRequestProps]
  var requiresAuthentication = noSCProp[Boolean]
}

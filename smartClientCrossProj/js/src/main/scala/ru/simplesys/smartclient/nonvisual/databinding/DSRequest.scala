package ru.simplesys
package smartclient
package nonvisual
package databinding


import scala.scalajs.js
import macrojs._
import rpc._
import cmntypes.{SCPropOpt, SCProps}


trait DSRequest extends RPCRequest {
  type Request <: DSRequest
  type Response <: DSResponse
  type Data <: js.Object

  def componentId: String = js.native
  def dataSource: String = js.native

  protected def operationType: String = js.native
}

object DSRequest extends SCApply[DSRequest, DSRequestProps] {
  implicit class ToDSRequestExt(r: DSRequest) {
//    @inline def dataFormat: DSDataFormat = DSDataFormat.formatMap(ob.dataFormat)
//    @inline def dataProtocol: DSProtocol = DSProtocol.formatMap(ob.dataProtocol)
//    @inline def dataTransport: RPCTransport = RPCTransport.formatMap(ob.dataTransport)
    @inline def operationType: DSOperationType = DSOperationType.formatMap(r.operationType)
  }

}

class DSRequestProps extends RPCRequestProps {
  type Request <: DSRequest
  type Response <: DSResponse
  type Data <: js.Object

  var componentId = noSCProp[String]

  // usually autopopulated
  var dataSource = noSCProp[String]
  // usually autopopulated
  var operationType = noSCProp[DSOperationType]



}
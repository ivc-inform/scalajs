package ru.simplesys
package smartclient
package nonvisual
package rpc

import scala.scalajs.js
import macrojs._
import common.SCClass
import cmntypes.SCProps

trait RPCRequest extends SCClass {
  type Request <: RPCRequest
  type Response <: RPCResponse
  type Data <: js.Any

  def actionURL: String = js.native
  def actionURL_=(url: String): Unit = js.native

  def callback: js.Function3[Request, js.Any, Response, Unit] = js.native
  def callback_=(cb: js.Function3[Request, Data, Response, Unit]): Unit = js.native

  protected def httpMethod: String = js.native

  def useSimpleHttp: Boolean = js.native
  def useSimpleHttp_=(b: Boolean): Unit = js.native

  def clientContext: js.Object = js.native
  def clientContext_=(obj: js.Object): Unit = js.native

}

object RPCRequest extends SCApply[RPCRequest, RPCRequestProps] {
  implicit class ToRPCRequestExt(req: RPCRequest) {
    @inline def httpMethod: HttpMethod = HttpMethod.formatMap(req.httpMethod)
  }
}

class RPCRequestProps extends SCProps {
  type Request <: RPCRequest
  type Response <: RPCResponse
  type Data <: js.Any

  var actionURL = noSCProp[String]
  var callback = noSCProp[js.Function3[Request, Data, Response, Unit]]
  var httpMethod = noSCProp[HttpMethod]
  var useSimpleHttp = noSCProp[Boolean]

  var clientContext = noSCProp[js.Object]
}

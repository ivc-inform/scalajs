package ru.simplesys
package smartclient
package nonvisual
package rpc

import scala.scalajs.js
import macrojs._
import common.SCClass
import cmntypes.SCProps

trait RPCRequest extends SCClass {
  def actionURL: String = js.native
  def actionURL_=(url: String): Unit = js.native
  def callback: RPCCallback = js.native
  def callback_=(cb: RPCCallback): Unit = js.native
  protected def httpMethod: String = js.native
  def useSimpleHttp: Boolean = js.native
  def useSimpleHttp_=(b: Boolean): Unit = js.native
}

object RPCRequest extends SCApply[RPCRequest, RPCRequestProps] {
  implicit class ToRPCRequestExt(req: RPCRequest) {
    @inline def httpMethod: HttpMethod = HttpMethod.formatMap(req.httpMethod)
  }
}

class RPCRequestProps extends SCProps {
  var actionURL = noSCProp[String]
  var callback = noSCProp[RPCCallback]
  var httpMethod = noSCProp[HttpMethod]
  var useSimpleHttp = noSCProp[Boolean]
}

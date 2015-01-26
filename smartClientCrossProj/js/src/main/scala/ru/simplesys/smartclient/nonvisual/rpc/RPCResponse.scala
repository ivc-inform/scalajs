package ru.simplesys
package smartclient
package nonvisual
package rpc

import scala.scalajs.js
import macrojs._
import common.SCClass
import cmntypes.SCProps

trait RPCResponse extends SCClass {
  def transactionNum: Int = js.native
  //todo enumerations of builtin status codes
  def status: Int = js.native

  //avail only when default RPCTransport "xmlHttpRequest" transport is in use
  def httpResponseText: String = js.native

  def httpResponseCode: Int = js.native

  def httpHeaders: js.Object = js.native

  def data: js.Object = js.native

  def clientContext: js.Object = js.native
}

object RPCResponse extends SCApply[RPCResponse, RPCResponseProps]

class RPCResponseProps extends SCProps {

}

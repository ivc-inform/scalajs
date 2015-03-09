package ru.simplesys
package smartclient
package nonvisual
package rpc

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

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

object RPCResponse extends SCApply[RPCResponse, RPCResponseProps] {
  //@JSName(s"isc.${scClassName}")
  @JSName("isc.RPCResponse")
  object isc extends js.Object {
    def STATUS_CONNECTION_RESET_ERROR: Int = js.native
    def STATUS_FAILURE: Int = js.native
    def STATUS_LOGIN_INCORRECT: Int = js.native
    def STATUS_LOGIN_REQUIRED: Int = js.native
    def STATUS_LOGIN_SUCCESS: Int = js.native
    def STATUS_MAX_FILE_SIZE_EXCEEDED: Int = js.native
    def STATUS_MAX_LOGIN_ATTEMPTS_EXCEEDED: Int = js.native
    def STATUS_MAX_POST_SIZE_EXCEEDED: Int = js.native
    def STATUS_OFFLINE: Int = js.native
    def STATUS_SERVER_TIMEOUT: Int = js.native
    def STATUS_SUCCESS: Int = js.native
    def STATUS_TRANSACTION_FAILED: Int = js.native
    def STATUS_TRANSPORT_ERROR: Int = js.native
    def STATUS_UNKNOWN_HOST_ERROR: Int = js.native
    def STATUS_UPDATE_WITHOUT_PK_ERROR: Int = js.native
    def STATUS_VALIDATION_ERROR: Int = js.native
  }
}



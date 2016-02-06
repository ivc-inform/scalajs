package com.simplesys.SmartClient.Foundation

import com.simplesys.SmartClient.RPC.{RPCRequest, RPCResponse}
import com.simplesys.SmartClient.System.Types
import com.simplesys.System.Types2.{HTMLString, URL, void}

import scala.scalajs.js

@js.native
trait ViewLoader extends Label {
    val allowCaching: Boolean
    def getView(): Canvas
    var handleError: js.Function2[RPCRequest, RPCResponse, Boolean]
    var httpMethod: String
    val loadingMessage: HTMLString
    def setViewURL(url: URL = js.native, params: Types.Object = js.native, rpcProperties: RPCRequest = js.native): void
    var viewLoaded: js.Function1[Canvas, _]
    val viewRPCProperties: RPCRequest
    val viewURL: URL
    val viewURLParams: Types.Object
}




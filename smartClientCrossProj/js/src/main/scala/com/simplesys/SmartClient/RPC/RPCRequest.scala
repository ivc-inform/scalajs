package com.simplesys.SmartClient.RPC

import com.simplesys.SmartClient.System.Types.{Record, Callback}
import com.simplesys.SmartClient.System.{Types, AbstractClassCompanion, Class}
import com.simplesys.isc.System.Types.PromptStyle.PromptStyle
import com.simplesys.isc.System.Types.RPCTransport.RPCTransport
import com.simplesys.isc.System.Types.{void, URL}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait RPCRequest extends Class {
    var actionURL: URL
    val allowIE9Leak: Boolean
    var bypassCache: Boolean
    var callback: Callback
    var callbackParam: String
    var clientContext: Types.Object
    var containsCredentials: Boolean
    var contentType: String
    var data: String | Record | Types.Object
    var downloadResult: Boolean
    var downloadToNewWindow: Boolean
    var evalResult: Boolean
    var evalVars: Types.Object
    var httpHeaders: Types.Object
    var httpMethod: String
    val httpProxyURL: String
    var ignoreTimeout: Boolean
    var omitNullMapValuesInResponse: Boolean
    var params: Types.Object
    var prompt: String
    var promptCursor: String
    var promptDelay: Int
    var promptStyle: PromptStyle
    var sendNoQueue: Boolean
    var serverOutputAsString: Boolean
    var showPrompt: Boolean
    var suppressAutoDraw: Boolean
    var timeout: Int
    var transport: RPCTransport
    var useHttpProxy: Boolean
    var useSimpleHttp: Boolean
    var useXmlHttpRequest: Boolean
    var willHandleError: Boolean
    var withCredentials: Boolean
}

@js.native
abstract trait AbstractRPCRequestCompanion extends AbstractClassCompanion {
    def create(): void = js.native
    var useCursorTracker: Boolean = js.native
}

@js.native
object RPCRequest extends AbstractRPCRequestCompanion


package com.simplesys.SmartClient.RPC

import com.simplesys.SmartClient.System.Types.{Record, Callback}
import com.simplesys.SmartClient.System.{Types, AbstractClassCompanion, Class}
import com.simplesys.System.Types2.PromptStyle.PromptStyle
import com.simplesys.System.Types2.RPCTransport.RPCTransport
import com.simplesys.System.Types2.{void, URL}
import com.simplesys.Types1._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.|

@js.native
trait RPCRequest extends Class {
    var actionURL: URL
    val allowIE9Leak: Boolean
    var bypassCache: Boolean
    var callback: js.Function3[RPCResponse,JSDictionaryAny, RPCRequest, void]
    var callbackParam: String
    var clientContext: Types.Object
    var containsCredentials: Boolean
    var contentType: String
    var data:Types.Object| JSArray[Types.Object]
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
@JSName("RPCRequest")
object RPCRequestStatic extends AbstractRPCRequestCompanion



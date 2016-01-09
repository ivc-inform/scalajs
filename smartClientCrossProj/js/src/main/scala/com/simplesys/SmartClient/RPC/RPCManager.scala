package com.simplesys.SmartClient.RPC

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.System.Types.Callback
import com.simplesys.SmartClient.System.{Types, AbstractClassCompanion, Class}
import com.simplesys.isc.System.Types.PromptStyle.PromptStyle
import com.simplesys.isc.System.Types.RPCTransport.RPCTransport
import com.simplesys.isc.System.Types.{void, HTMLString, URL}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait RPCManager extends Class {
}

@js.native
abstract trait AbstractRPCManagerCompanion extends AbstractClassCompanion {
    var actionURL: URL = js.native
    val ALL_GLOBALS: String = js.native
    var allowCrossDomainCalls: Boolean = js.native
    var allowIE9Leak: Boolean = js.native
    def cacheScreens(screenName: js.Array[String], callback: Callback, locale: String = js.native, requestProperties: RPCRequest = js.native): void = js.native
    def cancelQueue(transactionNum: Int = js.native): void = js.native
    def clearTransaction(transactionNum: Int): void = js.native
    def createScreen(screenName: String, globals: js.Array[String] = js.native): Canvas = js.native
    var credentialsURL: String = js.native
    var defaultPrompt: HTMLString = js.native
    var defaultTimeout: Int = js.native
    var defaultTransport: RPCTransport = js.native
    def exportContent(canvas: Canvas | js.Array[Canvas] | String, requestProperties: RPCRequest = js.native): void = js.native
    def exportImage(svgString: String, requestProperties: RPCRequest = js.native, callback: Callback = js.native): void = js.native
    var fetchDataPrompt: String = js.native
    def getCurrentTransactionId(): Int = js.native
    def getQueueTransactionId(): Int = js.native
    def handleError(response: RPCResponse, request: RPCRequest): void = js.native
    def handleTransportError(transactionNum: Int, status: Int, httpResponseCode: Int, httpResponseText: String): void = js.native
    def hasCurrentTransactionQueued(): Boolean = js.native
    val httpProxyURL: String = js.native
    def loadScreen(screenName: String, callback: Callback, globals: js.Array[String] = js.native, locale: String = js.native, requestProperties: RPCRequest = js.native): void = js.native
    def loginRequired(transactionNum: Int, rpcRequest: RPCRequest, rpcResponse: RPCResponse): void = js.native
    var loginRequiredMarker: String = js.native
    var loginStatusCodeMarker: String = js.native
    var loginSuccessMarker: String = js.native
    var maxLoginAttemptsExceededMarker: String = js.native
    var promptCursor: String = js.native
    var promptDelay: Int = js.native
    var promptStyle: PromptStyle = js.native
    def queueSent(requests: js.Array[RPCRequest]): void = js.native
    var removeDataPrompt: HTMLString = js.native
    def requestsArePending(): Boolean = js.native
    def resendTransaction(transactionNum: Int): void = js.native
    var saveDataPrompt: HTMLString = js.native
    var screenLoaderURL: URL = js.native
    def send(data: js.Any, callback: Callback, requestParams: RPCRequest): void = js.native
    def sendProxied(request: RPCRequest): void = js.native
    def sendQueue(callback: Callback): void = js.native
    def sendRequest(rpcRequest: RPCRequest): void = js.native
    var showPrompt: Boolean = js.native
    def startQueue(shouldQueue: Boolean): Boolean = js.native
    def suspendTransaction(transaction: Int): void = js.native
    var timeoutErrorMessage: String = js.native
    var useCursorTracker: Boolean = js.native
    val useHttpProxy: Boolean = js.native
    var useXmlHttpRequest: Boolean = js.native
    var validateDataPrompt: HTMLString = js.native
    def xmlHttpRequestAvailable(): Boolean = js.native
}

@js.native
object RPCManager extends AbstractRPCManagerCompanion        

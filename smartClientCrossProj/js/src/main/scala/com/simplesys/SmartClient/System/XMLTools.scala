package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.RPC.RPCRequest
import com.simplesys.System.Types._
import com.simplesys.Types1.JSArray

import scala.scalajs.js
import scala.scalajs.js.{Object, |}

@js.native
trait XMLTools extends Class

@js.native
abstract trait AbstractXMLToolsCompanion extends AbstractClassCompanion {
    def disableIEXMLHackaround: void = js.native
    def loadWSDL(wsdlURL: URL, callback: Callback, requestProperties: RPCRequest = js.native, autoLoadImports: Boolean = js.native): void = js.native
    def loadXML(URL: URL, callback: Callback, requestProperties: RPCRequest = js.native): void = js.native
    def loadXMLSchema(schemaURL: URL, callback: Callback, requestProperties: RPCRequest = js.native, autoLoadImports: Boolean = js.native): void = js.native
    def nativeXMLAvailable(): Boolean = js.native
    def parseXML(xmlText: String): XMLDocument = js.native
    def selectNodes(element: XMLDocument | XMLElement | String, expression: XPath, namespaces: String = js.native): JSArray[XMLNode] = js.native
    def selectNumber(element: XMLDocument | XMLElement | String, expression: XPath, namespaces: String = js.native): Int = js.native
    def selectObjects(obj: js.Object, xPath: XPath): JSArray[js.Object] = js.native
    def selectString(element: XMLDocument | XMLElement | String, expression: XPath, namespaces: String = js.native): String = js.native
    def serializeToString(inputDocument: String): XMLDocument = js.native
    def toJS(element: XMLElement | XMLDocument): js.Object = js.native
    def transformNodes(inputDocument: XMLDocument, styleSheet: XMLDocument): String = js.native
}

@js.native
object XMLTools extends AbstractXMLToolsCompanion {
    type XMLTools = XMLTools.type

}


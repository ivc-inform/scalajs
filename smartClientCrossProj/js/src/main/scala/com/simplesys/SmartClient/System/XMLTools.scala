package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.RPC.RPCRequest
import com.simplesys.SmartClient.System.Types._
import com.simplesys.isc.System.Types.URL

import scala.scalajs.js
import scala.scalajs.js.{Object, |}

@js.native
trait XMLTools extends Class

@js.native
abstract trait AbstractXMLToolsCompanion extends AbstractClassCompanion {
    def disableIEXMLHackaround: Unit = js.native
    def loadWSDL(wsdlURL: URL, callback: Callback, requestProperties: RPCRequest = js.native, autoLoadImports: Boolean = js.native): Unit = js.native
    def loadXML(URL: URL, callback: Callback, requestProperties: RPCRequest = js.native): Unit = js.native
    def loadXMLSchema(schemaURL: URL, callback: Callback, requestProperties: RPCRequest = js.native, autoLoadImports: Boolean = js.native): Unit = js.native
    def nativeXMLAvailable(): Boolean = js.native
    def parseXML(xmlText: String): XMLDocument = js.native
    def selectNodes(element: XMLDocument | XMLElement | String, expression: XPath, namespaces: String = js.native): js.Array[XMLNode] = js.native
    def selectNumber(element: XMLDocument | XMLElement | String, expression: XPath, namespaces: String = js.native): Int = js.native
    def selectObjects(obj: Types.Object, xPath: XPath): js.Array[Types.Object] = js.native
    def selectString(element: XMLDocument | XMLElement | String, expression: XPath, namespaces: String = js.native): String = js.native
    def serializeToString(inputDocument: String): XMLDocument = js.native
    def toJS(element: XMLElement | XMLDocument): Types.Object = js.native
    def transformNodes(inputDocument: XMLDocument, styleSheet: XMLDocument): String = js.native
}

@js.native
object XMLTools extends AbstractXMLToolsCompanion {
    type XMLTools = XMLTools.type

}


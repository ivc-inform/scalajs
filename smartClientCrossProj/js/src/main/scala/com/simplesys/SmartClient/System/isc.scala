package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.Control._
import com.simplesys.SmartClient.Grids._
import com.simplesys.System.Types.{Callback, ID, void}
import com.simplesys.System._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.|

abstract trait Properties

@js.native
@JSName("isc")
object iscStatic extends JSObject {
    def addDefaults(destination: JSObject, source: JSObject): JSObject = js.native
    def addProperties(destination: JSObject, propsArray: JSArray[JSObject]): JSObject = js.native
    def ask(message: String, callback: js.Function1[Boolean, _] = js.native, properties: Dialog = js.native): void = js.native
    def askForValue(message: String, callback: js.Function1[JSAny, _] = js.native, properties: Dialog = js.native): void = js.native
    def clearPrompt(): void = js.native
    def clone(obj: JSObject): JSObject = js.native
    def confirm(message: String, callback: Callback = js.native, properties: Dialog = js.native): void = js.native
    def dismissCurrentDialog(): void = js.native
    def echo(value: JSAny): String = js.native
    def echoAll(value: JSAny): String = js.native
    def echoLeaf(value: JSAny): String = js.native
    def eval(expression: String): JSAny = js.native
    def firstKey(obj: JSObject): String = js.native
    def getIconLeft(icon: JSObject): Int = js.native
    def getIconPageRect(icon: JSObject): JSArray[Int] = js.native
    def getIconRect(icon: JSObject): JSArray[Int] = js.native
    def getIconTop(icon: JSObject): Int = js.native
    def getKeyForValue(value: Int, valueMap: JSDictionary[JSObject], defaultKey: JSAny): JSAny = js.native
    def getKeys(obj: JSObject): JSArray[String] = js.native
    def getValueForKey(value: Int, valueMap: JSDictionary[JSObject], defaultKey: JSAny): JSAny = js.native
    def getValues(obj: JSObject): JSArrayAny = js.native
    def logEcho(value: JSAny, message: String): void = js.native
    def logEchoAll(value: JSAny, message: String): void = js.native
    def logWarn(message: String, category: String = js.native): void = js.native
    def makeReverseMap(valueMap: JSDictionary[JSObject]): JSDictionary[JSObject] = js.native
    def overwriteClass(): void = js.native
    def propertyDefined(obj: JSObject, propertyName: String): Boolean = js.native
    def say(message: String, callback: Callback = js.native, properties: Dialog = js.native): void = js.native
    def setAutoDraw(enable: Boolean = js.native): void = js.native
    def setScreenReaderMode(newState: Boolean): void = js.native
    def shallowClone(obj: JSObject | JSArray[JSObject]): JSObject | JSArray[JSObject] = js.native
    def showFadingPrompt(message: String, duration: Int, callback: Callback = js.native, properties: Dialog = js.native): void = js.native
    def showLoginDialog(loginFunc: js.Function2[JSDictionary[String], js.Function1[Boolean, void], void], properties: LoginDialog = js.native): void = js.native
    def showPrompt(message: String, properties: Dialog = js.native): void = js.native
    def sortObject(obj: JSObject, comparator: js.Function): JSObject = js.native
    def sortObjectByProperties(obj: JSObject, comparator: js.Function): JSObject = js.native
    def timeStamp(): Int = js.native
    def warn(message: String, callback: Callback = js.native, properties: Dialog = js.native): void = js.native

    val params: com.simplesys.SmartClient.System.params.type = js.native
    val Log: AbstractLogCompanion = js.native

    def error(message: String, identifier: ID = js.native, callback: Callback = js.native): void = js.native
    def info(message: String, identifier: ID = js.native, callback: Callback = js.native): void = js.native
    def ok(message: String, identifier: ID = js.native, callback: Callback = js.native): void = js.native
    def infos(grid: ListGrid, identifier: ID = js.native, callback: Callback = js.native): void = js.native
    def errors(grid: ListGrid, identifier: ID = js.native, callback: Callback = js.native): void = js.native
}



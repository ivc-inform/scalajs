package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.Control._
import com.simplesys.SmartClient.Grids.ListGrid
import com.simplesys.System.Types.{Callback, ID, void}
import com.simplesys.Types1.{JSAny, JSArray, JSArrayAny, JSDictionary}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.|

abstract trait Properties

@js.native
@JSName("isc")
object iscStatic extends js.Object {
    def addDefaults(destination: js.Object, source: js.Object): js.Object = js.native
    def addProperties(destination: js.Object, propsArray: JSArray[js.Object]): js.Object = js.native
    def ask(message: String, callback: js.Function1[Boolean, _] = js.native, properties: Dialog = js.native): void = js.native
    def askForValue(message: String, callback: js.Function1[JSAny, _] = js.native, properties: Dialog = js.native): void = js.native
    def clearPrompt(): void = js.native
    def clone(obj: js.Object): js.Object = js.native
    def confirm(message: String, callback: Callback = js.native, properties: Dialog = js.native): void = js.native
    def dismissCurrentDialog(): void = js.native
    def echo(value: JSAny): String = js.native
    def echoAll(value: JSAny): String = js.native
    def echoLeaf(value: JSAny): String = js.native
    def eval(expression: String): JSAny = js.native
    def firstKey(obj: js.Object): String = js.native
    def getIconLeft(icon: js.Object): Int = js.native
    def getIconPageRect(icon: js.Object): JSArray[Int] = js.native
    def getIconRect(icon: js.Object): JSArray[Int] = js.native
    def getIconTop(icon: js.Object): Int = js.native
    def getKeyForValue(value: Int, valueMap: JSDictionary[js.Object], defaultKey: JSAny): JSAny = js.native
    def getKeys(obj: js.Object): JSArray[String] = js.native
    def getValueForKey(value: Int, valueMap: JSDictionary[js.Object], defaultKey: JSAny): JSAny = js.native
    def getValues(obj: js.Object): JSArrayAny = js.native
    def logEcho(value: JSAny, message: String): void = js.native
    def logEchoAll(value: JSAny, message: String): void = js.native
    def logWarn(message: String, category: String = js.native): void = js.native
    def makeReverseMap(valueMap: JSDictionary[js.Object]): JSDictionary[js.Object] = js.native
    def overwriteClass(): void = js.native
    def propertyDefined(obj: js.Object, propertyName: String): Boolean = js.native
    def say(message: String, callback: Callback = js.native, properties: Dialog = js.native): void = js.native
    def setAutoDraw(enable: Boolean = js.native): void = js.native
    def setScreenReaderMode(newState: Boolean): void = js.native
    def shallowClone(obj: js.Object | JSArray[js.Object]): js.Object | JSArray[js.Object] = js.native
    def showFadingPrompt(message: String, duration: Int, callback: Callback = js.native, properties: Dialog = js.native): void = js.native
    def showLoginDialog(loginFunc: js.Function2[JSDictionary[String], js.Function1[Boolean, void], void], properties: LoginDialog = js.native): void = js.native
    def showPrompt(message: String, properties: Dialog = js.native): void = js.native
    def sortObject(obj: js.Object, comparator: js.Function): js.Object = js.native
    def sortObjectByProperties(obj: js.Object, comparator: js.Function): js.Object = js.native
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



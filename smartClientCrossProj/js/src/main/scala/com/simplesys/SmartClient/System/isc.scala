package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.Control._
import com.simplesys.SmartClient.System.Types.Callback
import com.simplesys.System.Types.void
import com.simplesys.common.Strings._
import com.simplesys.types.{JSArray, JSDictionary, JSAny, JSArrayAny}

import scala.reflect.ClassTag
import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.|

abstract trait Properties

@js.native
@JSName("isc")
object iscStatic extends Types.Object {
    def addDefaults(destination: Types.Object, source: Types.Object): Types.Object = js.native
    def addProperties(destination: Types.Object, propsArray: JSArray[Types.Object]): Types.Object = js.native
    def ask(message: String, callback: js.Function1[Boolean, _] = js.native, properties: Dialog = js.native): void = js.native
    def askForValue(message: String, callback: js.Function1[JSAny, _] = js.native, properties: Dialog = js.native): void = js.native
    def clearPrompt(): void = js.native
    def clone(obj: Types.Object): Types.Object = js.native
    def confirm(message: String, callback: Callback = js.native, properties: Dialog = js.native): void = js.native
    def dismissCurrentDialog(): void = js.native
    def echo(value: JSAny): String = js.native
    def echoAll(value: JSAny): String = js.native
    def echoLeaf(value: JSAny): String = js.native
    def eval(expression: String): JSAny = js.native
    def firstKey(obj: Types.Object): String = js.native
    def getIconLeft(icon: Types.Object): Int = js.native
    def getIconPageRect(icon: Types.Object): JSArray[Int] = js.native
    def getIconRect(icon: Types.Object): JSArray[Int] = js.native
    def getIconTop(icon: Types.Object): Int = js.native
    def getKeyForValue(value: Int, valueMap: JSDictionary[Types.Object], defaultKey: JSAny): JSAny = js.native
    def getKeys(obj: Types.Object): JSArray[String] = js.native
    def getValueForKey(value: Int, valueMap: JSDictionary[Types.Object], defaultKey: JSAny): JSAny = js.native
    def getValues(obj: Types.Object): JSArrayAny = js.native
    def logEcho(value: JSAny, message: String): void = js.native
    def logEchoAll(value: JSAny, message: String): void = js.native
    def logWarn(message: String, category: String = js.native): void = js.native
    def makeReverseMap(valueMap: JSDictionary[Types.Object]): JSDictionary[Types.Object] = js.native
    def overwriteClass(): void = js.native
    def propertyDefined(obj: Types.Object, propertyName: String): Boolean = js.native
    def say(message: String, callback: Callback = js.native, properties: Dialog = js.native): void = js.native
    def setAutoDraw(enable: Boolean = js.native): void = js.native
    def setScreenReaderMode(newState: Boolean): void = js.native
    def shallowClone(obj: Types.Object | JSArray[Types.Object]): Types.Object | JSArray[Types.Object] = js.native
    def showFadingPrompt(message: String, duration: Int, callback: Callback = js.native, properties: Dialog = js.native): void = js.native
    def showLoginDialog(loginFunc: js.Function2[JSDictionary[String], js.Function1[Boolean, void], void], properties: LoginDialog = js.native): void = js.native
    def showPrompt(message: String, properties: Dialog = js.native): void = js.native
    def sortObject(obj: Types.Object, comparator: js.Function): Types.Object = js.native
    def sortObjectByProperties(obj: Types.Object, comparator: js.Function): Types.Object = js.native
    def timeStamp(): Int = js.native
    def warn(message: String, callback: Callback = js.native, properties: Dialog = js.native): void = js.native

    val params: com.simplesys.SmartClient.System.params.type = js.native
    val Log: AbstractLogCompanion = js.native
}



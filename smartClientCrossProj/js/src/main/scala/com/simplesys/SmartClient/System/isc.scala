package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.Control.inst.{Dialog, LoginDialog}
import com.simplesys.SmartClient.System.Types.Callback

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
object isc extends Types.Object {
    def addDefaults(destination: Types.Object, source: Types.Object): Types.Object = js.native
    def addProperties(destination: Types.Object, propsArray: js.Array[Types.Object]): Types.Object = js.native
    def ask(message: String, callback: Callback = js.native, properties: Dialog = js.native): Unit = js.native
    def askForValue(message: String, callback: Callback = js.native, properties: Dialog = js.native): Unit = js.native
    def clearPrompt(): Unit = js.native
    def clone(obj: Types.Object): Types.Object = js.native
    def confirm(message: String, callback: Callback = js.native, properties: Dialog = js.native): Unit = js.native
    def defineClass(className: String, superClass: inst.Class = js.native): inst.Class = js.native
    def dismissCurrentDialog(): Unit = js.native
    def echo(value: js.Any): String = js.native
    def echoAll(value: js.Any): String = js.native
    def echoLeaf(value: js.Any): String = js.native
    def eval(expression: String): js.Any = js.native
    def firstKey(obj: Types.Object): String = js.native
    def getIconLeft(icon: Types.Object): Int = js.native
    def getIconPageRect(icon: Types.Object): js.Array[Int] = js.native
    def getIconRect(icon: Types.Object): js.Array[Int] = js.native
    def getIconTop(icon: Types.Object): Int = js.native
    def getKeyForValue(value: Int, valueMap: js.Dictionary[Types.Object], defaultKey: js.Any): js.Any = js.native
    def getKeys(obj: Types.Object): js.Array[String] = js.native
    def getValueForKey(value: Int, valueMap: js.Dictionary[Types.Object], defaultKey: js.Any): js.Any = js.native
    def getValues(obj: Types.Object): js.Array[js.Any] = js.native
    def logEcho(value: js.Any, message: String): Unit = js.native
    def logEchoAll(value: js.Any, message: String): Unit = js.native
    def logWarn(message: String, category: String = js.native): Unit = js.native
    def makeReverseMap(valueMap: js.Dictionary[Types.Object]): js.Dictionary[Types.Object] = js.native
    def overwriteClass(): Unit = js.native
    def propertyDefined(obj: Types.Object, propertyName: String): Boolean = js.native
    def say(message: String, callback: Callback = js.native, properties: Dialog = js.native):Unit = js.native
    def setAutoDraw(enable: Boolean = js.native): Unit = js.native
    def setScreenReaderMode(newState: Boolean): Unit = js.native
    def shallowClone(obj: Types.Object | js.Array[Types.Object]): Types.Object | js.Array[Types.Object] = js.native
    def showFadingPrompt(message: String, duration: Int, callback: Callback = js.native, properties: Dialog = js.native): Unit = js.native
    def showLoginDialog(loginFunc: js.Function2[js.Dictionary[String], js.Function1[Boolean, Unit], Unit], properties: LoginDialog = js.native): Unit = js.native
    def showPrompt(message: String, properties: Dialog = js.native): Unit = js.native
    def sortObject(obj: Types.Object, comparator: js.Function): Types.Object = js.native
    def sortObjectByProperties(obj: Types.Object, comparator: js.Function): Types.Object = js.native
    def timeStamp(): Int = js.native
    def warn(message: String, callback: Callback = js.native, properties: Dialog = js.native):Unit = js.native

    val params : com.simplesys.SmartClient.System.params.type = js.native
}



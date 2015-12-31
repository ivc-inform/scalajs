package com.simplesys.SmartClient.System.inst

import com.simplesys.SmartClient.System.Types
import com.simplesys.isc.System.Types.LogPriority._

import scala.scalajs.js

@js.native
trait Class extends Types.Object {
    type classHandler <: this.type

    def addAutoChild(childName: String, defaults: js.Dictionary[Types.Object]): Class
    def addProperties(arguments: js.Dictionary[Types.Object]): Types.Object
    var addPropertiesOnCreate: Boolean
    def addPropertyList(list: js.Array[js.Dictionary[Types.Object]]): Types.Object
    def clearLogPriority(category: String): Unit
    def createAutoChild(childName: String, defaults: js.Dictionary[Types.Object]): this.type
    def destroy(): Unit
    def delayCall(methodName: String, arrayArgs: js.Array[Any] = js.native, time: Number = js.native): String
    def echo(obj: js.Any): String
    def echoAll(obj: js.Any): String
    def echoLeaf(obj: js.Any): String
    def evaluate(expression: String, evalArgs: js.Dictionary[Types.Object]): Types.Object
    def fireCallback(callback: Types.Callback, argNames: String = js.native, args: js.Array[Types.Object] = js.native): js.Any
    def getCallTrace(args: Types.Object = js.native): Unit
    def GetClass(): this.type
    def getClassName(): String
    def getDefaultLogPriority(): LogPriority
    def getID(): String
    def getStackTrace(): String
    def getSuperClass(): String
    def ignore(`object`: Types.Object, methodName: String): Boolean
    var init: js.ThisFunction0[classHandler, Unit]
    def isA(className: String): Boolean
    def isObserving(`object`: Types.Object, methodName: String): Boolean
    def logDebug(message: String, category: String = js.native): Unit
    def logError(message: String, category: String = js.native): Unit
    def logFatal(message: String, category: String = js.native): Unit
    def logInfo(message: String, category: String = js.native): Unit
    def logWarn(message: String, category: String = js.native): Unit
    def logIsDebugEnabled(category: String = js.native): Unit
    def logIsInfoEnabled(category: String = js.native): Unit
    def logIsErrorEnabled(category: String = js.native): Unit
    def logIsWarnEnabled(category: String = js.native): Unit
    def logIsEnabledFor(priority: LogPriority, category: String): Unit
    def map(methodName: String, items: js.Array[js.Any]): js.Array[js.Any]
    def observe(`object`: Types.Object, methodName: String, action: String = js.native): Boolean
    def setDefaultLogPriority(category: String, priority: LogPriority): Unit
    def setLogPriority(category: String, priority: LogPriority): Unit
    def setProperties(arguments: js.Dictionary[Types.Object]): Unit
    def setProperty(propertyName: String, newValue: js.Any): Unit
    def Super(methodName: String, args: js.Array[js.Any], nativeArgs: js.Array[js.Any] = js.native): js.Any
}

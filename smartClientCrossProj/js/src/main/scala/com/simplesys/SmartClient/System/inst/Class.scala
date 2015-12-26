package com.simplesys.SmartClient.System.inst

import com.simplesys.SmartClient.System.Types
import com.simplesys.isc.System.Types.LogPriority._

import scala.scalajs.js

@js.native
trait Class extends Types.Object {
    def addAutoChild(childName: String, defaults: js.Dictionary[Types.Object]): Class = js.native
    def addProperties(arguments: js.Dictionary[Types.Object]): Types.Object = js.native
    var addPropertiesOnCreate: Boolean = js.native
    def addPropertyList(list: js.Array[js.Dictionary[Types.Object]]): Types.Object = js.native
    def clearLogPriority(category: String): Unit = js.native
    def createAutoChild(childName: String, defaults: js.Dictionary[Types.Object]): this.type = js.native
    def destroy(): Unit = js.native
    def delayCall(methodName: String, arrayArgs: js.Array[Any] = js.native, time: Number = js.native): String = js.native
    def echo(obj: js.Any): String = js.native
    def echoAll(obj: js.Any): String = js.native
    def echoLeaf(obj: js.Any): String = js.native
    def evaluate(expression: String, evalArgs: js.Dictionary[Types.Object]): Types.Object = js.native
    def fireCallback(callback: Types.Callback, argNames: String = js.native, args: js.Array[Types.Object] = js.native): js.Any = js.native
    def getCallTrace(args: Types.Object = js.native): Unit = js.native
    def GetClass(): this.type = js.native
    def getClassName(): String = js.native
    def getDefaultLogPriority(): LogPriority = js.native
    def getID(): String = js.native
    def getStackTrace(): String = js.native
    def getSuperClass(): String = js.native
    def ignore(`object`: Types.Object, methodName: String): Boolean = js.native
    def init(arguments: js.Dictionary[Types.Object]): Unit = js.native
    def isA(className: String): Boolean = js.native
    def isObserving(`object`: Types.Object, methodName: String): Boolean = js.native
    def logDebug(message: String, category: String = js.native): Unit = js.native
    def logError(message: String, category: String = js.native): Unit = js.native
    def logFatal(message: String, category: String = js.native): Unit = js.native
    def logInfo(message: String, category: String = js.native): Unit = js.native
    def logWarn(message: String, category: String = js.native): Unit = js.native
    def logIsDebugEnabled(category: String = js.native): Unit = js.native
    def logIsInfoEnabled(category: String = js.native): Unit = js.native
    def logIsErrorEnabled(category: String = js.native): Unit = js.native
    def logIsWarnEnabled(category: String = js.native): Unit = js.native
    def logIsEnabledFor(priority: LogPriority, category: String): Unit = js.native
    def map(methodName: String, items: js.Array[js.Any]): js.Array[js.Any] = js.native
    def observe(`object`: Types.Object, methodName: String, action: String = js.native): Boolean = js.native
    def setDefaultLogPriority(category: String, priority: LogPriority): Unit = js.native
    def setLogPriority(category: String, priority: LogPriority): Unit = js.native
    def setProperties(arguments: js.Dictionary[Types.Object]): Unit = js.native
    def setProperty(propertyName: String, newValue: js.Any): Unit = js.native
    def Super(methodName: String, args: Array[js.Any], nativeArgs: Array[js.Any] = js.native): js.Any = js.native
}

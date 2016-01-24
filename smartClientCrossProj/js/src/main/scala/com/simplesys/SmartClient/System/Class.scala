package com.simplesys.SmartClient.System

import com.simplesys.System.Types.LogPriority.LogPriority
import com.simplesys.System.Types.{ID, void}
import com.simplesys.types.{JSAny, JSArrayAny}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait Class extends Types.Object {
    type classHandler <: this.type

    def addAutoChild(childName: String, defaults: js.Dictionary[Types.Object]): Class
    def addProperties(arguments: js.Dictionary[JSAny]): Types.Object
    var addPropertiesOnCreate: Boolean
    def addPropertyList(list: js.Array[js.Dictionary[Types.Object]]): Types.Object
    def clearLogPriority(category: String): void
    def createAutoChild(childName: String, defaults: js.Dictionary[Types.Object]): this.type
    def destroy(): void
    def delayCall(methodName: String, arrayArgs: js.Array[Any] = js.native, time: Int = js.native): String
    def echo(obj: JSAny): String
    def echoAll(obj: JSAny): String
    def echoLeaf(obj: JSAny): String
    def evaluate(expression: String, evalArgs: js.Dictionary[Types.Object]): Types.Object
    def fireCallback(callback: Types.Callback, argNames: String = js.native, args: js.Array[Types.Object] = js.native): JSAny
    def getCallTrace(args: Types.Object = js.native): void
    def GetClass(): this.type
    def getClassName(): String
    def getDefaultLogPriority(): LogPriority
    def getID(): String
    def getStackTrace(): String
    def getSuperClass(): String
    def ignore(`object`: Types.Object, methodName: String): Boolean
    var identifier: ID
    var init: js.ThisFunction1[classHandler, JSArrayAny , _]
    def isA(className: String): Boolean
    def isObserving(`object`: Types.Object, methodName: String): Boolean
    def logDebug(message: String, category: String = js.native): void
    def logError(message: String, category: String = js.native): void
    def logFatal(message: String, category: String = js.native): void
    def logInfo(message: String, category: String = js.native): void
    def logWarn(message: String, category: String = js.native): void
    def logIsDebugEnabled(category: String = js.native): void
    def logIsInfoEnabled(category: String = js.native): void
    def logIsErrorEnabled(category: String = js.native): void
    def logIsWarnEnabled(category: String = js.native): void
    def logIsEnabledFor(priority: LogPriority, category: String): void
    def map(methodName: String, items: JSArrayAny): JSArrayAny
    def observe(`object`: Types.Object, methodName: String, action: String = js.native): Boolean
    def setDefaultLogPriority(category: String, priority: LogPriority): void
    def setLogPriority(category: String, priority: LogPriority): void
    def setProperties(arguments: js.Dictionary[Types.Object]): void
    def setProperty(propertyName: String, newValue: JSAny): void
    def Super(methodName: String, args: JSArrayAny, nativeArgs: JSArrayAny = js.native): JSAny
}

@js.native
abstract trait AbstractClassCompanion extends Types.Object {
    def addClassProperties(arguments: js.Dictionary[Types.Object]): Types.Object = js.native
    def addMethods(arguments: js.Dictionary[Types.Object]): Types.Object = js.native
    def addProperties(arguments: js.Dictionary[Types.Object]): Types.Object = js.native
    def addPropertyList(list: js.Array[js.Dictionary[Types.Object]]): Types.Object = js.native
    def changeDefaults(defaultsName: String, newDefaults: Types.Object): void = js.native
    def clearLogPriority(category: String): void = js.native
    def delayCall(methodName: String, arrayArgs: js.Array[Any] = js.native, time: Int = js.native, target: Types.Object = js.native): String = js.native
    def echo(obj: JSAny): String = js.native
    def echoAll(obj: JSAny): String = js.native
    def echoLeaf(obj: JSAny): String = js.native
    def evaluate(expression: String, evalArgs: js.Dictionary[Types.Object]): Types.Object = js.native
    def fireCallback(callback: Types.Callback, argNames: String = js.native, args: js.Array[Types.Object] = js.native, target: Types.Object = js.native): JSAny = js.native
    def getCallTrace(args: Types.Object = js.native): void = js.native
    def getClassName(): String = js.native
    def getDefaultLogPriority(): LogPriority = js.native
    def getInstanceProperty(property: String): void = js.native
    def getStackTrace(): String = js.native
    def getSuperClass(): String = js.native
    def isA(className: String): Boolean = js.native
    def isFrameworkClass: Boolean = js.native
    def isMethodSupported(methodName: String): Boolean = js.native
    def logDebug(message: String, category: String = js.native): void = js.native
    def logError(message: String, category: String = js.native): void = js.native
    def logFatal(message: String, category: String = js.native): void = js.native
    def logInfo(message: String, category: String = js.native): void = js.native
    def logWarn(message: String, category: String = js.native): void = js.native
    def logIsDebugEnabled(category: String = js.native): void = js.native
    def logIsInfoEnabled(category: String = js.native): void = js.native
    def logIsErrorEnabled(category: String = js.native): void = js.native
    def logIsWarnEnabled(category: String = js.native): void = js.native
    def logIsEnabledFor(priority: LogPriority, category: String): void = js.native
    def map(methodName: String, items: JSArrayAny): JSArrayAny = js.native
    def markAsFrameworkClass(): void = js.native
    def modifyFrameworkDone(): void = js.native
    def modifyFrameworkStart(): void = js.native
    def markUnsupportedMethods(messageTemplate: String = js.native, methodNames: js.Array[String] = js.native): void = js.native
    def egisterStringMethods(methodName: String, argumentString: String): void = js.native
    def setDefaultLogPriority(category: String, priority: LogPriority): void = js.native
    def setInstanceProperty(property: String, value: JSAny): void = js.native
    def setLogPriority(category: String, priority: LogPriority): void = js.native
    def setProperties(arguments: js.Dictionary[Types.Object]): void = js.native
    def Super(methodName: String, args: JSArrayAny, nativeArgs: JSArrayAny = js.native): JSAny = js.native
}

@js.native
@JSName("Class")
object ClassStatic extends AbstractClassCompanion



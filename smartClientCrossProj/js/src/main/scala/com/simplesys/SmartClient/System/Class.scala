package com.simplesys.SmartClient.System

import com.simplesys.System.Types.LogPriority.LogPriority
import com.simplesys.System.Types.{Callback, ID, void}
import com.simplesys.System._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait Class extends JSObject {
    type classHandler <: this.type

    def addAutoChild(childName: String, defaults: JSDictionary[JSObject]): Class
    def addProperties(arguments: JSDictionaryAny): JSObject
    var addPropertiesOnCreate: Boolean
    def addPropertyList(list: JSArray[JSDictionary[JSObject]]): JSObject
    def clearLogPriority(category: String): void
    def createAutoChild(childName: String, defaults: JSDictionary[JSObject]): this.type
    var destroy: js.ThisFunction0[classHandler, _]
    def delayCall(methodName: String, arrayArgs: JSArray[Any] = js.native, time: Int = js.native): String
    def echo(obj: JSAny): String
    def echoAll(obj: JSAny): String
    def echoLeaf(obj: JSAny): String
    def evaluate(expression: String, evalArgs: JSDictionary[JSObject]): JSObject
    def fireCallback(callback: Callback, argNames: String = js.native, args: JSArray[JSObject] = js.native): JSAny
    def getCallTrace(args: JSObject = js.native): void
    def GetClass(): this.type
    def getClassName(): String
    def getDefaultLogPriority(): LogPriority
    def getID(): String
    def getIdentifier(): String
    def getStackTrace(): String
    def getSuperClass(): String
    def ignore(`object`: JSObject, methodName: String): Boolean
    var identifier: ID
    var init: js.ThisFunction1[classHandler, JSArrayAny , _]
    def isA(className: String): Boolean
    def isObserving(`object`: JSObject, methodName: String): Boolean
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
    def observe(`object`: JSObject, methodName: String, action: String): Boolean
    def observe(`object`: JSObject, methodName: String, action: js.Function): Boolean
    def setDefaultLogPriority(category: String, priority: LogPriority): void
    def setLogPriority(category: String, priority: LogPriority): void
    def setProperties(arguments: JSDictionary[JSObject]): void
    def setProperty(propertyName: String, newValue: JSAny): void
    def Super(methodName: String, args: JSArrayAny = js.native, nativeArgs: JSArrayAny = js.native): JSAny
}

@js.native
abstract trait AbstractClassCompanion extends JSObject {
    def addClassProperties(arguments: JSDictionary[JSObject]): JSObject = js.native
    def addMethods(arguments: JSDictionary[JSObject]): JSObject = js.native
    def addProperties(arguments: JSDictionary[JSObject]): JSObject = js.native
    def addPropertyList(list: JSArray[JSDictionary[JSObject]]): JSObject = js.native
    def changeDefaults(defaultsName: String, newDefaults: JSObject): void = js.native
    def clearLogPriority(category: String): void = js.native
    def delayCall(methodName: String, arrayArgs: JSArray[Any] = js.native, time: Int = js.native, target: JSObject = js.native): String = js.native
    def echo(obj: JSAny): String = js.native
    def echoAll(obj: JSAny): String = js.native
    def echoLeaf(obj: JSAny): String = js.native
    def evaluate(expression: String, evalArgs: JSDictionary[JSObject]): JSObject = js.native
    def fireCallback(callback: Callback, argNames: String = js.native, args: JSArray[JSObject] = js.native, target: JSObject = js.native): JSAny = js.native
    def getCallTrace(args: JSObject = js.native): void = js.native
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
    def markUnsupportedMethods(messageTemplate: String = js.native, methodNames: JSArray[String] = js.native): void = js.native
    def egisterStringMethods(methodName: String, argumentString: String): void = js.native
    def setDefaultLogPriority(category: String, priority: LogPriority): void = js.native
    def setInstanceProperty(property: String, value: JSAny): void = js.native
    def setLogPriority(category: String, priority: LogPriority): void = js.native
    def setProperties(arguments: JSDictionary[JSObject]): void = js.native
    def Super(methodName: String, args: JSArrayAny, nativeArgs: JSArrayAny = js.native): JSAny = js.native
}

@js.native
@JSName("Class")
object ClassStatic extends AbstractClassCompanion



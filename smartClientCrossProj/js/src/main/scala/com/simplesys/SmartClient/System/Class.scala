package com.simplesys.SmartClient.System

import com.simplesys.System.Types.LogPriority.LogPriority
import com.simplesys.System.Types.void

import scala.language.experimental.macros
import scala.scalajs.js

@js.native
trait Class extends Types.Object {
    type classHandler <: this.type

    def addAutoChild(childName: String, defaults: js.Dictionary[Types.Object]): Class
    def addProperties(arguments: js.Dictionary[Types.Object]): Types.Object
    var addPropertiesOnCreate: Boolean
    def addPropertyList(list: js.Array[js.Dictionary[Types.Object]]): Types.Object
    def clearLogPriority(category: String): void
    def createAutoChild(childName: String, defaults: js.Dictionary[Types.Object]): this.type
    def destroy(): void
    def delayCall(methodName: String, arrayArgs: js.Array[Any] = js.native, time: Int = js.native): String
    def echo(obj: js.Any): String
    def echoAll(obj: js.Any): String
    def echoLeaf(obj: js.Any): String
    def evaluate(expression: String, evalArgs: js.Dictionary[Types.Object]): Types.Object
    def fireCallback(callback: Types.Callback, argNames: String = js.native, args: js.Array[Types.Object] = js.native): js.Any
    def getCallTrace(args: Types.Object = js.native): void
    def GetClass(): this.type
    def getClassName(): String
    def getDefaultLogPriority(): LogPriority
    def getID(): String
    def getStackTrace(): String
    def getSuperClass(): String
    def ignore(`object`: Types.Object, methodName: String): Boolean
    var init: js.ThisFunction0[classHandler, void]
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
    def map(methodName: String, items: js.Array[js.Any]): js.Array[js.Any]
    def observe(`object`: Types.Object, methodName: String, action: String = js.native): Boolean
    def setDefaultLogPriority(category: String, priority: LogPriority): void
    def setLogPriority(category: String, priority: LogPriority): void
    def setProperties(arguments: js.Dictionary[Types.Object]): void
    def setProperty(propertyName: String, newValue: js.Any): void
    def Super(methodName: String, args: js.Array[js.Any], nativeArgs: js.Array[js.Any] = js.native): js.Any
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
    def echo(obj: js.Any): String = js.native
    def echoAll(obj: js.Any): String = js.native
    def echoLeaf(obj: js.Any): String = js.native
    def evaluate(expression: String, evalArgs: js.Dictionary[Types.Object]): Types.Object = js.native
    def fireCallback(callback: Types.Callback, argNames: String = js.native, args: js.Array[Types.Object] = js.native, target: Types.Object = js.native): js.Any = js.native
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
    def map(methodName: String, items: js.Array[js.Any]): js.Array[js.Any] = js.native
    def markAsFrameworkClass(): void = js.native
    def modifyFrameworkDone(): void = js.native
    def modifyFrameworkStart(): void = js.native
    def markUnsupportedMethods(messageTemplate: String = js.native, methodNames: js.Array[String] = js.native): void = js.native
    def egisterStringMethods(methodName: String, argumentString: String): void = js.native
    def setDefaultLogPriority(category: String, priority: LogPriority): void = js.native
    def setInstanceProperty(property: String, value: js.Any): void = js.native
    def setLogPriority(category: String, priority: LogPriority): void = js.native
    def setProperties(arguments: js.Dictionary[Types.Object]): void = js.native
    def Super(methodName: String, args: js.Array[js.Any], nativeArgs: js.Array[js.Any] = js.native): js.Any = js.native
}

package companion {
  @js.native
  object Class extends AbstractClassCompanion
}

package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.System.inst._
import com.simplesys.SmartClient.System.props.{AbstractPropsClass, ClassProps}
import com.simplesys.isc.System.Types.LogPriority.LogPriority
import com.simplesys.macros.PropsToMap

import scala.language.experimental.macros
import scala.reflect.ClassTag
import scala.scalajs.js
import scala.scalajs.js.Dictionary
import scala.scalajs.js.annotation.ScalaJSDefined


@js.native
abstract class AbstractClassCompanion extends Types.Object {
    def addClassProperties(arguments: js.Dictionary[Types.Object]): Types.Object = js.native
    def addMethods(arguments: js.Dictionary[Types.Object]): Types.Object = js.native
    def addProperties(arguments: js.Dictionary[Types.Object]): Types.Object = js.native
    def addPropertyList(list: js.Array[js.Dictionary[Types.Object]]): Types.Object = js.native
    def changeDefaults(defaultsName: String, newDefaults: Types.Object): Unit = js.native
    def clearLogPriority(category: String): Unit = js.native
    def delayCall(methodName: String, arrayArgs: js.Array[Any] = js.native, time: Number = js.native, target: Types.Object = js.native): String = js.native
    def echo(obj: js.Any): String = js.native
    def echoAll(obj: js.Any): String = js.native
    def echoLeaf(obj: js.Any): String = js.native
    def evaluate(expression: String, evalArgs: js.Dictionary[Types.Object]): Types.Object = js.native
    def fireCallback(callback: Types.Callback, argNames: String = js.native, args: js.Array[Types.Object] = js.native, target: Types.Object = js.native): js.Any = js.native
    def getCallTrace(args: Types.Object = js.native): Unit = js.native
    def getClassName(): String = js.native
    def getDefaultLogPriority(): LogPriority = js.native
    def getInstanceProperty(property: String): Unit = js.native
    def getStackTrace(): String = js.native
    def getSuperClass(): String = js.native
    def isA(className: String): Boolean = js.native
    def isFrameworkClass: Boolean = js.native
    def isMethodSupported(methodName: String): Boolean = js.native
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
    def markAsFrameworkClass(): Unit = js.native
    def modifyFrameworkDone(): Unit = js.native
    def modifyFrameworkStart(): Unit = js.native
    def markUnsupportedMethods(messageTemplate: String = js.native, methodNames: js.Array[String] = js.native): Unit = js.native
    def egisterStringMethods(methodName: String, argumentString: String): Unit = js.native
    def setDefaultLogPriority(category: String, priority: LogPriority): Unit = js.native
    def setInstanceProperty(property: String, value: js.Any): Unit = js.native
    def setLogPriority(category: String, priority: LogPriority): Unit = js.native
    def setProperties(arguments: js.Dictionary[Types.Object]): Unit = js.native
    def Super(methodName: String, args: js.Array[js.Any], nativeArgs: js.Array[js.Any] = js.native): js.Any = js.native
}

@ScalaJSDefined
object Class extends AbstractClassCompanion {
    private val sCApply = new SCApply[Class, ClassProps]()
    def create(props: ClassProps): Class = sCApply create props
}

package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.System.props.{AbstractPropsClass, ClassProps}
import com.simplesys.isc.System.Types.LogPriority._
import com.simplesys.macros.PropsToMap

import scala.reflect.ClassTag
import scala.scalajs.js
import scala.scalajs.js.Dictionary
import scala.scalajs.js.annotation.ScalaJSDefined
import PropsToMap._
import scala.language.experimental.macros
import scala.reflect.macros.whitebox.Context

@ScalaJSDefined
abstract class SCApply[T <: Types.Object, P <: AbstractPropsClass](implicit ct: ClassTag[T]) extends Types.Object {

    lazy protected val className: String = ct.runtimeClass.getSimpleName.capitalize

    def create(obj: P): T = {
        val props = materializePropsMap getMap obj
        //val props = Map.empty[String, Any]

        def props2Dict(abstractProps: Map[String, Any]): js.Dictionary[Types.Object] = {
            val result = Dictionary.empty[Types.Object]
            abstractProps.foreach { case (key, value) => result(key) = value.asInstanceOf[Types.Object] }
            result
        }

        js.Dynamic.global.isc.selectDynamic(className).create(props2Dict(props)).asInstanceOf[T]
    }
}

@js.native
abstract class AbstractClassCompanion[T <: Types.Object, P <: AbstractPropsClass](implicit ct: ClassTag[T]) extends SCApply[T, P] {
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
    var isFrameworkClass: Boolean = js.native
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
    def Super(methodName: String, args: Array[js.Any], nativeArgs: Array[js.Any] = js.native): js.Any = js.native
}

@js.native
object Class extends AbstractClassCompanion[inst.Class, ClassProps] {

}

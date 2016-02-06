package com.simplesys.SmartClient.System

import com.simplesys.System.Types.LogPriority.LogPriority
import com.simplesys.System.Types.void
import com.simplesys.Types1.JSArray

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.|

@js.native
trait Log extends Class {
}

@js.native
abstract trait AbstractLogCompanion extends AbstractClassCompanion {
    def applyLogPriorities(settings: Types.Object): void = js.native
    def clear(): void = js.native
    def clearPriority(category: String, obj: Class | Types.Object): void = js.native
    var defaultPriority: LogPriority = js.native
    def getDefaultPriority(obj: Class | Types.Object): LogPriority = js.native
    def getLogPriorities(obj: Class | Types.Object, overridesOnly: Boolean = js.native): Types.Object = js.native
    def getMessages(): JSArray[String] = js.native
    def getPriority(category: String, obj: Class | Types.Object): LogPriority = js.native
    def isEnabledFor(category: String, priority: LogPriority): void = js.native
    var messageCount: Int = js.native
    def setDefaultPriority(priority: String, obj: Class | Types.Object): void = js.native
    def setPriority(category: String, priority: LogPriority, obj: Class | Types.Object): void = js.native
    def show(): void = js.native
    var stackTracePriority: LogPriority = js.native
    def timeMethod(obj: Types.Object, methodName: String): void = js.native
    def traceLogMessage(messagePattern: String, prefix: String = js.native): void = js.native
    def traceMethod(obj: Types.Object, methodName: String): void = js.native
}

@js.native
object Log extends AbstractLogCompanion

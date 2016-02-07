package com.simplesys.SmartClient.System

import com.simplesys.System.Types.LogPriority.LogPriority
import com.simplesys.System.Types.void
import com.simplesys.System.JSArray

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.|

@js.native
trait Log extends Class {
}

@js.native
abstract trait AbstractLogCompanion extends AbstractClassCompanion {
    def applyLogPriorities(settings: js.Object): void = js.native
    def clear(): void = js.native
    def clearPriority(category: String, obj: Class | js.Object): void = js.native
    var defaultPriority: LogPriority = js.native
    def getDefaultPriority(obj: Class | js.Object): LogPriority = js.native
    def getLogPriorities(obj: Class | js.Object, overridesOnly: Boolean = js.native): js.Object = js.native
    def getMessages(): JSArray[String] = js.native
    def getPriority(category: String, obj: Class | js.Object): LogPriority = js.native
    def isEnabledFor(category: String, priority: LogPriority): void = js.native
    var messageCount: Int = js.native
    def setDefaultPriority(priority: String, obj: Class | js.Object): void = js.native
    def setPriority(category: String, priority: LogPriority, obj: Class | js.Object): void = js.native
    def show(): void = js.native
    var stackTracePriority: LogPriority = js.native
    def timeMethod(obj: js.Object, methodName: String): void = js.native
    def traceLogMessage(messagePattern: String, prefix: String = js.native): void = js.native
    def traceMethod(obj: js.Object, methodName: String): void = js.native
}

@js.native
object Log extends AbstractLogCompanion

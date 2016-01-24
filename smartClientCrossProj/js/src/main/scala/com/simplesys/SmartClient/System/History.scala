package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.System.Types.Callback
import com.simplesys.System.Types.void
import com.simplesys.types.JSAny

import scala.scalajs.js

@js.native
object History extends Types.Object {
    type History = History.type

    def addHistoryEntry(id: String, title: String = js.native, data: JSAny = js.native): void = js.native
    def getCurrentHistoryId(): String = js.native
    def getHistoryData(id: String): JSAny = js.native
    def readyForAnotherHistoryEntry(): Boolean = js.native
    def registerCallback(callback: Callback, requiresData: Boolean, isAdditional: Boolean = js.native): Int = js.native
    def setHistoryTitle(title: String): void = js.native
    def unregisterCallback(id: String): Boolean = js.native
}

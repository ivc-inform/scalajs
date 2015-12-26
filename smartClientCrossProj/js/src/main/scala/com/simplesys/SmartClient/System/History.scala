package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.System.Types.Callback

import scala.scalajs.js

@js.native
object History extends Types.Object {
    type History = History.type

    def addHistoryEntry(id: String, title: String = js.native, data: js.Any = js.native): Unit = js.native
    def getCurrentHistoryId(): String = js.native
    def getHistoryData(id: String): js.Any = js.native
    def readyForAnotherHistoryEntry(): Boolean = js.native
    def registerCallback(callback: Callback, requiresData: Boolean, isAdditional: Boolean = js.native): Int = js.native
    def setHistoryTitle(title: String): Unit = js.native
    def unregisterCallback(id: String): Boolean = js.native
}

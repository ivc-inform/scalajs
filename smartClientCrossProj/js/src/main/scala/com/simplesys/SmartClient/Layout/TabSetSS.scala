package com.simplesys.SmartClient.Layout

import com.simplesys.SmartClient.Layout.tabSet.Tab
import com.simplesys.System.JSArray
import com.simplesys.System.Types.void

import scala.scalajs.js

@js.native
trait TabSetSS extends TabSet {
    def filter4Visiblity(tabs: JSArray[Tab]): JSArray[Tab]
    def addTabs(tabs: JSArray[Tab], position: Int = js.native): void
    def addTab(tab: Tab, position: Int = js.native): void
    def removeTab(tab: Tab, position: Int = js.native): void
    def getLength(): Int
    def isEmpty(): Boolean
    def isNotEmpty(): Boolean
}


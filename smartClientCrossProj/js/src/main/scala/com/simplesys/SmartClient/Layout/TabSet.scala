package com.simplesys.SmartClient.Layout

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Layout.tabSet.Tab
import com.simplesys.System.Types.{ID, void}

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait TabSet extends Canvas {
    def addTabs(tabs: Tab | Array[Tab], position: Int): void
    var animateTabScrolling: Boolean
    //var canAddTabs: Boolean Не работает
    var canCloseTabs: Boolean
    var canReorderTabs: Boolean
    var locateTabsBy: String
    def removeTabs(tabs: Tab | ID | String | Int): void
    def setCanCloseTabs(canCloseTabs: Boolean): void
    var showTabScroller: Boolean
    var tabs: js.Array[Tab]
    var tabSelected: js.Function5[Int, Canvas, ID, Tab, String, _]
    var tabsReordered: js.Function0[_]
    var useIOSTabs: Boolean
    var useSimpleTabs: Boolean
}




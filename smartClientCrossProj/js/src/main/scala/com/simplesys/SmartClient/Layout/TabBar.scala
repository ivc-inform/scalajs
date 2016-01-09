package com.simplesys.SmartClient.Layout


import com.simplesys.SmartClient.Foundation.AbstractCanvasCompanion
import com.simplesys.SmartClient.Layout.tabSet.Tab.Tab
import com.simplesys.SmartClient.System.KeyIdentifier
import com.simplesys.isc.System.Types.{void, SCClassName, SCImgURL}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait TabBar extends ToolBar {
    val baseLineCapSize: Int
    val baseLineSrc: SCImgURL
    val baseLineThickness: Int
    var breadth: Int
    val closeTabKeys: js.Array[KeyIdentifier]
    val defaultTabSize: Int
    val moreTab: Tab
    var moreTabCount: Int
    def selectTab(tabNum: Int): void
    val showMoreTab: Boolean
    val tabs: js.Array[Tab]
}

@js.native
abstract trait AbstractTabBarCompanion extends AbstractCanvasCompanion {
}

@js.native
object TabBar extends AbstractTabBarCompanion        

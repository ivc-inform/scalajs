package com.simplesys.SmartClient.Layout


import com.simplesys.SmartClient.Foundation.AbstractCanvasCompanion
import com.simplesys.SmartClient.Layout.tabSet.Tab
import com.simplesys.SmartClient.System.KeyIdentifier
import com.simplesys.System.Types.{void, SCClassName, SCImgURL}
import com.simplesys.System.JSArray

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait TabBar extends Toolbar {
    val baseLineCapSize: Int
    val baseLineSrc: SCImgURL
    val baseLineThickness: Int
    var breadth: Int
    val closeTabKeys: JSArray[KeyIdentifier]
    val defaultTabSize: Int
    val moreTab: Tab
    var moreTabCount: Int
    def selectTab(tabNum: Int): void
    val showMoreTab: Boolean
    val tabs: JSArray[Tab]
}




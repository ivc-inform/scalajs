package com.simplesys.SmartClient.Layout.tabSet

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Layout.TabSet
import com.simplesys.SmartClient.System.Types
import com.simplesys.System.Types.{HTMLString, SCImgURL, void}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.|

@js.native
class Tab extends Types.Object {
    var canClose: Boolean = js.native
    var canEditTitle: Boolean = js.native
    var canReorder: Boolean = js.native
    var closeIcon: SCImgURL = js.native
    var closeIconSize: Int = js.native
    var disabled: Boolean = js.native
    var icon: SCImgURL = js.native
    var iconHeight: Int = js.native
    var iconSize: Int = js.native
    var iconWidth: Int = js.native
    var ID: String = js.native
    var name: String = js.native
    var pane: String | Canvas = js.native
    var paneMargin: Int = js.native
    var pickerTitle: HTMLString = js.native
    var prompt: HTMLString = js.native
    var tabDeselected: js.Function7[TabSet, Int, Canvas, String, Tab, Tab, String, Boolean] = js.native
    var tabSelected: js.Function6[TabSet, Int, Canvas, String, Tab, String, void] = js.native
    var title: HTMLString = js.native
    var width: Int = js.native
}

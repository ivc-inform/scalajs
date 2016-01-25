package com.simplesys.SmartClient.Control.menu

import com.simplesys.SmartClient.Control.{MenuSS, Menu}
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Grids.listGrid.ListGridRecord
import com.simplesys.SmartClient.System.KeyIdentifier
import com.simplesys.System.Types.{HTMLString, SCImgURL, void}

import scala.scalajs.js
import scala.scalajs.js.Array

@js.native
trait BaseMenuItem[M <: Menu] extends ListGridRecord {
    var action: js.Function1[void, _]
    var canSelectParent: Boolean
    var checked: Boolean
    var checkIf: js.Function3[Canvas, M, this.type, Boolean]
    var click: js.Function4[Canvas, this.type, M, Int, _]
    var disabledIcon: String
    var dynamicIcon: js.Function3[Canvas, M, this.type, SCImgURL]
    var dynamicTitle: js.Function3[Canvas, M, this.type, String]
    var enableIf: js.Function3[Canvas, M, this.type, Boolean]
    var fetchSubmenus: Boolean
    val icon: String
    val iconHeight: Int
    val iconWidth: Int
    val keys: Array[KeyIdentifier]
    val keyTitle: String
    val submenu: M
    val title: HTMLString
}

@js.native
trait MenuItem extends BaseMenuItem[Menu]



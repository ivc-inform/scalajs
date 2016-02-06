package com.simplesys.SmartClient.Control.menu

import com.simplesys.SmartClient.Control.{MenuSS, Menu}
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Grids.listGrid.ListGridRecord
import com.simplesys.SmartClient.System.KeyIdentifier
import com.simplesys.System.Types.{HTMLString, SCImgURL, void}
import com.simplesys.Types.JSArray

import scala.scalajs.js


@js.native
trait MenuItem extends ListGridRecord {
    var action: js.Function1[void, _]
    var canSelectParent: Boolean
    var checked: Boolean
    var checkIf: js.Function3[Canvas, Menu, MenuItem, Boolean]
    var click: js.Function4[Canvas, MenuItem, Menu, Int, _]
    var disabledIcon: String
    var dynamicIcon: js.Function3[Canvas, Menu, MenuItem, SCImgURL]
    var dynamicTitle: js.Function3[Canvas, Menu, MenuItem, String]
    var enableIf: js.Function3[Canvas, Menu, MenuItem, Boolean]
    var fetchSubmenus: Boolean
    val icon: String
    val iconHeight: Int
    val iconWidth: Int
    val keys: JSArray[KeyIdentifier]
    val keyTitle: String
    val submenu: Menu
    val title: HTMLString
}




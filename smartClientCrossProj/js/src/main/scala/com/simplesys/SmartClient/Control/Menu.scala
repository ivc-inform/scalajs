package com.simplesys.SmartClient.Control

import com.simplesys.SmartClient.Control.menu.MenuItem
import com.simplesys.SmartClient.Foundation.{Canvas, Img}
import com.simplesys.SmartClient.Grids.listGrid.{ListGridRecord, ListGridField}
import com.simplesys.SmartClient.Grids.{AbstractListGridCompanion, ListGrid}
import com.simplesys.SmartClient.Layout.NavigationBar
import com.simplesys.SmartClient.System.{Types, Tree}
import com.simplesys.SmartClient.System.Types.Criteria
import com.simplesys.isc.System.Types.PanelPlacement.PanelPlacement
import com.simplesys.isc.System.Types._
import com.simplesys.isc.System.Types.MenuFieldID.MenuFieldID

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait Menu extends ListGrid[ListGridField, MenuItem] {
    var autoDismiss: Boolean
    var autoDismissOnBlur: Boolean
    var cancelButtonTitle: HTMLString
    var canSelectParentItems: Boolean
    var cascadeAutoDismiss: Boolean
    var checkmarkDisabledImage: Img
    var checkmarkImage: Img
    var data: js.Array[MenuItem]
    var fillSpaceStyleName: CSSStyleName
    def getItem(item: Int): MenuItem
    def getItemNum(item: MenuItem): Int
    def getItems(): Array[MenuItem]
    def getSubmenu(item: MenuItem | Int): Menu
    var iconBodyStyleName: CSSStyleName
    val iconFieldDefaults: ListGridField
    val iconFieldProperties: ListGridField
    val iconFillSpaceStyleName: CSSStyleName
    val iconHeight: Int
    val iconWidth: Int
    var itemClick: js.Function2[Types.Object, Int, Boolean]
    var items: Array[MenuItem]
    val keyFieldDefaults: ListGridField
    val keyFieldProperties: ListGridField
    val menuButtonWidth: Int
    val navigationBar: NavigationBar with AutoChild
    val navStack: Canvas with AutoChild
    val placement: PanelPlacement
    def setData(items: Array[MenuItem]): void
    def setItemChecked(item: MenuItem | Int, newState: Boolean = js.native): Boolean
    def setItemEnabled(item: MenuItem | Int, newState: Boolean = js.native): Boolean
    def setItemIcon(item: MenuItem | Int, newIcon: SCImgURL, newDisabledIcon: SCImgURL = js.native): Boolean
    def setItemProperties(item: MenuItem | Int, properties: js.Dictionary[js.Any]): void
    def setItems(items: Array[MenuItem]): void
    def setItemTitle(item: MenuItem | Int, newTitle: String): Boolean
    def setShowIcons(showIcons: Boolean): void
    def setShowSubmenus(showSubmenus: Boolean): void
    var showAnimationEffect: String
    val showIcons: Boolean
    val showKeys: Boolean
    def showSubmenu(item: MenuItem | Int): void
    var showSubmenus: Boolean
    var submenuConstructor: SCClassName
    var submenuDirection: String
    var submenuDisabledImage: Img
    val submenuFieldDefaults: ListGridField
    val submenuFieldProperties: ListGridField
    val submenuImage: Img
    val target: Canvas
    val titleFieldDefaults: ListGridField
    val titleFieldProperties: ListGridField
    var useKeys: Boolean
}

@js.native
abstract trait AbstractMenuCompanion extends AbstractListGridCompanion {
}

@js.native
object Menu extends AbstractMenuCompanion        

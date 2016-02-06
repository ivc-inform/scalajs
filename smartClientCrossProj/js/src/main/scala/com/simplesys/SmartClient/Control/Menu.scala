package com.simplesys.SmartClient.Control

import com.simplesys.SmartClient.Control.menu.MenuItem
import com.simplesys.SmartClient.Foundation.{Canvas, Img}
import com.simplesys.SmartClient.Grids.Grid
import com.simplesys.SmartClient.Grids.listGrid.ListGridField
import com.simplesys.SmartClient.Layout.NavigationBar
import com.simplesys.SmartClient.System.Types
import com.simplesys.System.Types.PanelPlacement.PanelPlacement
import com.simplesys.System.Types._
import com.simplesys.types.{JSArray, JSDictionaryAny, JSAny}

import scala.scalajs.js
import scala.scalajs.js._

@js.native
trait Menu extends Grid[ListGridField, MenuItem] {
    var autoDismiss: Boolean
    var autoDismissOnBlur: Boolean
    var cancelButtonTitle: HTMLString
    var canSelectParentItems: Boolean
    var cascadeAutoDismiss: Boolean
    var checkmarkDisabledImage: Img
    var checkmarkImage: Img
    var data: JSArray[MenuItem]
    var fillSpaceStyleName: CSSStyleName
    def getItem(item: Int): MenuItem
    def getItemNum(item: MenuItem): Int
    def getItems(): JSArray[MenuItem]
    def getSubmenu(item: MenuItem | Int): MenuItem
    var iconBodyStyleName: CSSStyleName
    val iconFieldDefaults: ListGridField
    val iconFieldProperties: ListGridField
    val iconFillSpaceStyleName: CSSStyleName
    val iconHeight: Int
    val iconWidth: Int
    var itemClick: js.Function2[Types.Object, Int, Boolean]
    var items: JSArray[MenuItem]
    val keyFieldDefaults: ListGridField
    val keyFieldProperties: ListGridField
    val menuButtonWidth: Int
    val navigationBar: NavigationBar with AutoChild
    val navStack: Canvas with AutoChild
    val placement: PanelPlacement
    def setData(items: JSArray[MenuItem]): void
    def setItemChecked(item: MenuItem | Int, newState: Boolean = js.native): Boolean
    def setItemEnabled(item: MenuItem | Int, newState: Boolean = js.native): Boolean
    def setItemIcon(item: MenuItem | Int, newIcon: SCImgURL, newDisabledIcon: SCImgURL = js.native): Boolean
    def setItemProperties(item: MenuItem | Int, properties: JSDictionaryAny): void
    def setItems(items: JSArray[MenuItem]): void
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




package com.simplesys.SmartClient.Control

import com.simplesys.SmartClient.Control.menu.MenuSSItem
import com.simplesys.SmartClient.Foundation.{Canvas, Img}
import com.simplesys.SmartClient.Grids.Grid
import com.simplesys.SmartClient.Grids.listGrid.ListGridField
import com.simplesys.SmartClient.Layout.{NavigationBar, TabSet}
import com.simplesys.System.Types.PanelPlacement._
import com.simplesys.System.Types._
import com.simplesys.Types1._

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait MenuSS extends Grid[ListGridField, MenuSSItem] {
    def addItem(item: MenuSSItem, pos: Int): void
    def addItems(items: JSArray[MenuSSItem], pos: Int): void
    def addItemProperties(identifier: ID, properties: MenuSS): void
    def removeItem(item: MenuSSItem | ID): void
    def removeItems(items: JSArray[MenuSSItem | ID]): void
    def filter4Visiblity(items: JSArray[MenuSSItem]): void
    def replaceItems(oldItems: JSArray[MenuSSItem| ID], newItems: JSArray[MenuSSItem]): void
    def setData(data: JSAny): void
    val owner: Canvas
    def setOwner(owner: Canvas): MenuSS
    def setTabSet(tabSet: TabSet): MenuSS

    //From Menu
    var autoDismiss: Boolean
    var autoDismissOnBlur: Boolean
    var cancelButtonTitle: HTMLString
    var canSelectParentItems: Boolean
    var cascadeAutoDismiss: Boolean
    var checkmarkDisabledImage: Img
    var checkmarkImage: Img
    var data: JSArray[MenuSSItem]
    var fillSpaceStyleName: CSSStyleName
    def getItem(item: Int): MenuSSItem
    def getItemNum(item: MenuSSItem): Int
    def getItems(): JSArray[MenuSSItem]
    def getSubmenu(item: MenuSSItem | Int): MenuSS
    var iconBodyStyleName: CSSStyleName
    val iconFieldDefaults: ListGridField
    val iconFieldProperties: ListGridField
    val iconFillSpaceStyleName: CSSStyleName
    val iconHeight: Int
    val iconWidth: Int
    var itemClick: js.Function2[js.Object, Int, Boolean]
    var items: JSArray[MenuSSItem]
    val keyFieldDefaults: ListGridField
    val keyFieldProperties: ListGridField
    val menuButtonWidth: Int
    val navigationBar: NavigationBar with AutoChild
    val navStack: Canvas with AutoChild
    val placement: PanelPlacement
    def setData(items: JSArray[MenuSSItem]): void
    def setItemChecked(item: MenuSSItem | Int, newState: Boolean = js.native): Boolean
    def setItemEnabled(item: MenuSSItem | Int, newState: Boolean = js.native): Boolean
    def setItemIcon(item: MenuSSItem | Int, newIcon: SCImgURL, newDisabledIcon: SCImgURL = js.native): Boolean
    def setItemProperties(item: MenuSSItem | Int, properties: JSDictionaryAny): void
    def setItems(items: JSArray[MenuSSItem]): void
    def setItemTitle(item: MenuSSItem | Int, newTitle: String): Boolean
    def setShowIcons(showIcons: Boolean): void
    def setShowSubmenus(showSubmenus: Boolean): void
    var showAnimationEffect: String
    val showIcons: Boolean
    val showKeys: Boolean
    def showSubmenu(item: MenuSSItem | Int): void
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


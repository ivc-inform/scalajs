package com.simplesys.SmartClient.Layout

import com.simplesys.SmartClient.Control.Button
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Layout.navigationBar.NavigationButton
import com.simplesys.isc.System.Types.DeviceMode.DeviceMode
import com.simplesys.isc.System.Types.NavigationDirection.NavigationDirection
import com.simplesys.isc.System.Types.PageOrientation.PageOrientation
import com.simplesys.isc.System.Types.{HTMLString, AutoChild}
import com.simplesys.isc.System.Types.CurrentPane.CurrentPane

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait SplitPane extends Layout {
    var addHistoryEntries: Boolean
    val animateNavigationBarStateChanges: Boolean
    val autoNavigate: Boolean
    val backButton: NavigationButton with AutoChild
    var currentPane: CurrentPane
    var detailNavigationControl: Canvas
    var detailPane: Canvas
    var detailPaneTitleTemplate: HTMLString
    var detailTitle: HTMLString
    var detailToolButtons: js.Array[Canvas]
    val detailToolStrip: NavigationBar with AutoChild
    val deviceMode: DeviceMode
    var downClick: js.ThisFunction0[callbackHandler, Unit]
    val leftButton: NavigationButton with AutoChild
    var listPane: Canvas
    var listPaneTitleTemplate: HTMLString
    var listTitle: HTMLString
    val listToolStrip: NavigationButton with AutoChild
    def navigateDetailPane(title: HTMLString = js.native): Unit
    def navigateListPane(title: HTMLString = js.native): Unit
    def navigatePane(target: CurrentPane = js.native, title: HTMLString = js.native, source: CurrentPane = js.native): Unit
    val navigationBar: NavigationBar with AutoChild
    var navigationClick: js.ThisFunction0[callbackHandler, Unit]
    var navigationPane: Canvas
    var navigationTitle: HTMLString
    var pageOrientation: PageOrientation
    var paneChanged: js.ThisFunction1[callbackHandler, CurrentPane, Unit]
    def setAddHistoryEntries(addHistoryEntries: Boolean): Unit
    def setCurrentPane(newPane: CurrentPane): Unit
    def setDetailNavigationControl(control: Canvas): Unit
    def setDetailPane(pane: Canvas): Unit
    def setDetailPaneTitleTemplate(template: HTMLString): Unit
    def setDetailTitle(title: HTMLString): Unit
    def setDetailToolButtons(buttons: js.Array[Button]): Unit
    def setLeftButtonTitle(newTitle: HTMLString): Unit
    def setListPane(pane: Canvas): Unit
    def setListPaneTitleTemplate(template: HTMLString): Unit
    def setListTitle(title: HTMLString): Unit
    def setNavigationPane(pane: Canvas): Unit
    def setNavigationTitle(title: HTMLString): Unit
    def setPageOrientation(newOrientation: PageOrientation): Unit
    def setRightButtonTitle(newTitle: HTMLString): Unit
    def setShowLeftButton(show: Boolean): Unit
    def setShowRightButton(visible: Boolean): Unit
    def showDetailPane(detailPaneTitle: HTMLString = js.native, backButtonTitle: HTMLString = js.native, direction: NavigationDirection = js.native): Unit
    val showDetailToolStrip: Boolean
    var showLeftButton: Boolean
    def showListPane(listPaneTitle: HTMLString = js.native, backButtonTitle: HTMLString = js.native, direction: NavigationDirection = js.native): Unit
    val showListToolStrip: Boolean
    val showMiniNav: Boolean
    val showNavigationBar: Boolean
    def showNavigationPane(direction: NavigationDirection = js.native): Unit
    val showResizeBars:Boolean
    var showRightButton:Boolean
    var upClick: js.ThisFunction0[callbackHandler, Unit]
}

@js.native
abstract trait AbstractSplitPaneCompanion extends AbstractLayoutCompanion {
}

@js.native
object SplitPane extends AbstractSplitPaneCompanion        

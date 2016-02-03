package com.simplesys.SmartClient.Layout

import com.simplesys.SmartClient.Control.Button
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Layout.navigationBar.NavigationButton
import com.simplesys.System.Types.DeviceMode.DeviceMode
import com.simplesys.System.Types.NavigationDirection.NavigationDirection
import com.simplesys.System.Types.PageOrientation.PageOrientation
import com.simplesys.System.Types.{void, HTMLString, AutoChild}
import com.simplesys.System.Types.CurrentPane.CurrentPane
import com.simplesys.types.JSArray

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait SplitPanel extends Layout {
    var addHistoryEntries: Boolean
    val animateNavigationBarStateChanges: Boolean
    val autoNavigate: Boolean
    val backButton: NavigationButton with AutoChild
    var currentPane: CurrentPane
    var detailNavigationControl: Canvas
    var detailPane: Canvas
    var detailPaneTitleTemplate: HTMLString
    var detailTitle: HTMLString
    var detailToolButtons: JSArray[Canvas]
    val detailToolStrip: NavigationBar with AutoChild
    val deviceMode: DeviceMode
    var downClick: js.ThisFunction0[callbackHandler, void]
    val leftButton: NavigationButton with AutoChild
    var listPane: Canvas
    var listPaneTitleTemplate: HTMLString
    var listTitle: HTMLString
    val listToolStrip: NavigationButton with AutoChild
    def navigateDetailPane(title: HTMLString = js.native): void
    def navigateListPane(title: HTMLString = js.native): void
    def navigatePane(target: CurrentPane = js.native, title: HTMLString = js.native, source: CurrentPane = js.native): void
    val navigationBar: NavigationBar with AutoChild
    var navigationClick: js.ThisFunction0[callbackHandler, void]
    var navigationPane: Canvas
    var navigationTitle: HTMLString
    var pageOrientation: PageOrientation
    var paneChanged: js.ThisFunction1[callbackHandler, CurrentPane, void]
    def setAddHistoryEntries(addHistoryEntries: Boolean): void
    def setCurrentPane(newPane: CurrentPane): void
    def setDetailNavigationControl(control: Canvas): void
    def setDetailPane(pane: Canvas): void
    def setDetailPaneTitleTemplate(template: HTMLString): void
    def setDetailTitle(title: HTMLString): void
    def setDetailToolButtons(buttons: JSArray[Button]): void
    def setLeftButtonTitle(newTitle: HTMLString): void
    def setListPane(pane: Canvas): void
    def setListPaneTitleTemplate(template: HTMLString): void
    def setListTitle(title: HTMLString): void
    def setNavigationPane(pane: Canvas): void
    def setNavigationTitle(title: HTMLString): void
    def setPageOrientation(newOrientation: PageOrientation): void
    def setRightButtonTitle(newTitle: HTMLString): void
    def setShowLeftButton(show: Boolean): void
    def setShowRightButton(visible: Boolean): void
    def showDetailPane(detailPaneTitle: HTMLString = js.native, backButtonTitle: HTMLString = js.native, direction: NavigationDirection = js.native): void
    val showDetailToolStrip: Boolean
    var showLeftButton: Boolean
    def showListPane(listPaneTitle: HTMLString = js.native, backButtonTitle: HTMLString = js.native, direction: NavigationDirection = js.native): void
    val showListToolStrip: Boolean
    val showMiniNav: Boolean
    val showNavigationBar: Boolean
    def showNavigationPane(direction: NavigationDirection = js.native): void
    val showResizeBars:Boolean
    var showRightButton:Boolean
    var upClick: js.ThisFunction0[callbackHandler, void]
}

@js.native
abstract trait AbstractSplitPaneCompanion extends AbstractLayoutCompanion {
}

@js.native
object SplitPane extends AbstractSplitPaneCompanion


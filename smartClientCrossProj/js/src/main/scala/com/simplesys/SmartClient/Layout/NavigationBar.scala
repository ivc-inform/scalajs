package com.simplesys.SmartClient.Layout

import com.simplesys.SmartClient.Foundation.{Label, Canvas}
import com.simplesys.SmartClient.Layout.navigationBar.NavigationBarViewState.NavigationBarViewState
import com.simplesys.SmartClient.Layout.navigationBar.{MiniNavControl, NavigationButton}
import com.simplesys.isc.System.Types.Alignment.Alignment
import com.simplesys.isc.System.Types.NavigationDirection.NavigationDirection
import com.simplesys.isc.System.Types.{AutoChild, HTMLString, SCImgURL}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait NavigationBar extends HLayout {
    var alwaysShowLeftButtonTitle: Boolean
    val animateStateChanges: Boolean
    var customNavControl: Canvas
    var downClick: js.ThisFunction0[callbackHandler, Unit]
    val leftButton: NavigationButton with AutoChild
    var leftButtonIcon: SCImgURL
    var leftButtonTitle: HTMLString
    val maxCenterOffset: Int
    val miniNavAlign: Alignment
    val miniNavControl: MiniNavControl with AutoChild
    var navigationClick: js.ThisFunction1[callbackHandler, NavigationDirection, Unit]
    val rightButton: NavigationButton with AutoChild
    var rightButtonIcon: SCImgURL
    var rightButtonTitle: HTMLString
    def setAlwaysShowLeftButtonTitle(newAlwaysShowLeftButtonTitle: Boolean): Unit
    def setCustomNavControl(controls: js.Array[String] | js.Array[Canvas]): Unit
    def setLeftButtonIcon(newIcon: SCImgURL): Unit
    def setRightButtonIcon(newIcon: SCImgURL): Unit
    def setLeftButtonTitle(newTitle: HTMLString): Unit
    def setRightButtonTitle(newTitle: HTMLString): Unit
    def setTitle(newTitle: HTMLString): Unit
    def setShortLeftButtonTitle(newShortLeftButtonTitle: HTMLString): Unit
    def setShowLeftButton(show: Boolean): Unit
    def setShowRightButton(show: Boolean): Unit
    def setViewState(viewState: NavigationBarViewState, direction: NavigationDirection = js.native): Unit
    var shortLeftButtonTitle: HTMLString
    var showLeftButton: Boolean
    var showMiniNavControl: Boolean
    var showRightButton: Boolean
    var title: HTMLString
    val titleLabel: Label with AutoChild
    var upClick: js.ThisFunction0[callbackHandler, Unit]
}

@js.native
abstract trait AbstractNavigationBarCompanion extends AbstractHLayoutCompanion {
}

@js.native
object NavigationBar extends AbstractNavigationBarCompanion        

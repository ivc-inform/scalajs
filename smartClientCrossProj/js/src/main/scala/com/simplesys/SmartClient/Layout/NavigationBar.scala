package com.simplesys.SmartClient.Layout

import com.simplesys.SmartClient.Foundation.{Label, Canvas}
import com.simplesys.SmartClient.Layout.navigationBar.NavigationBarViewState.NavigationBarViewState
import com.simplesys.SmartClient.Layout.navigationBar.{MiniNavControl, NavigationButton}
import com.simplesys.System.Types.Alignment.Alignment
import com.simplesys.System.Types.NavigationDirection.NavigationDirection
import com.simplesys.System.Types.{void, AutoChild, HTMLString, SCImgURL}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait NavigationBar extends HLayout {
    var alwaysShowLeftButtonTitle: Boolean
    val animateStateChanges: Boolean
    var customNavControl: Canvas
    var downClick: js.ThisFunction0[callbackHandler, void]
    val leftButton: NavigationButton with AutoChild
    var leftButtonIcon: SCImgURL
    var leftButtonTitle: HTMLString
    val maxCenterOffset: Int
    val miniNavAlign: Alignment
    val miniNavControl: MiniNavControl with AutoChild
    var navigationClick: js.ThisFunction1[callbackHandler, NavigationDirection, void]
    val rightButton: NavigationButton with AutoChild
    var rightButtonIcon: SCImgURL
    var rightButtonTitle: HTMLString
    def setAlwaysShowLeftButtonTitle(newAlwaysShowLeftButtonTitle: Boolean): void
    def setCustomNavControl(controls: js.Array[String] | js.Array[Canvas]): void
    def setLeftButtonIcon(newIcon: SCImgURL): void
    def setRightButtonIcon(newIcon: SCImgURL): void
    def setLeftButtonTitle(newTitle: HTMLString): void
    def setRightButtonTitle(newTitle: HTMLString): void
    def setTitle(newTitle: HTMLString): void
    def setShortLeftButtonTitle(newShortLeftButtonTitle: HTMLString): void
    def setShowLeftButton(show: Boolean): void
    def setShowRightButton(show: Boolean): void
    def setViewState(viewState: NavigationBarViewState, direction: NavigationDirection = js.native): void
    var shortLeftButtonTitle: HTMLString
    var showLeftButton: Boolean
    var showMiniNavControl: Boolean
    var showRightButton: Boolean
    var title: HTMLString
    val titleLabel: Label with AutoChild
    var upClick: js.ThisFunction0[callbackHandler, void]
}

@js.native
abstract trait AbstractNavigationBarCompanion extends AbstractHLayoutCompanion {
}

package companion {

import scala.scalajs.js

@js.native
   object NavigationBar extends AbstractNavigationBarCompanion
}


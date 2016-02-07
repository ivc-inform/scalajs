package com.simplesys.SmartClient.Control

import com.simplesys.SmartClient.Foundation.{Img, Label}
import com.simplesys.SmartClient.Layout.{Layout, Toolbar, Window}
import com.simplesys.System.Types._
import com.simplesys.System.JSArray

import scala.scalajs.js


@js.native
trait Dialog extends Window {
    def applyClick(): void
    val askIcon: SCImgURL
    val autoFocus: Boolean
    var buttonClick: js.Function2[Button, Int, _]
    val buttons: JSArray[Button]
    var cancelClick: js.Function1[void, _]
    val confirmIcon: SCImgURL
    var doneClick: js.Function1[void, _]
    val icon: SCImgURL
    val iconSize: Int
    val message: HTMLString
    val messageIcon: Img with AutoChild
    val messageLabel: Label with AutoChild
    val messageStack: Layout with AutoChild
    val messageStyle: CSSStyleName
    var noClick: js.Function1[void, _]
    var saveData: js.Function1[void, _]
    val sayIcon: SCImgURL
    def setButtons(newButtons: JSArray[Button]): void
    def setToolbarButtons(newButtons: JSArray[Button]): void
    val showToolbar:Boolean
    val toolbar:Toolbar
    val toolbarButtons: JSArray[Button]
    val warnIcon:SCImgURL
    var yesClick: js.Function1[void, _]
}




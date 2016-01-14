package com.simplesys.SmartClient.Control

import com.simplesys.SmartClient.Foundation.{Label, Img}
import com.simplesys.SmartClient.Layout.{Toolbar, Layout, AbstractWindowCompanion, Window}
import com.simplesys.System.Types._

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait Dialog extends Window {
    def applyClick(): void
    val askIcon: SCImgURL
    val autoFocus: Boolean
    var buttonClick: js.Function2[Button, Int, _]
    val buttons: Array[Button]
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
    def setButtons(newButtons: Array[Button]): void
    def setToolbarButtons(newButtons: Array[Button]): void
    val showToolbar:Boolean
    val toolbar:Toolbar
    val toolbarButtons: Array[Button]
    val warnIcon:SCImgURL
    var yesClick: js.Function1[void, _]
}

@js.native
abstract trait AbstractDialogCompanion extends AbstractWindowCompanion {
}

@js.native
   object Dialog extends AbstractDialogCompanion


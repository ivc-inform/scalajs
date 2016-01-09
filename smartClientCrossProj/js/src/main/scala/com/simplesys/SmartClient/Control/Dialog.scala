package com.simplesys.SmartClient.Control

import com.simplesys.SmartClient.Layout.{AbstractWindowCompanion, Window}
import com.simplesys.isc.System.Types.{SCImgURL, void}

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait Dialog extends Window {
    def applyClick():void
    val askIcon:SCImgURL
    val autoFocus:Boolean
    var buttonClick:js.Function2[Button, Int, _]
    val buttons: Array[Button]
    var cancelClick:js.Function1[void, _]
    val confirmIcon:SCImgURL
}

@js.native
abstract trait AbstractDialogCompanion extends AbstractWindowCompanion {
}

@js.native
object Dialog extends AbstractDialogCompanion        

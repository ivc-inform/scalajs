package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.System.{Class, Types}
import com.simplesys.System.Types2.{AutoChild, CSSStyleName, SCImgURL, void}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait ButtonItem extends CanvasItem {
    val autoFit: Boolean
    var baseStyle: CSSStyleName
    var button: Canvas with AutoChild
    var buttonConstructor: Class
    var buttonProperties: Types.Object
    var icon: SCImgURL
    def setShowFocusedAsOver(showFocusedAsOver: Boolean): void
    def setTitle(newTitle: String)
    var showFocusedAsOver: Boolean
}






package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.System.Class
import com.simplesys.System.Types.{AutoChild, CSSStyleName, SCImgURL, void}

import scala.scalajs.js

@js.native
trait ButtonItem extends CanvasItem {
    val autoFit: Boolean
    var baseStyle: CSSStyleName
    var button: Canvas with AutoChild
    var buttonConstructor: Class
    var buttonProperties: js.Object
    var icon: SCImgURL
    def setShowFocusedAsOver(showFocusedAsOver: Boolean): void
    def setTitle(newTitle: String)
    var showFocusedAsOver: Boolean
}






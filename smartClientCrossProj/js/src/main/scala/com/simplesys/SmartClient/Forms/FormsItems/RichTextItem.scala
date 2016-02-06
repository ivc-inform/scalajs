package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.System.Types.void
import com.simplesys.types.JSArray

import scala.scalajs.js

@js.native
trait RichTextItem extends CanvasItem {
    var controlGroups: JSArray[String]
    var moveFocusOnTab:Boolean
    def  setMoveFocusOnTab (moveFocusOnTab:Boolean):void
}



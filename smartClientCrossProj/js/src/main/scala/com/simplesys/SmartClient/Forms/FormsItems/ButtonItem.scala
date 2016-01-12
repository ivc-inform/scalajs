package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.System.{Types, Class}
import com.simplesys.System.Types.{void, SCImgURL, AutoChild, CSSStyleName}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait ButtonItem extends CanvasItem {
    val autoFit:Boolean
    var baseStyle:CSSStyleName
    var button: Canvas with AutoChild
    var buttonConstructor:Class
    var buttonProperties:Types.Object
    var icon:SCImgURL
    def setShowFocusedAsOver (showFocusedAsOver:Boolean):void
    def  setTitle (newTitle:String)
    var showFocusedAsOver:Boolean
}

@js.native
abstract trait AbstractButtonItemCompanion extends AbstractCanvasItemCompanion {
}

package companion {

import scala.scalajs.js

@js.native
   object ButtonItem extends AbstractButtonItemCompanion
}


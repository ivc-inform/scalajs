package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.SmartClient.Control.Button
import com.simplesys.SmartClient.Foundation.{Canvas, StatefulCanvas}
import com.simplesys.SmartClient.System.Class
import com.simplesys.isc.System.Types.CSSStyleName

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait ToolbarItem extends CanvasItem {
    var buttonBaseStyle:CSSStyleName
    var buttonConstructor:Class
    var buttonProperties:Button
    var buttons: Array[StatefulCanvas]
    var vertical:Boolean
}

@js.native
abstract trait AbstractToolbarItemCompanion extends AbstractCanvasItemCompanion {
}

@js.native
object ToolbarItem extends AbstractToolbarItemCompanion        

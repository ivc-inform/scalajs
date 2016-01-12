package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.SmartClient.Control.Button
import com.simplesys.SmartClient.Foundation.{Canvas, StatefulCanvas}
import com.simplesys.SmartClient.System.Class
import com.simplesys.System.Types.CSSStyleName

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

package companion {

import scala.scalajs.js

@js.native
   object ToolbarItem extends AbstractToolbarItemCompanion
}


package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.SmartClient.Control.Button
import com.simplesys.SmartClient.Foundation.{Canvas, StatefulCanvas}
import com.simplesys.SmartClient.System.Class
import com.simplesys.System.Types2.CSSStyleName
import com.simplesys.Types1.JSArray

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait ToolbarItem extends CanvasItem {
    var buttonBaseStyle:CSSStyleName
    var buttonConstructor:Class
    var buttonProperties:Button
    var buttons: JSArray[StatefulCanvas]
    var vertical:Boolean
}




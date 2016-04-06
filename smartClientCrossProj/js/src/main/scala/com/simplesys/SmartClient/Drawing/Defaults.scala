package com.simplesys.js.com.simplesys.SmartClient.Drawing

import com.simplesys.SmartClient.Drawing.Shadow
import com.simplesys.SmartClient.Drawing.radient.SimpleGradient
import com.simplesys.System.JSObject

import scala.scalajs.js

@js.native
trait Defaults extends JSObject {
}

@js.native
trait DrawRectDefaults extends Defaults {
    var top: Int
    var left: Int
    var width: Int
    var height: Int
    var rounding: Double
    var fillGradient: SimpleGradient
    var keepInParentRect: Boolean
    var lineWidth: Int
    var shadow: Shadow
}


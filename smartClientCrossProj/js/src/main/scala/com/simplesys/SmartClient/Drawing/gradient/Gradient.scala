package com.simplesys.SmartClient.Drawing.gradient

import com.simplesys.SmartClient.System.IscArray
import com.simplesys.System.{JSObject, JSUndefined}
import com.simplesys.System.Types.{CSSColor, ID}

import scala.scalajs.js

@js.native
trait Gradient extends JSObject {
    var colorStops: JSUndefined[IscArray[ColorStop]]
    var endColor: JSUndefined[CSSColor]
    var startColor: JSUndefined[CSSColor]
}


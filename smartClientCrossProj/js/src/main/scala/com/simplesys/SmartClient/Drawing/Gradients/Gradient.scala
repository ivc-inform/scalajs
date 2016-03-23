package com.simplesys.SmartClient.Drawing.Gradients

import com.simplesys.System.Types.{CSSColor, ID}
import com.simplesys.System.{JSArray, JSObject}

import scala.scalajs.js

@js.native
trait Gradient extends JSObject {
    val colorStops: JSArray[ColorStop]
    val endColor: CSSColor
    val id: ID
    val startColor: CSSColor
}


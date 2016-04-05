package com.simplesys.SmartClient.Drawing.radient

import com.simplesys.System.Types.{CSSColor, ID}
import com.simplesys.System.{JSArray, JSObject}

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
trait Gradient extends JSObject {
    var colorStops: JSArray[ColorStop]
    var endColor: CSSColor
    var id: ID
    var startColor: CSSColor
}


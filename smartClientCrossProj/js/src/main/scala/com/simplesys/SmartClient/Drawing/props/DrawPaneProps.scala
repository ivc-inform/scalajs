package com.simplesys.SmartClient.Drawing.props

import com.simplesys.SmartClient.Drawing.DrawItem
import com.simplesys.SmartClient.Drawing.radient.{Gradient, SimpleGradient}
import com.simplesys.SmartClient.Foundation.props.CanvasProps
import com.simplesys.SmartClient.System._
import com.simplesys.System.{JSArray, JSDictionary, JSDictionaryAny, JSUndefined}
import com.simplesys.option.{IntString, ScNone, ScOption}
import com.simplesys.props.AbstractClassProps

import scala.scalajs.js

class DrawPaneDefaults extends AbstractClassProps {
    var canFocus: ScOption[Boolean] = ScNone
    var width: ScOption[IntString[Int, String]] = ScNone
    var height: ScOption[IntString[Int, String]] = ScNone
    var gradients: ScOption[Seq[SimpleGradient]] = ScNone
}

class DrawPaneProps extends CanvasProps {
    var drawingHeight: ScOption[Int] = ScNone
    var drawingWidth: ScOption[Int] = ScNone
    var drawItems: ScOption[js.Array[DrawItem]] = ScNone
    var gradients: ScOption[js.Array[Gradient]] = ScNone
    var rotation: ScOption[Double] = ScNone
    var translate: ScOption[js.Array[Int]] = ScNone
    var zoomLevel: ScOption[Double] = ScNone
    var defaults: ScOption[DrawPaneDefaults] = ScNone
    var `type`: ScOption[String] = "DrawPane"
}

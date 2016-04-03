package com.simplesys.SmartClient.Drawing.props

import com.simplesys.SmartClient.Drawing.DrawItem
import com.simplesys.SmartClient.Drawing.radient.Gradient
import com.simplesys.SmartClient.Foundation.props.CanvasProps
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js

class DrawPaneProps extends CanvasProps {
    var drawingHeight: ScOption[Int] = ScNone
    var drawingWidth: ScOption[Int] = ScNone
    var drawItems: ScOption[js.Array[DrawItem]] = ScNone
    var gradients: ScOption[js.Array[Gradient]] = ScNone
    var rotation: ScOption[Double] = ScNone
    var translate: ScOption[js.Array[Int]] = ScNone
    var zoomLevel: ScOption[Double] = ScNone
    var `type`: ScOption[String] = "DrawPane"
}

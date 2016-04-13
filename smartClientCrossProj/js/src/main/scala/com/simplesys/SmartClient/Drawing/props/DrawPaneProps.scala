package com.simplesys.SmartClient.Drawing.props

import com.simplesys.SmartClient.Drawing.gradient.Gradient
import com.simplesys.SmartClient.Drawing.{DrawItem, DrawPane, DrawPaneDefaults}
import com.simplesys.SmartClient.Foundation.props.CanvasProps
import com.simplesys.option.ScOption._
import com.simplesys.option.{ScNone, ScOption}

class DrawPaneProps extends CanvasProps {
    type callbackHandler <: DrawPane

    var drawingHeight: ScOption[Int] = ScNone
    var drawingWidth: ScOption[Int] = ScNone
    var drawItems: ScOption[Seq[DrawItem]] = ScNone
    var gradients: ScOption[Seq[Gradient]] = ScNone
    var rotation: ScOption[Double] = ScNone
    var translate: ScOption[Seq[Int]] = ScNone
    var zoomLevel: ScOption[Double] = ScNone
    var defaults: ScOption[DrawPaneDefaults] = ScNone
    var `type`: ScOption[String] = "DrawPane".opt
}

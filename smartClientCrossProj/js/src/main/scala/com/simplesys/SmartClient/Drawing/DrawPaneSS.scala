package com.simplesys.js.com.simplesys.SmartClient.Drawing

import com.simplesys.SmartClient.Drawing.Gradients.Gradient
import com.simplesys.SmartClient.Drawing.{DrawItem, DrawPane}
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js

@js.native
trait DrawPaneSS extends DrawPane {
    var drawingHeight: ScOption[Int] = ScNone
    var drawingWidth: ScOption[Int] = ScNone
    var drawItems: ScOption[js.Array[DrawItem]] = ScNone
    var gradients: ScOption[js.Array[Gradient]] = ScNone
    var rotation: ScOption[Double] = ScNone
    var translate: ScOption[js.Array[Int]] = ScNone
    var zoomLevel: ScOption[Double] = ScNone
}



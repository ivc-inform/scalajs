package com.simplesys.SmartClient.Drawing.props

import com.simplesys.SmartClient.Drawing.{DrawItem, DrawPane}
import com.simplesys.SmartClient.Foundation.props.CanvasProps
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js
import scala.scalajs.js._

class DrawKnobProps extends CanvasProps {
    var drawPane: ScOption[DrawPane] = ScNone
    var knobShape: ScOption[DrawItem] = ScNone
    var knobShapeDefaults: ScOption[DrawItem] = ScNone
    var updatePoints: ScOption[js.Function5[Int, Int, Int, Int, String, _]] = ScNone
    var x: ScOption[Int] = ScNone
    var y: ScOption[Int] = ScNone
}

package com.simplesys.SmartClient.Drawing.drawItem.props

import com.simplesys.SmartClient.Drawing.{DrawKnob, Point}
import com.simplesys.SmartClient.Drawing.props.DrawItemProps

import scala.scalajs.js._
import com.simplesys.option.{ScNone, ScOption}

class DrawCurveProps extends DrawItemProps {
    var c1Knob: ScOption[DrawKnob] = ScNone
    var c2Knob: ScOption[DrawKnob] = ScNone
    var controlPoint1: ScOption[Point] = ScNone
    var controlPoint2: ScOption[Point] = ScNone
    var endPoint: ScOption[Point] = ScNone
    var startPoint: ScOption[Point] = ScNone
}

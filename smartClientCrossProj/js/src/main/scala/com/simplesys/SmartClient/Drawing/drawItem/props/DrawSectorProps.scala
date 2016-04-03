package com.simplesys.SmartClient.Drawing.drawItem.props

import com.simplesys.SmartClient.Drawing.Point
import com.simplesys.SmartClient.Drawing.props.DrawItemProps

import scala.scalajs.js._
import com.simplesys.option.{ScNone, ScOption}

class DrawSectorProps extends DrawItemProps {
    var centerPoint: ScOption[Point] = ScNone
    var endAngle: ScOption[Double] = ScNone
    var radius: ScOption[Int] = ScNone
    var startAngle: ScOption[Double] = ScNone
}

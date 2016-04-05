package com.simplesys.SmartClient.Drawing.drawItem.props

import com.simplesys.SmartClient.Drawing.Point
import com.simplesys.SmartClient.Drawing.props.DrawItemProps

import scala.scalajs.js._
import com.simplesys.option.{ScNone, ScOption}

class DrawOvalProps extends DrawItemProps {
    var centerPoint: ScOption[Point] = ScNone
    var height: ScOption[Int] = ScNone
    var left: ScOption[Int] = ScNone
    var radius: ScOption[Int] = ScNone
    var top: ScOption[Int] = ScNone
    var width: ScOption[Int] = ScNone
}

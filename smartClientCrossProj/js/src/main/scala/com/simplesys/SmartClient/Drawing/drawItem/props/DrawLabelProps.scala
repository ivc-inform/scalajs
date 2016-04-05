package com.simplesys.SmartClient.Drawing.drawItem.props

import com.simplesys.SmartClient.Drawing.props.DrawItemProps

import scala.scalajs.js._
import com.simplesys.option.{ScNone, ScOption}

class DrawLabelProps extends DrawItemProps {
    var alignment: ScOption[String] = ScNone
    var contents: ScOption[String] = ScNone
    var fontFamily: ScOption[String] = ScNone
    var fontSize: ScOption[Int] = ScNone
    var fontStyle: ScOption[String] = ScNone
    var fontWeight: ScOption[String] = ScNone
    var left: ScOption[Int] = ScNone
    var top: ScOption[Int] = ScNone
}

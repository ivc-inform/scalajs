package com.simplesys.SmartClient.Drawing.drawItem.props

import com.simplesys.SmartClient.Drawing.Point
import com.simplesys.SmartClient.Drawing.props.DrawItemProps
import com.simplesys.System._

import scala.scalajs.js._
import com.simplesys.option.{ScNone, ScOption}

class DrawPathProps extends DrawItemProps {
    var points: ScOption[Seq[Point]] = ScNone
}

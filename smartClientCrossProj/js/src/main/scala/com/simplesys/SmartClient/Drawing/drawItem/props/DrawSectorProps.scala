package com.simplesys.SmartClient.Drawing.drawItem.props

import com.simplesys.SmartClient.Drawing.props.DrawItemProps
import com.simplesys.SmartClient.System.Point
import com.simplesys.option.{ScNone, ScOption}

class DrawSectorProps extends DrawItemProps {
    var centerPoint: ScOption[Point] = ScNone
    var endAngle: ScOption[Double] = ScNone
    var radius: ScOption[Int] = ScNone
    var startAngle: ScOption[Double] = ScNone
    override val `type`: ScOption[String]  = "DrawSector"
}

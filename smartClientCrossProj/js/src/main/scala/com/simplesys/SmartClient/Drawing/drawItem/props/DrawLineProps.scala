package com.simplesys.SmartClient.Drawing.drawItem.props

import com.simplesys.SmartClient.Drawing.props.DrawItemProps
import com.simplesys.SmartClient.System.Point
import com.simplesys.option.{ScNone, ScOption}

class DrawLineProps extends DrawItemProps {
    var endLeft: ScOption[Int] = ScNone
    var endPoint: ScOption[Point] = ScNone
    var endTop: ScOption[Int] = ScNone
    var startLeft: ScOption[Int] = ScNone
    var startPoint: ScOption[Point] = ScNone
    var startTop: ScOption[Int] = ScNone
    override val `type`: ScOption[String]  = "DrawLine"
}

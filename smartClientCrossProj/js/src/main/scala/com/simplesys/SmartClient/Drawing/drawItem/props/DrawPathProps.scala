package com.simplesys.SmartClient.Drawing.drawItem.props

import com.simplesys.SmartClient.Drawing.DrawPathDefaults
import com.simplesys.SmartClient.Drawing.props.DrawItemProps
import com.simplesys.SmartClient.System.Point
import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.option.ScOption._

class DrawPathProps extends DrawItemProps {
    var points: ScOption[Seq[Point]] = ScNone
    var defaults: ScOption[DrawPathDefaults] = ScNone
    override val `type`: ScOption[String]  = "DrawPath".opt
}

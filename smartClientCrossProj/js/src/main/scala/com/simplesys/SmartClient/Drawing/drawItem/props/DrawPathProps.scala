package com.simplesys.SmartClient.Drawing.drawItem.props

import com.simplesys.SmartClient.Drawing.props.{DrawItemProps, DrawPathDefaultsProps}
import com.simplesys.SmartClient.System.Point
import com.simplesys.option.{ScNone, ScOption}

class DrawPathProps extends DrawItemProps {
    var points: ScOption[Seq[Point]] = ScNone
    var defaults: ScOption[DrawPathDefaultsProps] = ScNone
    override val `type`: ScOption[String]  = "DrawPath"
}

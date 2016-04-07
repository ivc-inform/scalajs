package com.simplesys.SmartClient.Drawing.drawItem.props

import com.simplesys.SmartClient.Drawing.DrawRectDefaults
import com.simplesys.SmartClient.Drawing.props.{DrawItemProps, DrawRectDefaultsProps}
import com.simplesys.option.{ScNone, ScOption}

class DrawRectProps extends DrawItemProps {
    var height: ScOption[Int] = ScNone
    var left: ScOption[Int] = ScNone
    var rounding: ScOption[Double] = ScNone
    var top: ScOption[Int] = ScNone
    var width: ScOption[Int] = ScNone
    var defaults: ScOption[DrawRectDefaults] = ScNone
    override val `type`: ScOption[String]  = "DrawRect"
}

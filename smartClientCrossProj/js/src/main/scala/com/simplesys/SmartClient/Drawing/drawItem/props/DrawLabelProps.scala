package com.simplesys.SmartClient.Drawing.drawItem.props

import com.simplesys.SmartClient.Drawing.props.{DrawItemProps, DrawLabelDefaultsProps}
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
    var defaults: ScOption[DrawLabelDefaultsProps] = ScNone
    override val `type`: ScOption[String]  = "DrawLabel"
}

package com.simplesys.SmartClient.Drawing.drawItem.props

import com.simplesys.SmartClient.Drawing.DrawItem
import com.simplesys.SmartClient.Drawing.props.DrawItemProps
import com.simplesys.option.{ScNone, ScOption}

class DrawGroupProps extends DrawItemProps {
    var drawItems: ScOption[Seq[DrawItem]] = ScNone
    var height: ScOption[Int] = ScNone
    var left: ScOption[Int] = ScNone
    var top: ScOption[Int] = ScNone
    var useGroupRect: ScOption[Boolean] = ScNone
    var width: ScOption[Int] = ScNone
    override val `type`: ScOption[String] = "DrawGroup"
}

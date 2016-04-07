package com.simplesys.SmartClient.Drawing.drawItem.props

import com.simplesys.SmartClient.Drawing.DrawOvalDefaults
import com.simplesys.SmartClient.Drawing.props.{DrawItemProps, DrawOvalDefaultsProps}
import com.simplesys.SmartClient.System.Point
import com.simplesys.option.{ScNone, ScOption}

class DrawOvalProps extends DrawItemProps {
    var centerPoint: ScOption[Point] = ScNone
    var height: ScOption[Int] = ScNone
    var left: ScOption[Int] = ScNone
    var radius: ScOption[Int] = ScNone
    var top: ScOption[Int] = ScNone
    var width: ScOption[Int] = ScNone
    var defaults: ScOption[DrawOvalDefaults] = ScNone
    override val `type`: ScOption[String]  = "DrawOval"
}

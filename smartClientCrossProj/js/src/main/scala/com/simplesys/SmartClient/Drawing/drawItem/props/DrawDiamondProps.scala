package com.simplesys.SmartClient.Drawing.drawItem.props

import com.simplesys.SmartClient.Drawing.DrawDiamondDefaults
import com.simplesys.SmartClient.Drawing.props.{DrawDiamondDefaultsProps, DrawItemProps}
import com.simplesys.option.ScOption._
import com.simplesys.option.{ScNone, ScOption}

class DrawDiamondProps extends DrawItemProps {
    var height: ScOption[Int] = ScNone
    var left: ScOption[Int] = ScNone
    var top: ScOption[Int] = ScNone
    var width: ScOption[Int] = ScNone
    var defaults: ScOption[DrawDiamondDefaults] = ScNone
    override val `type`: ScOption[String] = "DrawDiamond".opt
}

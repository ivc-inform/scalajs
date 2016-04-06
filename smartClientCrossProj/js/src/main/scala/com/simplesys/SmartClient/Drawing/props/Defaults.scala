package com.simplesys.js.com.simplesys.SmartClient.Drawing.props

import com.simplesys.SmartClient.Drawing.Shadow
import com.simplesys.SmartClient.Drawing.radient.SimpleGradient
import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.props.AbstractClassProps

class DefaultsProps extends AbstractClassProps {
}

class DrawRectDefaultsProps extends DefaultsProps {
    var top: ScOption[Int] = ScNone
    var left: ScOption[Int] = ScNone
    var width: ScOption[Int] = ScNone
    var height: ScOption[Int] = ScNone
    var rounding: ScOption[Double] = ScNone
    var fillGradient: ScOption[SimpleGradient] = ScNone
    var keepInParentRect: ScOption[Boolean] = ScNone
    var lineWidth: ScOption[Int] = ScNone
    var shadow: ScOption[Shadow] = ScNone
}


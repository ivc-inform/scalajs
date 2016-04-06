package com.simplesys.js.com.simplesys.SmartClient.Drawing.props

import com.simplesys.SmartClient.System.Point
import com.simplesys.System.Types._
import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.props.AbstractClassProps

class ShadowProps extends AbstractClassProps {
    val blur: ScOption[Int] = ScNone
    val color: ScOption[CSSColor] = ScNone
    val offset: ScOption[Point] = ScNone
}

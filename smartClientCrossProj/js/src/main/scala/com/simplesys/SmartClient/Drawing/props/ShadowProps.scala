package com.simplesys.js.com.simplesys.SmartClient.Drawing.props

import com.simplesys.SmartClient.Drawing.Point
import com.simplesys.System.Types._
import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.props.AbstractClassProps

import scala.scalajs.js._

class ShadowProps extends AbstractClassProps {
    val blur: ScOption[Int] = ScNone
    val color: ScOption[CSSColor] = ScNone
    val offset: ScOption[Point] = ScNone
}

package com.simplesys.js.com.simplesys.SmartClient.Drawing.drawItem.props.drawShape

import com.simplesys.System.Types.DrawShapeCommandType._
import com.simplesys.System._

import scala.scalajs.js._
import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.props.AbstractClassProps

class DrawShapeCommandProps extends AbstractClassProps {
    var args: ScOption[JSArrayAny] = ScNone
    var `type`: ScOption[DrawShapeCommandType] = ScNone
}

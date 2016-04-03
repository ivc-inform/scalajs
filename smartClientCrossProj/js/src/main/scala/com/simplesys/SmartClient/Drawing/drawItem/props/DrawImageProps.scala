package com.simplesys.SmartClient.Drawing.drawItem.props

import com.simplesys.SmartClient.Drawing.props.DrawItemProps
import com.simplesys.System.Types.URL

import scala.scalajs.js._
import com.simplesys.option.{ScNone, ScOption}

class DrawImageProps extends DrawItemProps {
    var height: ScOption[Int] = ScNone
    var left: ScOption[Int] = ScNone
    var src: ScOption[URL] = ScNone
    var top: ScOption[Int] = ScNone
    var useMatrixFilter: ScOption[Boolean] = ScNone
    var width: ScOption[Int] = ScNone
}

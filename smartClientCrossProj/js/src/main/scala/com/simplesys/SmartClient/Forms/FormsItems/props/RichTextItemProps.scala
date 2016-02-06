package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.Types1.JSArray

import scala.scalajs.js._

class RichTextItemProps extends CanvasItemProps {
    var controlGroups: ScOption[JSArray[String]] = ScNone
    var moveFocusOnTab: ScOption[Boolean] = ScNone
}

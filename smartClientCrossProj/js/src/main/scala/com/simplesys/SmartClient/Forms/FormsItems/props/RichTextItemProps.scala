package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.System.JSArray
import com.simplesys.System.Types.FormItemComponentType

import scala.scalajs.js._

class RichTextItemProps extends CanvasItemProps {
    var controlGroups: ScOption[JSArray[String]] = ScNone
    var moveFocusOnTab: ScOption[Boolean] = ScNone
    `type` = FormItemComponentType.RichTextItem
}

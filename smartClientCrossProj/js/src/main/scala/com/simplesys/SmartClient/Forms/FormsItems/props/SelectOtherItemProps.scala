package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.System.Types.HTMLString
import com.simplesys.option.{ScOption, ScNone}

import scala.scalajs.js._

class SelectOtherItemProps extends SelectItemProps {
    var dialogWidth: ScOption[Int] = ScNone
    var otherTitle: ScOption[String] = ScNone
    var otherValue: ScOption[String] = ScNone
    var selectOtherPrompt: ScOption[HTMLString] = ScNone
    var separatorTitle: ScOption[String] = ScNone
    var separatorValue: ScOption[String] = ScNone
}

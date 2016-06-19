package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.SmartClient.System.Types.FormItemComponentType
import com.simplesys.System.Types.SCClassName
import com.simplesys.System.Types.TEXTAREA_WRAP.TEXTAREA_WRAP
import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.option.ScOption._

import scala.scalajs.js._

class TextAreaItemProps extends FormItemProps {
    var browserAutoCapitalize: ScOption[Boolean] = ScNone
    var browserAutoCorrect: ScOption[Boolean] = ScNone
    var editProxyConstructor: ScOption[SCClassName] = ScNone
    var emptyStringValue: ScOption[Any] = ScNone
    var enforceLength: ScOption[Boolean] = ScNone
    var formatOnBlur: ScOption[Boolean] = ScNone
    var length: ScOption[Int] = ScNone
    var minHeight: ScOption[Int] = ScNone
    var printFullText: ScOption[Boolean] = ScNone
    var showHintInField: ScOption[Boolean] = ScNone
    var usePlaceholderForHint: ScOption[Boolean] = ScNone
    var wrap: ScOption[TEXTAREA_WRAP] = ScNone
    `type` = FormItemComponentType.TextAreaItem.opt
}

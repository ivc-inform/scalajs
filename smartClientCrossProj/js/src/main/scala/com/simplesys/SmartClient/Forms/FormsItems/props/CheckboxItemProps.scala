package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.System.Types.{SCClassName, CSSStyleName, HTMLString, SCImgURL}
import com.simplesys.option.{ScOption, ScNone}

import scala.scalajs.js._

class CheckboxItemProps extends FormItemProps {
    var allowEmptyValue: ScOption[Boolean] = ScNone
    var booleanBaseStyle: ScOption[CSSStyleName] = ScNone
    var checkedDescription: ScOption[HTMLString] = ScNone
    var checkedImage: ScOption[SCImgURL] = ScNone
    var editProxyConstructor: ScOption[SCClassName] = ScNone
    var labelAsTitle: ScOption[Boolean] = ScNone
    var partialSelectedDescription: ScOption[HTMLString] = ScNone
    var partialSelectedImage: ScOption[SCImgURL] = ScNone
    var printBooleanBaseStyle: ScOption[CSSStyleName] = ScNone
    var printCheckedImage: ScOption[SCImgURL] = ScNone
    var printPartialSelectedImage: ScOption[SCImgURL] = ScNone
    var printUncheckedImage: ScOption[SCImgURL] = ScNone
    var printUnsetImage: ScOption[SCImgURL] = ScNone
    var showLabel: ScOption[Boolean] = ScNone
    var showUnsetImage: ScOption[Boolean] = ScNone
    var showValueIconDisabled: ScOption[Boolean] = ScNone
    var showValueIconDown: ScOption[Boolean] = ScNone
    var showValueIconOver: ScOption[Boolean] = ScNone
    var uncheckedDescription: ScOption[HTMLString] = ScNone
    var uncheckedImage: ScOption[SCImgURL] = ScNone
    var unsetDescription: ScOption[HTMLString] = ScNone
    var unsetImage: ScOption[SCImgURL] = ScNone
}
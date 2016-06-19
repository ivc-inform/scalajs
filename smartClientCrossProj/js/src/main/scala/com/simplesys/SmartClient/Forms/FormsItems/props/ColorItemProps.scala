package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.SmartClient.Forms.FormsItems.ColorItem
import com.simplesys.SmartClient.System.Types.FormItemComponentType
import com.simplesys.System.JSUndefined
import com.simplesys.System.Types.CSSColor
import com.simplesys.System.Types.ColorPickerMode.ColorPickerMode
import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.option.ScOption._

import scala.scalajs.js

class ColorItemProps extends TextItemProps {
    type classHandler <: ColorItem

    var allowComplexMode: ScOption[Boolean] = ScNone
    var defaultPickerMode: ScOption[ColorPickerMode] = ScNone
    var pickerColorSelected: ScOption[js.ThisFunction2[classHandler, String, JSUndefined[Int], _]] = ScNone
    var supportsTransparency: ScOption[Boolean] = ScNone
    var setValuePicker: ScOption[js.Function2[CSSColor, Int, _]] = ScNone
    `type` = FormItemComponentType.ColorItem.opt
}

package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.SmartClient.Forms.DynamicForm
import com.simplesys.SmartClient.Forms.FormsItems.ColorItem
import com.simplesys.System.JSUndefined
import com.simplesys.System.Types.ColorPickerMode.ColorPickerMode
import com.simplesys.System.Types.FormItemComponentType
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js
import scala.scalajs.js._

class ColorItemProps extends TextItemProps {
    type classHandler <: ColorItem

    var allowComplexMode: ScOption[Boolean] = ScNone
    var defaultPickerMode: ScOption[ColorPickerMode] = ScNone
    var pickerColorSelected: ScOption[js.ThisFunction2[classHandler, String, JSUndefined[Int], _]] = ScNone
    var supportsTransparency: ScOption[Boolean] = ScNone
    `type` = FormItemComponentType.ColorItem
}

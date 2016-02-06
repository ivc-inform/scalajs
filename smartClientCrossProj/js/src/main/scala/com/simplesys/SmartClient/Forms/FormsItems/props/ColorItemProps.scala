package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.System.Types2.ColorPickerMode.ColorPickerMode
import com.simplesys.option.{ScOption, ScNone}

import scala.scalajs.js
import scala.scalajs.js._

class ColorItemProps extends TextItemProps {
    var allowComplexMode: ScOption[Boolean] = ScNone
    var defaultPickerMode: ScOption[ColorPickerMode] = ScNone
    var pickerColorSelected: ScOption[js.ThisFunction1[String, Int, _]] = ScNone
    var supportsTransparency: ScOption[Boolean] = ScNone
}

package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.System.Types2.ColorPickerMode.ColorPickerMode

import scala.scalajs.js

@js.native
trait ColorItem extends TextItem {
    var allowComplexMode: Boolean
    var defaultPickerMode: ColorPickerMode
    var pickerColorSelected: js.ThisFunction1[String, Int, _]
    var supportsTransparency: Boolean
}




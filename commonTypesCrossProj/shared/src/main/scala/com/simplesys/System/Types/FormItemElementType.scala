package com.simplesys.System.Types

import language.implicitConversions

object FormItemElementType extends Enumeration {
    type FormItemElementType = Value
    val cell, control, pickerIcon, textBox, title = Value
}

package com.simplesys.System.Types

import scala.language.implicitConversions

object TitleRotationMode extends Enumeration {
    type TitleRotationMode = Value
    val neverRotate, withItem, withItemAlwaysUp, withLine, withLineAlwaysUp = Value
}

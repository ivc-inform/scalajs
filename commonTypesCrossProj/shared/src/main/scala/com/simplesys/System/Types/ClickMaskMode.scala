package com.simplesys.System.Types

import scala.language.implicitConversions

object ClickMaskMode extends Enumeration {
    type ClickMaskMode = Value
    val hard, soft = Value
}

package com.simplesys.System.Types

import scala.language.implicitConversions

object ResizeKnobPoint extends Enumeration {
    type ResizeKnobPoint = Value
    val TL, TR, BL, BR, T, B, L, R = Value
}

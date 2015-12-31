package com.simplesys.isc.System.Types

import scala.language.implicitConversions

object EdgeName extends Enumeration {
    type EdgeName = Value
    val T, B, L, R, TL, TR, BL, BR, C = Value
}

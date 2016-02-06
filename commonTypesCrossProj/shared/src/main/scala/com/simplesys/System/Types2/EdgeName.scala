package com.simplesys.System.Types2

import scala.language.implicitConversions

object EdgeName extends Enumeration {
    type EdgeName = Value
    val T, B, L, R, TL, TR, BL, BR, C = Value
}

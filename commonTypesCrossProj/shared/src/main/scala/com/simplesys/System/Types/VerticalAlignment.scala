package com.simplesys.System.Types

import scala.language.implicitConversions

object VerticalAlignment extends Enumeration {
    type VerticalAlignment = Value
    val top, center, bottom = Value
}

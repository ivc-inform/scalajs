package com.simplesys.isc.System.Types

import scala.language.implicitConversions

object VerticalAlignment extends Enumeration {
    type VerticalAlignment = Value
    val top, center, bottom = Value
}

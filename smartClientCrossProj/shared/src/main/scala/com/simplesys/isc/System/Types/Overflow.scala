package com.simplesys.isc.System.Types

import scala.language.implicitConversions

object Overflow extends Enumeration {
    type Overflow = Value
    val visible, hidden, auto, scroll, `clip-h`, `clip-v` = Value
}

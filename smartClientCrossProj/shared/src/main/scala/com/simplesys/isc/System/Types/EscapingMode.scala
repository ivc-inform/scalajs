package com.simplesys.isc.System.Types

import scala.language.implicitConversions

object EscapingMode extends Enumeration {
    type EscapingMode = Value
    val double, backslash = Value
}


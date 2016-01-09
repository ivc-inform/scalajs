package com.simplesys.isc.System.Types

import language.implicitConversions

object ValidationMode extends Enumeration {
    type ValidationMode = Value
    val full, partial = Value
}

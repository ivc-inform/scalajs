package com.simplesys.isc.System.Types

import language.implicitConversions

object Positioning extends Enumeration {
    type Positioning = Value
    val absolute, relative = Value
}

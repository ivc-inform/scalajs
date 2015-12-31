package com.simplesys.isc.System.Types

import scala.language.implicitConversions

object Positioning extends Enumeration {
    type Positioning = Value
    val absolute, relative = Value
}

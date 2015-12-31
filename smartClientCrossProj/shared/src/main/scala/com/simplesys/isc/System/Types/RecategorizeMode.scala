package com.simplesys.isc.System.Types

import scala.language.implicitConversions

object RecategorizeMode extends Enumeration {
    type RecategorizeMode = Value
    val always, checked, never = Value
}

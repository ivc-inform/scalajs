package com.simplesys.isc.System.Types

import scala.language.implicitConversions

object ProportionalResizeMode extends Enumeration {
    type ProportionalResizeMode = Value
    val none, always, modifier, modifierOff = Value
}

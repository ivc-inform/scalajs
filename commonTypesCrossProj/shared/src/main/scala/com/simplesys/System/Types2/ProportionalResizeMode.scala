package com.simplesys.System.Types2

import scala.language.implicitConversions

object ProportionalResizeMode extends Enumeration {
    type ProportionalResizeMode = Value
    val none, always, modifier, modifierOff = Value
}

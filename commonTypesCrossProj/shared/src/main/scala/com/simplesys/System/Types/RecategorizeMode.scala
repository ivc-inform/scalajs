package com.simplesys.System.Types

import scala.language.implicitConversions

object RecategorizeMode extends Enumeration {
    type RecategorizeMode = Value
    val always, checked, never = Value
}

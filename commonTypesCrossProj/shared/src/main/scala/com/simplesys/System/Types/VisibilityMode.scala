package com.simplesys.System.Types

import language.implicitConversions

object VisibilityMode extends Enumeration {
    type VisibilityMode = Value
    val mutex, multiple = Value
}

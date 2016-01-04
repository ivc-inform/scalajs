package com.simplesys.isc.System.Types

import language.implicitConversions

object NavigationDirection extends Enumeration {
    type NavigationDirection = Value
    val back, forward, none = Value
}

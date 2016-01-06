package com.simplesys.isc.System.Types

import language.implicitConversions

object NavigationMode extends Enumeration {
    type NavigationMode = Value
    val wholeRecord, navIconOnly = Value
}

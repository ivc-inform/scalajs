package com.simplesys.isc.System.Types

import language.implicitConversions

object CurrentPane extends Enumeration {
    type CurrentPane = Value
    val navigation, list, detail = Value
}

package com.simplesys.isc.System.Types

import language.implicitConversions

object Autofit extends Enumeration {
    type Autofit = Value
    val vertical, horizontal, both = Value
}

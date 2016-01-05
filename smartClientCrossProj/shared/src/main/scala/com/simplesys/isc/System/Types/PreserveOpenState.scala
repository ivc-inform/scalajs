package com.simplesys.isc.System.Types

import language.implicitConversions

object PreserveOpenState extends Enumeration {
    type PreserveOpenState = Value
    val never, whenUnique, always = Value
}

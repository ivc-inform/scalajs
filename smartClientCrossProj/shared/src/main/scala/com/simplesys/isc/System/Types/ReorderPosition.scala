package com.simplesys.isc.System.Types

import language.implicitConversions

object ReorderPosition extends Enumeration {
    type ReorderPosition = Value
    val before, after, over = Value
}

package com.simplesys.isc.System.Types

import language.implicitConversions

object RowSpanSelectionMode extends Enumeration {
    type RowSpanSelectionMode = Value
    val forward, both, outerSpan = Value
}

package com.simplesys.isc.System.Types

import language.implicitConversions

object Visibility extends Enumeration {
    type Visibility = Value
    val inherit, visible, hidden = Value
}

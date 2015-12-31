package com.simplesys.isc.System.Types

import scala.language.implicitConversions

object Visibility extends Enumeration {
    type Visibility = Value
    val inherit, visible, hidden = Value
}

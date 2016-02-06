package com.simplesys.System.Types2

import scala.language.implicitConversions

object Visibility extends Enumeration {
    type Visibility = Value
    val inherit, visible, hidden = Value
}

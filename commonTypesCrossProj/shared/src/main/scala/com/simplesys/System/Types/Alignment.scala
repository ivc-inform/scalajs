package com.simplesys.System.Types

import scala.language.implicitConversions

object Alignment extends Enumeration {
    type Alignment = Value
    val center, left, right,  top, bottom = Value
}

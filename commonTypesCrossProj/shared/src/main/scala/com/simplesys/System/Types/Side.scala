package com.simplesys.System.Types

import scala.language.implicitConversions

object Side extends Enumeration {
    type Side = Value
    val left, right, top, bottom = Value
}

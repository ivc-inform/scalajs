package com.simplesys.System.Types

import scala.language.implicitConversions

object LinePattern extends Enumeration {
    type LinePattern = Value
    val solid, dot, dash, shortdot, shortdash, longdash = Value
}

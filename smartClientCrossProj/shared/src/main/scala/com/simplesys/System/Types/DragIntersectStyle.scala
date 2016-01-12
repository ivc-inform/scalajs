package com.simplesys.System.Types

import scala.language.implicitConversions

object DragIntersectStyle extends Enumeration {
    type DragIntersectStyle = Value
    val mouse, rect = Value
}

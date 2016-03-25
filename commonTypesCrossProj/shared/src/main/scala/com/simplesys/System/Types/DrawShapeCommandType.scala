package com.simplesys.System.Types

import scala.language.implicitConversions

object DrawShapeCommandType extends Enumeration {
    type DrawShapeCommandType = Value
    val close, moveto, lineto, circleto = Value
}

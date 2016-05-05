package com.simplesys.System.Types

import scala.language.implicitConversions

object KnobType extends Enumeration {
    type KnobType = Value
    val resize, move, startPoint, endPoint, controlPoint1, controlPoint2 = Value
}

package com.simplesys.System.Types

import scala.language.implicitConversions


object AnimationAcceleration extends Enumeration {
    type AnimationAcceleration = Value
    val smoothStart, smoothEnd, smoothStartEnd, none = Value
}

package com.simplesys.System.Types2

import scala.language.implicitConversions


object AnimationAcceleration extends Enumeration {
    type AnimationAcceleration = Value
    val smoothStart, smoothEnd, smoothStartEnd, none = Value
}

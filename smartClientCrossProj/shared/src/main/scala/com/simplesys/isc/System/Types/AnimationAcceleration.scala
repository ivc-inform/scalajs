package com.simplesys.isc.System.Types

import language.implicitConversions


object AnimationAcceleration extends Enumeration {
    type AnimationAcceleration = Value
    val smoothStart, smoothEnd, smoothStartEnd, none = Value
}

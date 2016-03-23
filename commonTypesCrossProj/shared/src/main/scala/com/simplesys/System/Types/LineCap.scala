package com.simplesys.System.Types

import scala.language.implicitConversions

object LineCap extends Enumeration {
    type LineCap = Value
    val round, square, butt = Value
}

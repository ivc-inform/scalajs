package com.simplesys.System.Types

import scala.language.implicitConversions

object IconOrientation extends Enumeration {
    type IconOrientation = Value

    val left, center, right = Value

    implicit def IconOrientation2String(io: IconOrientation): String = io.toString
}



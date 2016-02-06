package com.simplesys.System.Types2

import scala.language.implicitConversions

object IconOrientation extends Enumeration {
    type IconOrientation = Value

    val left, right = Value

    implicit def IconOrientation2String (io:IconOrientation):String = io.toString
}



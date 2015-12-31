package com.simplesys.SmartClient.System.Types

object IconOrientation extends Enumeration {
    type IconOrientation = Value

    val left, right = Value

    implicit def IconOrientation2String(io: IconOrientation): String = io.toString
}

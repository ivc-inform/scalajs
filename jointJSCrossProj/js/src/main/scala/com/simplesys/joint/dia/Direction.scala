package com.simplesys.joint.dia

import language.implicitConversions

object Direction extends Enumeration {
    type Direction = Value
    val left, right, top, bottom, `top-right`, `top-left`, `bottom-left`, `bottom-right` = Value
}

package com.simplesys.System.Types2

import scala.language.implicitConversions

object Positioning extends Enumeration {
    type Positioning = Value
    val absolute, relative = Value
}

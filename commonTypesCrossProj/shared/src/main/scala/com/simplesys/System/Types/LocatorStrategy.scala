package com.simplesys.System.Types

import scala.language.implicitConversions

object LocatorStrategy extends Enumeration {
    type LocatorStrategy = Value
    val name, title, index = Value
}

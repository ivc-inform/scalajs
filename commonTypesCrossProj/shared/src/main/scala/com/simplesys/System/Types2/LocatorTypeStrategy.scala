package com.simplesys.System.Types2

import scala.language.implicitConversions

object LocatorTypeStrategy extends Enumeration {
    type LocatorTypeStrategy = Value
    val Class, scClass, role, none = Value
}

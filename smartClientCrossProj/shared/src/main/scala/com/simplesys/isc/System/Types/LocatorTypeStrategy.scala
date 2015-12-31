package com.simplesys.isc.System.Types

import scala.language.implicitConversions

object LocatorTypeStrategy extends Enumeration {
    type LocatorTypeStrategy = Value
    val Class, scClass, role, none = Value
}

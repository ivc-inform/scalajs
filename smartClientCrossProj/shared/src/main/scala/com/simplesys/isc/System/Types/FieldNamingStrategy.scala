package com.simplesys.isc.System.Types

import scala.language.implicitConversions

object FieldNamingStrategy extends Enumeration {
    type FieldNamingStrategy = Value
    val simple, uuid = Value
}

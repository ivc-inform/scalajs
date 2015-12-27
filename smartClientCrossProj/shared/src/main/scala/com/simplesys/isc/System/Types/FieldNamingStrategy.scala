package com.simplesys.isc.System.Types

import language.implicitConversions

object FieldNamingStrategy extends Enumeration {
    type FieldNamingStrategy = Value
    val simple, uuid = Value
}

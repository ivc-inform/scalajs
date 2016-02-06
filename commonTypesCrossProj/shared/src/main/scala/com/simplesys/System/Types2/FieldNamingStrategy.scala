package com.simplesys.System.Types2

import scala.language.implicitConversions

object FieldNamingStrategy extends Enumeration {
    type FieldNamingStrategy = Value
    val simple, uuid = Value
}

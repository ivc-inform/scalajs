package com.simplesys.System.Types

import language.implicitConversions

object JSONDateFormat extends Enumeration {
    type JSONDateFormat = Value
    val xmlSchema, dateConstructor, logicalDateConstructor = Value
}

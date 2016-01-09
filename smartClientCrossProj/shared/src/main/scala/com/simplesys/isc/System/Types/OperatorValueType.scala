package com.simplesys.isc.System.Types

import language.implicitConversions

object OperatorValueType extends Enumeration {
    type OperatorValueType = Value
    val fieldType, fieldName, none, criteria, valueRange, valueSet, custom = Value
}

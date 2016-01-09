package com.simplesys.isc.System.Types

import language.implicitConversions

object CriteriaPolicy extends Enumeration {
    type CriteriaPolicy = Value
    val dropOnChange, dropOnShortening = Value
}

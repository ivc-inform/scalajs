package com.simplesys.System.Types2

import language.implicitConversions

object CriteriaPolicy extends Enumeration {
    type CriteriaPolicy = Value
    val dropOnChange, dropOnShortening = Value
}

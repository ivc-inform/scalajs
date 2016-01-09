package com.simplesys.isc.System.Types

import language.implicitConversions

object JoinType extends Enumeration {
    type JoinType = Value
    val inner, outer = Value
}

package com.simplesys.System.Types

import language.implicitConversions

object SortArrow extends Enumeration {
    type SortArrow = Value
    val none, corner, field, both = Value
}

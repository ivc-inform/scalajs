package com.simplesys.System.Types2

import language.implicitConversions

object SelectionStyle extends Enumeration {
    type SelectionStyle = Value
    val none, single, multiple, simple = Value
}

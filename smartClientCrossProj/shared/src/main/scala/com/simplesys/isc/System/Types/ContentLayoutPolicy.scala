package com.simplesys.isc.System.Types

import language.implicitConversions

object ContentLayoutPolicy extends Enumeration {
    type ContentLayoutPolicy = Value
    val none, vertical, horizontal = Value
}

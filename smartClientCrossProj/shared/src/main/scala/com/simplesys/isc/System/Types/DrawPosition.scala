package com.simplesys.isc.System.Types

import language.implicitConversions

object DrawPosition extends Enumeration {
    type DrawPosition = Value
    val beforeBegin, afterBegin, beforeEnd, afterEnd, replace = Value
}

package com.simplesys.isc.System.Types

import language.implicitConversions

object TreeFilterMode extends Enumeration {
    type TreeFilterMode = Value
    val strict, keepParents = Value
}

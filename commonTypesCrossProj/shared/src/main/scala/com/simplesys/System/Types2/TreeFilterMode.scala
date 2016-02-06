package com.simplesys.System.Types2

import language.implicitConversions

object TreeFilterMode extends Enumeration {
    type TreeFilterMode = Value
    val strict, keepParents = Value
}

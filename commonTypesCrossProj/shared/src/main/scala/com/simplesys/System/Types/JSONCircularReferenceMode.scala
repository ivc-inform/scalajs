package com.simplesys.System.Types

import language.implicitConversions

object JSONCircularReferenceMode extends Enumeration {
    type JSONCircularReferenceMode = Value
    val omit, marker, path = Value
}

package com.simplesys.isc.System.Types

import language.implicitConversions

object DisplayNodeType extends Enumeration {
    type DisplayNodeType = Value
    val unset, `null`, folders, leaves = Value
}

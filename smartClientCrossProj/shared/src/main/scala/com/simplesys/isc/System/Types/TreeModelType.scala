package com.simplesys.isc.System.Types

import language.implicitConversions

object TreeModelType extends Enumeration {
    type TreeModelType = Value
    val parent, children = Value
}

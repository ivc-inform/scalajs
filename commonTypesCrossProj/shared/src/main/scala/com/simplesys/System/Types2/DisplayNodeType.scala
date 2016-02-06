package com.simplesys.System.Types2

import language.implicitConversions

object DisplayNodeType extends Enumeration {
    type DisplayNodeType = Value
    val unset, `null`, folders, leaves = Value
}

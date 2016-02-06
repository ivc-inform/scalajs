package com.simplesys.System.Types2

import language.implicitConversions

object PreserveOpenState extends Enumeration {
    type PreserveOpenState = Value
    val never, whenUnique, always = Value
}

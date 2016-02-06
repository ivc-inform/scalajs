package com.simplesys.System.Types2

import language.implicitConversions

object ReorderPosition extends Enumeration {
    type ReorderPosition = Value
    val before, after, over = Value
}

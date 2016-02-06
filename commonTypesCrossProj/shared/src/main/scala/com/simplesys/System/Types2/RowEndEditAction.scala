package com.simplesys.System.Types2

import language.implicitConversions

object RowEndEditAction extends Enumeration {
    type RowEndEditAction = Value
    val same, next, done, stop, none = Value
}

package com.simplesys.isc.System.Types

import language.implicitConversions

object RowEndEditAction extends Enumeration {
    type RowEndEditAction = Value
    val same, next, done, stop, none = Value
}

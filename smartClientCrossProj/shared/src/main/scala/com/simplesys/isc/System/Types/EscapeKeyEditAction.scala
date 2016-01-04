package com.simplesys.isc.System.Types

import language.implicitConversions

object EscapeKeyEditAction extends Enumeration {
    type EscapeKeyEditAction = Value
    val cancel, done, exit, ignore = Value
}

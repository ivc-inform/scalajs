package com.simplesys.System.Types

import language.implicitConversions

object SequenceMode extends Enumeration {
    type SequenceMode = Value
    val jdbcDriver, native, none = Value
}

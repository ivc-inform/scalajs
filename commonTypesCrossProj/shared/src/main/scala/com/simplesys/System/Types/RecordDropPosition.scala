package com.simplesys.System.Types

import language.implicitConversions

object RecordDropPosition extends Enumeration {
    type RecordDropPosition = Value
    val over, before, after, none = Value
}

package com.simplesys.System.Types

import language.implicitConversions

object SQLType extends Enumeration {
    type SQLType = Value
    val query, update = Value
}

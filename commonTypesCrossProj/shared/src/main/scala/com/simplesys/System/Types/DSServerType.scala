package com.simplesys.System.Types

import language.implicitConversions

object DSServerType extends Enumeration {
    type DSServerType = Value
    val sql, hibernate, jpa, jpa1, generic, projectFile = Value
}

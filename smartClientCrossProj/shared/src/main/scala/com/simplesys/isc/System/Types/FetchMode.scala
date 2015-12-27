package com.simplesys.isc.System.Types

import language.implicitConversions

object FetchMode extends Enumeration {
    type FetchMode = Value
    val basic, paged, local = Value
}

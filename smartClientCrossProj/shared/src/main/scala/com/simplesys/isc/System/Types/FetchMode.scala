package com.simplesys.isc.System.Types

import scala.language.implicitConversions

object FetchMode extends Enumeration {
    type FetchMode = Value
    val basic, paged, local = Value
}

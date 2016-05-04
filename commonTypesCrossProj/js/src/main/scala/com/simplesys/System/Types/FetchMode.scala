package com.simplesys.System.Types

import scala.language.implicitConversions

object FetchMode extends Enumeration {
    type FetchMode = Value
    val basic, paged, local = Value
}

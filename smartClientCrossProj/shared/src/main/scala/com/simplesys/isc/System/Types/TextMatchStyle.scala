package com.simplesys.isc.System.Types

import scala.language.implicitConversions

object TextMatchStyle extends Enumeration {
    type TextMatchStyle = Value
    val exact, exactCase, substring, startsWith = Value
}

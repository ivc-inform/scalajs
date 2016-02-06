package com.simplesys.System.Types2

import scala.language.implicitConversions

object TextMatchStyle extends Enumeration {
    type TextMatchStyle = Value
    val exact, exactCase, substring, startsWith = Value
}

package com.simplesys.System.Types

import scala.language.implicitConversions

object SelectionType extends Enumeration {
    type SelectionType = Value
    val button, checkbox, radio = Value
}

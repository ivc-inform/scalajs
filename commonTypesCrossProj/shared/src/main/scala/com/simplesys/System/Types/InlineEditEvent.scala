package com.simplesys.System.Types

import scala.language.implicitConversions

object InlineEditEvent extends Enumeration {
    type InlineEditEvent = Value
    val click, doubleClick, none, dblOrKeypress = Value
}

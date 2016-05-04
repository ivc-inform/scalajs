package com.simplesys.System.Types

import scala.language.implicitConversions

object TabTitleEditEvent extends Enumeration {
    type TabTitleEditEvent = Value
    val click, doubleClick = Value
}

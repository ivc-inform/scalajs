package com.simplesys.System.Types

import language.implicitConversions

object AutoFitEvent extends Enumeration {
    type AutoFitEvent = Value
    val doubleClick, click, none = Value
}

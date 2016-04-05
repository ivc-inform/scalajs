package com.simplesys.System.Types

import language.implicitConversions

object SelectItemsMode extends Enumeration {
    type SelectItemsMode = Value
    val item, itemOrTitle, never = Value
}

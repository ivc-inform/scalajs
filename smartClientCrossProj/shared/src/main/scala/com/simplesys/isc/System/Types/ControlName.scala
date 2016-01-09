package com.simplesys.isc.System.Types

import language.implicitConversions

object ControlName extends Enumeration {
    type ControlName = Value
    val boldSelection, italicSelection, underlineSelection, fontSelector, fontSizeSelector, alignLeft, alignRight, alignCenter, justify, color, backgroundColor, indent, outdent, orderedList, unorderedList, listProperties = Value
}

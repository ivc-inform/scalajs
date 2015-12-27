package com.simplesys.isc.System.Types

import language.implicitConversions

object DragAppearance extends Enumeration {
    type DragAppearance = Value
    val none , tracker , target , outline = Value
}

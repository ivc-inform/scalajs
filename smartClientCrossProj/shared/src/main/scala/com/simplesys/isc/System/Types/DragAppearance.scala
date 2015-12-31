package com.simplesys.isc.System.Types

import scala.language.implicitConversions

object DragAppearance extends Enumeration {
    type DragAppearance = Value
    val none , tracker , target , outline = Value
}

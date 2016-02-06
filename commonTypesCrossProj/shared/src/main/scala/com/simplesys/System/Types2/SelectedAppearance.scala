package com.simplesys.System.Types2

import scala.language.implicitConversions

object SelectedAppearance extends Enumeration {
    type SelectedAppearance = Value
    val tintMask, outlineMask, outlineEdges, none = Value
}

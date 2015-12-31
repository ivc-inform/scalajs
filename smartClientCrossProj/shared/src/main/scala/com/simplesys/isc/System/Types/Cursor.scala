package com.simplesys.isc.System.Types

import scala.language.implicitConversions

object Cursor extends Enumeration {
    type Cursor = Value
    val default, auto, _wait, pointer, move, help, text, POINTER, arrow, `all-scroll`, `crosshair`, `col-resize`, `row-resize`, `e-resize`, `w-resize`, `n-resize`, `s-resize`, `se-resize`, `ne-resize`, `nw-resize`, `sw-resize`, `not-allowed` = Value
}

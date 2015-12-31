package com.simplesys.isc.System.Types

import scala.language.implicitConversions

object DragMaskType extends Enumeration {
    type DragMaskType = Value
    val div, iframe, hide = Value
}

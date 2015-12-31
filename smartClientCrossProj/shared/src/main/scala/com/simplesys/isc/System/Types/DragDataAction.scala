package com.simplesys.isc.System.Types

import scala.language.implicitConversions

object DragDataAction extends Enumeration {
    type DragDataAction = Value
    val none, copy , move= Value
}

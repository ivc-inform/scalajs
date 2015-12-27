package com.simplesys.isc.System.Types

import language.implicitConversions

object DragDataAction extends Enumeration {
    type DragDataAction = Value
    val none, copy , move= Value
}

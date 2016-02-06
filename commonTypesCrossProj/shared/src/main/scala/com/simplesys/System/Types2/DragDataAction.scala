package com.simplesys.System.Types2

import scala.language.implicitConversions

object DragDataAction extends Enumeration {
    type DragDataAction = Value
    val none, copy , move= Value
}

package com.simplesys.System.Types

import language.implicitConversions

object EnterKeyEditAction extends Enumeration {
    type EnterKeyEditAction = Value
    val done, nextCell, nextRow, nextRowStart = Value
}

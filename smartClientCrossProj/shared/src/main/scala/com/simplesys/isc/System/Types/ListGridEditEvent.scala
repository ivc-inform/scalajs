package com.simplesys.isc.System.Types

import language.implicitConversions

object ListGridEditEvent extends Enumeration {
    type ListGridEditEvent = Value
    val click, doubleClick, none = Value
}

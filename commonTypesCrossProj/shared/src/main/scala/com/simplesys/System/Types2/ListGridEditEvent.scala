package com.simplesys.System.Types2

import language.implicitConversions

object ListGridEditEvent extends Enumeration {
    type ListGridEditEvent = Value
    val click, doubleClick, none = Value
}

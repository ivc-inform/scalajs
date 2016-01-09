package com.simplesys.isc.System.Types

import language.implicitConversions

object MenuFieldID extends Enumeration {
    type MenuFieldID = Value
    val icon, title, key, subMenu = Value
}

package com.simplesys.System.Types2

import language.implicitConversions

object CurrentPane extends Enumeration {
    type CurrentPane = Value
    val navigation, list, detail = Value
}

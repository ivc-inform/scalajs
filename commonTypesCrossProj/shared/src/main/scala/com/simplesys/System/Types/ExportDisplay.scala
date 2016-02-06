package com.simplesys.System.Types

import language.implicitConversions

object ExportDisplay extends Enumeration {
    type ExportDisplay = Value
    val download, window, `return` = Value
}

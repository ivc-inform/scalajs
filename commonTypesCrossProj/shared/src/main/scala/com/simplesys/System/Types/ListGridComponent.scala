package com.simplesys.System.Types

import language.implicitConversions

object ListGridComponent extends Enumeration {
    type ListGridComponent = Value
    val filterEditor, header, body, summaryRow = Value
}

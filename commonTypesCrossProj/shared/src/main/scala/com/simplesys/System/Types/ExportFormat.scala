package com.simplesys.System.Types

import language.implicitConversions

object ExportFormat extends Enumeration {
    type ExportFormat = Value
    val xml, json, csv, xls, ooxml = Value
}

package com.simplesys.System.Types2

import language.implicitConversions

object ExportFormat extends Enumeration {
    type ExportFormat = Value
    val xml, json, csv, xls, ooxml = Value
}

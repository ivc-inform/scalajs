package com.simplesys.System.Types2

import language.implicitConversions

object RecordLayout extends Enumeration {
    type RecordLayout = Value
    val titleOnly, titleAndDescription, summaryInfo, summaryData, summaryFull = Value
}

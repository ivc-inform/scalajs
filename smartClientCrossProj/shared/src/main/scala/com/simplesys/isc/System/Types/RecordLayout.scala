package com.simplesys.isc.System.Types

import language.implicitConversions

object RecordLayout extends Enumeration {
    type RecordLayout = Value
    val titleOnly, titleAndDescription, summaryInfo, summaryData, summaryFull = Value
}

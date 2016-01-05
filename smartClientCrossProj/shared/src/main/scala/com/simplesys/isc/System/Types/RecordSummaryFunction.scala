package com.simplesys.isc.System.Types

import language.implicitConversions

object RecordSummaryFunction extends Enumeration {
    type RecordSummaryFunction = Value
    val sum, avg, max, min, multiplier = Value
}

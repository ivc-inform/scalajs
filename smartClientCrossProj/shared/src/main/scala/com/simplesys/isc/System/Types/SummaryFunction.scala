package com.simplesys.isc.System.Types

import language.implicitConversions

object SummaryFunction extends Enumeration {
    type SummaryFunction = Value
    val sum, avg, max, min, multiplier, count, title, first, concat = Value
}

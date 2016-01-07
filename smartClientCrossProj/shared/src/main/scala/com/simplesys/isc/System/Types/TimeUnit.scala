package com.simplesys.isc.System.Types

import language.implicitConversions

object TimeUnit extends Enumeration {
    type TimeUnit = Value
    val millisecond, second, minute, hour, day, week, month, quarter, year = Value
}

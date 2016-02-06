package com.simplesys.System.Types2

import scala.language.implicitConversions

object TimeDisplayFormat extends Enumeration {
    type TimeDisplayFormat = Value
    val toTime, to24HourTime, toPaddedTime, toPadded24HourTime, toShortTime, toShort24HourTime, toShortPaddedTime, toShortPadded24HourTime = Value
}

package com.simplesys.SmartClient.System.date

import com.simplesys.SmartClient.System.Types
import com.simplesys.SmartClient.System.date.FiscalYear.FiscalYear
import com.simplesys.isc.System.Types.FiscalYearMode
import com.simplesys.isc.System.Types.FiscalYearMode.FiscalYearMode

import scala.scalajs.js

@js.native
object FiscalCalendar extends Types.Object {
    type FiscalCalendar = FiscalCalendar.type

    var defaultDate: Int = js.native
    var defaultMonth: Int = js.native
    var defaultYearMode:FiscalYearMode = js.native
    var fiscalYears:js.Array[FiscalYear] = js.native
}

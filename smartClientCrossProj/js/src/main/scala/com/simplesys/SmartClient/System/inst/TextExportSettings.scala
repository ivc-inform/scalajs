package com.simplesys.SmartClient.System.inst

import com.simplesys.isc.System.Types.DateDisplayFormat.DateDisplayFormat
import com.simplesys.isc.System.Types.ForceTextApproach.ForceTextApproach
import com.simplesys.isc.System.Types.TimeDisplayFormat.TimeDisplayFormat

import scala.scalajs.js

@js.native
trait TextExportSettings extends TextSettings {
    var dateFormat: DateDisplayFormat
    var dateTimeFormat: DateDisplayFormat
    var forceText: ForceTextApproach
    var nullValueText: String
    var quoteValues: Boolean
    var timeFormat: TimeDisplayFormat
    var useDisplayValue: Boolean
}

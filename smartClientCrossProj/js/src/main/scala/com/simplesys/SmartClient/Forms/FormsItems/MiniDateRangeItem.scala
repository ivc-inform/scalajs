package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.SmartClient.Forms.DateRangeDialog
import com.simplesys.SmartClient.Forms.FormsItems.formItem.FormItemIcon
import com.simplesys.SmartClient.System.DateRange.DateRange
import com.simplesys.SmartClient.System.{Date, Criterion}
import com.simplesys.isc.System.Types.DateDisplayFormat.DateDisplayFormat
import com.simplesys.isc.System.Types.{AutoChild, RelativeDateString}
import com.simplesys.isc.System.Types.TimeUnit.TimeUnit

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait MiniDateRangeItem extends StaticTextItem {
    val allowRelativeDates: Boolean
    var autoValidate: Boolean
    val dateDisplayFormat: DateDisplayFormat
    var fromDate: Date | RelativeDateString | TimeUnit
    val fromDateOnlyPrefix: String
    def getCriterion(): Criterion
    def getValue(): DateRange
    val pickerIcon: FormItemIcon
    val rangeDialog: DateRangeDialog with AutoChild
    def setAutoValidate(autoValidate: Boolean): Unit
    def setValue(value: DateRange): Unit
    var toDate: Date | RelativeDateString | TimeUnit
    val toDateOnlyPrefix: String
}

@js.native
abstract trait AbstractMiniDateRangeItemCompanion extends AbstractStaticTextItemCompanion {
}

@js.native
object MiniDateRangeItem extends AbstractMiniDateRangeItemCompanion        

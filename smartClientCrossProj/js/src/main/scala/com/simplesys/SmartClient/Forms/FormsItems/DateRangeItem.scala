package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.SmartClient.Forms.DynamicForm
import com.simplesys.SmartClient.System.DateRange.DateRange
import com.simplesys.SmartClient.System.{Date, Criterion}
import com.simplesys.isc.System.Types.TimeUnit.TimeUnit
import com.simplesys.isc.System.Types.TitleOrientation.TitleOrientation
import com.simplesys.isc.System.Types.{RelativeDateString, AutoChild}
import com.simplesys.isc.System.Types.DateFieldLayout.DateFieldLayout

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait DateRangeItem extends CanvasItem {
    val absoluteDateTimeItemConstructor: String
    val absoluteItemConstructor: String
    val allowRelativeDates: Boolean
    val dateRangeForm: DynamicForm with AutoChild
    val fieldLayout: DateFieldLayout
    var fromDate: Date | RelativeDateString | TimeUnit
    val fromField: FormItem with AutoChild
    var fromTitle: String
    def getValue(): DateRange
    val innerTitleOrientation: TitleOrientation
    val invalidRangeErrorMessage: String
    val relativeItemConstructor: String
    def setFromDate(fromDate: Date): Unit
    def setToDate(fromDate: Date): Unit
    def setValue(value: DateRange): Unit
    var toDate: Date | RelativeDateString | TimeUnit
    val toField: FormItem with AutoChild
    val toTitle: String
    val validateCriteria: Boolean
    def validateRange(): Boolean
}

@js.native
abstract trait AbstractDateRangeItemCompanion extends AbstractCanvasItemCompanion {
}

@js.native
object DateRangeItem extends AbstractDateRangeItemCompanion        

package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.SmartClient.Forms.DynamicForm
import com.simplesys.SmartClient.System.DateRange.DateRange
import com.simplesys.SmartClient.System.Date
import com.simplesys.System.Types.TimeUnit.TimeUnit
import com.simplesys.System.Types.TitleOrientation.TitleOrientation
import com.simplesys.System.Types.{void, RelativeDateString, AutoChild}
import com.simplesys.System.Types.DateFieldLayout.DateFieldLayout

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
    def setFromDate(fromDate: Date): void
    def setToDate(fromDate: Date): void
    def setValue(value: DateRange): void
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

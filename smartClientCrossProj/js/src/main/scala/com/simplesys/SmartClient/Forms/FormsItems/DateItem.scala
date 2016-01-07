package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.SmartClient.Forms.DateChooser
import com.simplesys.SmartClient.System.Date
import com.simplesys.SmartClient.System.date.FiscalCalendar.FiscalCalendar
import com.simplesys.isc.System.Types.DateItemSelectorFormat.DateItemSelectorFormat
import com.simplesys.isc.System.Types.{DateInputFormat, SCClassName, AutoChild}
import com.simplesys.isc.System.Types.DateDisplayFormat.DateDisplayFormat

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait DateItem extends FormItem {
    var browserInputType: String
    var centuryThreshold: Int
    var daySelector: SelectItem with AutoChild
    val daySelectorProperties: SelectItem
    var defaultChooserDate: Date
    def deselectValue(start: Boolean): Unit
    var displayFormat: DateDisplayFormat
    val editProxyConstructor: SCClassName
    var endDate: Date
    var enforceDate: Boolean
    def getDefaultChooserDate(): Date
    def getEnteredValue(): String
    def getFiscalCalendar(): FiscalCalendar
    def getInputFormat(): DateInputFormat
    def getSelectionRange(): Array[Date]
    var invalidDateStringMessage: String
    var maskDateSeparator: String
    var monthSelector: SelectItem with AutoChild
    val monthSelectorProperties: SelectItem
    var pickerProperties: DateChooser
    var pickerTimeItemProperties: TimeItem
    var selectorFormat: DateItemSelectorFormat
    def selectValue(): Unit
    def setEndDate(endDate: Date | String): Unit
    def setFiscalCalendar(fiscalCalendar: FiscalCalendar = js.native): Unit
    def setSelectionRange(start: Int, end: Int): Unit
    def setStartDate(endDate: Date | String): Unit
}

@js.native
abstract trait AbstractDateItemCompanion extends AbstractFormItemCompanion {
}

@js.native
object DateItem extends AbstractDateItemCompanion        

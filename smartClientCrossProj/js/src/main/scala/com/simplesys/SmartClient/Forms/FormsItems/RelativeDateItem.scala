package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.SmartClient.Forms.FormsItems.formItem.FormItemIcon
import com.simplesys.SmartClient.System.date.FiscalCalendar.FiscalCalendar
import com.simplesys.SmartClient.System.{Types, Criterion, Date}
import com.simplesys.isc.System.Types.OperatorId.OperatorId
import com.simplesys.isc.System.Types.RelativeDateRangePosition.RelativeDateRangePosition
import com.simplesys.isc.System.Types.TimeUnit.TimeUnit
import com.simplesys.isc.System.Types.{DateInputFormat, RelativeDateString, AutoChild}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait RelativeDateItem extends CanvasItem {
    val baseDate: Date
    val calculatedDateField: BlurbItem with AutoChild
    var centuryThreshold: Int
    var daysAgoTitle: String
    var daysFromNowTitle: String
    val defaultQuantity: Int
    val defaultValue: Date
    var endDate: Date
    def getCriterion(absolute: Boolean = js.native): Criterion
    def getEnteredValue(): String
    def getFiscalCalendar(): FiscalCalendar
    def getInputFormat(): DateInputFormat
    def getRelativeDate(): Types.Object
    var hoursAgoTitle: String
    var hoursFromNowTitle: String
    var millisecondsAgoTitle: String
    var millisecondsFromNowTitle: String
    var minutesFromNowTitle: String
    var monthsAgoTitle: String
    var monthsFromNowTitle: String
    var pickerIcon: FormItemIcon with AutoChild
    val pickerTimeItemProperties: TimeItem
    val presetOptions: Types.Object
    val quantityField: SpinnerItem with AutoChild
    var quartersAgoTitle: String
    var quartersFromNowTitle: String
    val rangePosition: RelativeDateRangePosition
    val useSharedPicker: Boolean
    val valueField: ComboBoxItem with AutoChild
    val valueFieldWidth: Int | String
    val weeksAgoTitle: String
    val weeksFromNowTitle: String
    val yearsAgoTitle: String
    val yearsFromNowTitle: String
}

@js.native
abstract trait AbstractRelativeDateItemCompanion extends AbstractCanvasItemCompanion {
}

@js.native
object RelativeDateItem extends AbstractRelativeDateItemCompanion        

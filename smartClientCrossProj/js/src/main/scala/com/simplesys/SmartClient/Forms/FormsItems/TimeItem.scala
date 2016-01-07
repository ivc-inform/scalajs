package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.isc.System.Types.TimeDisplayFormat.TimeDisplayFormat
import com.simplesys.isc.System.Types.TimeUnit.TimeUnit
import com.simplesys.isc.System.Types.{HTMLString, AutoChild}

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait TimeItem extends FormItem {
    val ampmItem: SelectItem with AutoChild
    val ampmItemProperties: SelectItem
    var ampmItemTitle: HTMLString
    var browserInputType: String
    def deselectValue(start: Boolean = js.native): Unit
    def getDuration(timeUnit: TimeUnit = js.native): Int
    def getEnteredValue(): String
    def getHourValues(): Array[Int]
    def getMillisecondValues(): Array[Int]
    def getMinuteValues(): Array[Int]
    def getSecondValues(): Array[Int]
    def getSelectionRange(): Array[Int]
    var hourIncrement: Int
    var hourItem: SelectItem with AutoChild
    var hourItemPrompt: HTMLString
    var hourItemProperties: SelectItem
    var hourItemTitle: HTMLString
    var hourMaxValue: Int
    var hourMinValue: Int
    var hourValues: js.Array[Int]
    var invalidTimeStringMessage: HTMLString
    var millisecondIncrement: Int
    var millisecondItem: SelectItem with AutoChild
    var millisecondItemPrompt: HTMLString
    var millisecondItemProperties: SelectItem
    var millisecondItemTitle: HTMLString
    var millisecondMaxValue: Int
    var millisecondMinValue: Int
    var millisecondValues: js.Array[Int]
    var minuteIncrement: Int
    var minuteItem: SelectItem with AutoChild
    var minuteItemPrompt: HTMLString
    var minuteItemProperties: SelectItem
    var minuteItemTitle: HTMLString
    var minuteMaxValue: Int
    var minuteMinValue: Int
    var minuteValues: js.Array[Int]
    var secondIncrement: Int
    var secondItem: SelectItem with AutoChild
    var secondItemPrompt: HTMLString
    var secondItemProperties: SelectItem
    var secondItemTitle: HTMLString
    var secondMaxValue: Int
    var secondMinValue: Int
    var secondValues: js.Array[Int]
    def selectValue(): Unit
    def setHours(hours: Int): Unit
    def setHourValues(values: Array[Int]): Unit
    def setMilliseconds(milliseconds: Int): Unit
    def setMillisecondValues(values: Array[Int]): Unit
    def setsetMinutes(milliseconds: Int): Unit
    def setsetMinutesValues(values: Array[Int]): Unit
    def setSeconds(milliseconds: Int): Unit
    def setSecondValues(values: Array[Int]): Unit
    def setSelectionRange(start: Int, end: Int): Unit
    var showHintInField:Boolean
    var showHourItem:Boolean
    var showMillisecondItem:Boolean
    var showMinuteItem:Boolean
    var showSecondItem:Boolean
    var textField:TextItem with AutoChild
    var textFieldProperties:TextItem
    var timeFormatter12Hour:TimeDisplayFormat
    var timeFormatter24Hour:TimeDisplayFormat
    var use24HourTime:Boolean
    var useMask:Boolean
    var usePlaceholderForHint:Boolean
    var useTextField:Boolean
}

@js.native
abstract trait AbstractTimeItemCompanion extends AbstractFormItemCompanion {
}

@js.native
object TimeItem extends AbstractTimeItemCompanion        
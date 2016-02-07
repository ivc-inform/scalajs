package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.System.Types.TimeDisplayFormat.TimeDisplayFormat
import com.simplesys.System.Types.TimeUnit.TimeUnit
import com.simplesys.System.Types.{void, HTMLString, AutoChild}
import com.simplesys.System.JSArray

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait TimeItem extends FormItem {
    val ampmItem: SelectItem with AutoChild
    val ampmItemProperties: SelectItem
    var ampmItemTitle: HTMLString
    var browserInputType: String
    def deselectValue(start: Boolean = js.native): void
    def getDuration(timeUnit: TimeUnit = js.native): Int
    def getEnteredValue(): String
    def getHourValues(): JSArray[Int]
    def getMillisecondValues(): JSArray[Int]
    def getMinuteValues(): JSArray[Int]
    def getSecondValues(): JSArray[Int]
    def getSelectionRange(): JSArray[Int]
    var hourIncrement: Int
    var hourItem: SelectItem with AutoChild
    var hourItemPrompt: HTMLString
    var hourItemProperties: SelectItem
    var hourItemTitle: HTMLString
    var hourMaxValue: Int
    var hourMinValue: Int
    var hourValues: JSArray[Int]
    var invalidTimeStringMessage: HTMLString
    var millisecondIncrement: Int
    var millisecondItem: SelectItem with AutoChild
    var millisecondItemPrompt: HTMLString
    var millisecondItemProperties: SelectItem
    var millisecondItemTitle: HTMLString
    var millisecondMaxValue: Int
    var millisecondMinValue: Int
    var millisecondValues: JSArray[Int]
    var minuteIncrement: Int
    var minuteItem: SelectItem with AutoChild
    var minuteItemPrompt: HTMLString
    var minuteItemProperties: SelectItem
    var minuteItemTitle: HTMLString
    var minuteMaxValue: Int
    var minuteMinValue: Int
    var minuteValues: JSArray[Int]
    var secondIncrement: Int
    var secondItem: SelectItem with AutoChild
    var secondItemPrompt: HTMLString
    var secondItemProperties: SelectItem
    var secondItemTitle: HTMLString
    var secondMaxValue: Int
    var secondMinValue: Int
    var secondValues: JSArray[Int]
    def selectValue(): void
    def setHours(hours: Int): void
    def setHourValues(values: JSArray[Int]): void
    def setMilliseconds(milliseconds: Int): void
    def setMillisecondValues(values: JSArray[Int]): void
    def setsetMinutes(milliseconds: Int): void
    def setsetMinutesValues(values: JSArray[Int]): void
    def setSeconds(milliseconds: Int): void
    def setSecondValues(values: JSArray[Int]): void
    def setSelectionRange(start: Int, end: Int): void
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




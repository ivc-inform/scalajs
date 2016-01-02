package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.System.date.FiscalCalendar.FiscalCalendar
import com.simplesys.SmartClient.System.date.FiscalYear.FiscalYear
import com.simplesys.isc.System.Types.DateDisplayFormat.DateDisplayFormat

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
object Date extends Types.Object {
    def combineLogicalDateAndTime(date: Date, time: Date): Date = js.native
    def compareDates(date1: Date, date2: Date): Int = js.native
    def compareLogicalDates(date1: Date, date2: Date): Int = js.native
    def create(): Date = js.native
    def createLogicalDate(year: Int, month: Int, date: Int): Date = js.native
    def createLogicalTime(hour: Int, minute: Int, second: Int): Date = js.native
    var dayNames: js.Array[String] = js.native
    def getDefaultDateSeparator(): String = js.native
    def getFirstDayOfWeek(): Int = js.native
    def getFiscalCalendar(): FiscalCalendar = js.native
    def getFiscalStartDate(date: Date | Number, fiscalCalendar: FiscalCalendar = js.native): Date = js.native
    def getFiscalYear(date: Date | Number, fiscalCalendar: FiscalCalendar = js.native): FiscalYear = js.native
    def getFiscalWeek(date: Date, fiscalCalendar: FiscalCalendar = js.native): Int = js.native
    def getInputFormat(): String = js.native
    def getLogicalDateOnly(date: Date): Date = js.native
    def getLogicalTimeOnly(date: Date): Date = js.native
    def getWeekendDays(): js.Array[Int] = js.native
    var monthNames: js.Array[String] = js.native
    def parseInput(dateString: String, format: String = js.native, centuryThreshold: Int = js.native, suppressConversion: Boolean = js.native): Date = js.native
    def setDefaultDateSeparator(separator: String): Unit = js.native
    def setFirstDayOfWeek(firstDayOfWeek: Int): Unit = js.native
    def setFiscalCalendar (fiscalCalendar:FiscalCalendar ): Unit = js.native
    def setInputFormat (format:String): Unit = js.native
    def setNormalDatetimeDisplayFormat (format: String | DateDisplayFormat): Unit = js.native
    def setNormalDisplayFormat (format: String | DateDisplayFormat): Unit = js.native
    def setShortDatetimeDisplayFormat (format: String | DateDisplayFormat): Unit = js.native
    def setShortDisplayFormat (format: String | DateDisplayFormat): Unit = js.native
    def  setShowChooserFiscalYearPickers (showChooserFiscalYearPickers:Boolean): Unit = js.native
    def  setShowChooserWeekPickers (showChooserWeekPickers:Boolean): Unit = js.native
    def  setWeekendDays (weekendDays:js.Array[Int]): Unit = js.native
    var shortDayNames:js.Array[String] = js.native
    var shortMonthNames:js.Array[String] = js.native
    var weekendDays:js.Array[Int] = js.native
}

@js.native
trait Date extends Types.Object {
    def duplicate(): Date
    def getDayName(): String
    def getDefaultDateSeparator(): String
    def getFiscalWeek(fiscalCalendar: FiscalCalendar): Int
    def getFiscalYear(): FiscalYear
    def getMonthName(): String
    def getShortYear(): String
    def getShortDayName(length: Int): String
    def getShortMonthName(length: Int): String
    def getWeek(): Int
    def setDefaultDateSeparator(separator: String): Unit
    def toDateStamp(): String
    def toEuropeanShortDate(): String
    def toEuropeanShortDateTime(): String
    def toJapanShortDate(): String
    def toJapanShortDateTime(): String
    def toNormalDate(format: DateDisplayFormat): String
    def toNormalDatetime(format: DateDisplayFormat, useCustomTimezone: Boolean = js.native): String
    def toShortDate(format: DateDisplayFormat, useCustomTimezone: Boolean = js.native): String
    def toShortDateTime(format: DateDisplayFormat, useCustomTimezone: Boolean = js.native): String
    def toPrettyString(): String
    def toSerializeableDate(): String
    def toUSShortDate(): String
    def toUSShortDateTime(): String
}


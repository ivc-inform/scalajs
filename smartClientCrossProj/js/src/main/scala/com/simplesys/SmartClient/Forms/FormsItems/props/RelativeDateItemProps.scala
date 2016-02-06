package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.SmartClient.Forms.FormsItems.formItem.FormItemIcon
import com.simplesys.SmartClient.Forms.FormsItems.{BlurbItem, TimeItem, SpinnerItem, ComboBoxItem}
import com.simplesys.SmartClient.System.Types
import com.simplesys.System.Types2.RelativeDateRangePosition.RelativeDateRangePosition
import com.simplesys.option.{ScOption, ScNone}

import scala.scalajs.js._

class RelativeDateItemProps extends CanvasItemProps {
    var baseDate: ScOption[Date] = ScNone
    var calculatedDateField: ScOption[BlurbItem ] = ScNone
    var centuryThreshold: ScOption[Int] = ScNone
    var daysAgoTitle: ScOption[String] = ScNone
    var daysFromNowTitle: ScOption[String] = ScNone
    var defaultQuantity: ScOption[Int] = ScNone
    var endDate: ScOption[Date] = ScNone
    var hoursAgoTitle: ScOption[String] = ScNone
    var hoursFromNowTitle: ScOption[String] = ScNone
    var millisecondsAgoTitle: ScOption[String] = ScNone
    var millisecondsFromNowTitle: ScOption[String] = ScNone
    var minutesFromNowTitle: ScOption[String] = ScNone
    var monthsAgoTitle: ScOption[String] = ScNone
    var monthsFromNowTitle: ScOption[String] = ScNone
    var pickerIcon: ScOption[FormItemIcon ] = ScNone
    var pickerTimeItemProperties: ScOption[TimeItem] = ScNone
    var presetOptions: ScOption[Types.Object] = ScNone
    var quantityField: ScOption[SpinnerItem ] = ScNone
    var quartersAgoTitle: ScOption[String] = ScNone
    var quartersFromNowTitle: ScOption[String] = ScNone
    var rangePosition: ScOption[RelativeDateRangePosition] = ScNone
    var useSharedPicker: ScOption[Boolean] = ScNone
    var valueFieldWidth: ScOption[Int | String] = ScNone
    var weeksAgoTitle: ScOption[String] = ScNone
    var weeksFromNowTitle: ScOption[String] = ScNone
    var yearsAgoTitle: ScOption[String] = ScNone
    var yearsFromNowTitle: ScOption[String] = ScNone
}

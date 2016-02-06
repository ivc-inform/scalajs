package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.SmartClient.Forms.FormsItems.{SelectItem, TextItem}
import com.simplesys.System.Types.HTMLString
import com.simplesys.System.Types.TimeDisplayFormat.TimeDisplayFormat
import com.simplesys.option.{ScOption, ScNone}
import com.simplesys.Types.JSArray

import scala.scalajs.js
import scala.scalajs.js._

class TimeItemProps extends FormItemProps {
    var ampmItem: ScOption[SelectItem ] = ScNone
    var ampmItemProperties: ScOption[SelectItem] = ScNone
    var ampmItemTitle: ScOption[HTMLString] = ScNone
    var browserInputType: ScOption[String] = ScNone
    var hourIncrement: ScOption[Int] = ScNone
    var hourItem: ScOption[SelectItem ] = ScNone
    var hourItemPrompt: ScOption[HTMLString] = ScNone
    var hourItemProperties: ScOption[SelectItem] = ScNone
    var hourItemTitle: ScOption[HTMLString] = ScNone
    var hourMaxValue: ScOption[Int] = ScNone
    var hourMinValue: ScOption[Int] = ScNone
    var hourValues: ScOption[JSArray[Int]] = ScNone
    var invalidTimeStringMessage: ScOption[HTMLString] = ScNone
    var millisecondIncrement: ScOption[Int] = ScNone
    var millisecondItem: ScOption[SelectItem ] = ScNone
    var millisecondItemPrompt: ScOption[HTMLString] = ScNone
    var millisecondItemProperties: ScOption[SelectItem] = ScNone
    var millisecondItemTitle: ScOption[HTMLString] = ScNone
    var millisecondMaxValue: ScOption[Int] = ScNone
    var millisecondMinValue: ScOption[Int] = ScNone
    var millisecondValues: ScOption[JSArray[Int]] = ScNone
    var minuteIncrement: ScOption[Int] = ScNone
    var minuteItem: ScOption[SelectItem ] = ScNone
    var minuteItemPrompt: ScOption[HTMLString] = ScNone
    var minuteItemProperties: ScOption[SelectItem] = ScNone
    var minuteItemTitle: ScOption[HTMLString] = ScNone
    var minuteMaxValue: ScOption[Int] = ScNone
    var minuteMinValue: ScOption[Int] = ScNone
    var minuteValues: ScOption[JSArray[Int]] = ScNone
    var secondIncrement: ScOption[Int] = ScNone
    var secondItem: ScOption[SelectItem ] = ScNone
    var secondItemPrompt: ScOption[HTMLString] = ScNone
    var secondItemProperties: ScOption[SelectItem] = ScNone
    var secondItemTitle: ScOption[HTMLString] = ScNone
    var secondMaxValue: ScOption[Int] = ScNone
    var secondMinValue: ScOption[Int] = ScNone
    var secondValues: ScOption[JSArray[Int]] = ScNone
    var showHintInField: ScOption[Boolean] = ScNone
    var showHourItem: ScOption[Boolean] = ScNone
    var showMillisecondItem: ScOption[Boolean] = ScNone
    var showMinuteItem: ScOption[Boolean] = ScNone
    var showSecondItem: ScOption[Boolean] = ScNone
    var textField: ScOption[TextItem ] = ScNone
    var textFieldProperties: ScOption[TextItem] = ScNone
    var timeFormatter12Hour: ScOption[TimeDisplayFormat] = ScNone
    var timeFormatter24Hour: ScOption[TimeDisplayFormat] = ScNone
    var use24HourTime: ScOption[Boolean] = ScNone
    var useMask: ScOption[Boolean] = ScNone
    var usePlaceholderForHint: ScOption[Boolean] = ScNone
    var useTextField: ScOption[Boolean] = ScNone
}

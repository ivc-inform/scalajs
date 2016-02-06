package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.SmartClient.Forms.DynamicForm
import com.simplesys.SmartClient.Forms.FormsItems.FormItem
import com.simplesys.System.Types2.DateFieldLayout.DateFieldLayout
import com.simplesys.System.Types2.RelativeDateString
import com.simplesys.System.Types2.TimeUnit.TimeUnit
import com.simplesys.System.Types2.TitleOrientation.TitleOrientation
import com.simplesys.option.{ScOption, ScNone}

import scala.scalajs.js._

class DateRangeItemProps extends CanvasItemProps {
    var absoluteDateTimeItemConstructor: ScOption[String] = ScNone
    var absoluteItemConstructor: ScOption[String] = ScNone
    var allowRelativeDates: ScOption[Boolean] = ScNone
    var dateRangeForm: ScOption[DynamicForm ] = ScNone
    var fieldLayout: ScOption[DateFieldLayout] = ScNone
    var fromDate: ScOption[Date | RelativeDateString | TimeUnit] = ScNone
    var fromField: ScOption[FormItem ] = ScNone
    var fromTitle: ScOption[String] = ScNone
    var innerTitleOrientation: ScOption[TitleOrientation] = ScNone
    var invalidRangeErrorMessage: ScOption[String] = ScNone
    var relativeItemConstructor: ScOption[String] = ScNone
    var toDate: ScOption[Date | RelativeDateString | TimeUnit] = ScNone
    var toField: ScOption[FormItem ] = ScNone
    var toTitle: ScOption[String] = ScNone
    var validateCriteria: ScOption[Boolean] = ScNone

}

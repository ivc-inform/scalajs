package com.simplesys.SmartClient.Grids.props

import com.simplesys.SmartClient.DataBinding.DetailViewer
import com.simplesys.SmartClient.DataBinding.fieldPicker.FieldPickerWindow
import com.simplesys.SmartClient.DataBinding.props.DataBoundComponentProps
import com.simplesys.SmartClient.Foundation.props.CanvasProps
import com.simplesys.SmartClient.Grids.detailViewer.{DetailViewerRecord, DetailViewerField}
import com.simplesys.System.Types.Alignment.Alignment
import com.simplesys.System.Types.DateDisplayFormat.DateDisplayFormat
import com.simplesys.System.Types._
import com.simplesys.System.Types.TimeDisplayFormat.TimeDisplayFormat
import com.simplesys.option.{ScOption, ScNone}
import com.simplesys.System.{JSArray, JSAny}

import scala.scalajs.js

class DetailViewerProps extends CanvasProps with DataBoundComponentProps {
    var blockSeparator: ScOption[HTMLString] = ScNone
    var blockStyle: ScOption[CSSStyleName] = ScNone
    var canPickFields: ScOption[Boolean] = ScNone
    var cellStyle: ScOption[CSSStyleName] = ScNone
    var configureFieldsText: ScOption[String] = ScNone
    var data: ScOption[JSArray[DetailViewerRecord]] = ScNone
    var dateFormatter: ScOption[DateDisplayFormat] = ScNone
    var datetimeFormatter: ScOption[DateDisplayFormat] = ScNone
    var emptyCellValue: ScOption[HTMLString] = ScNone
    var emptyMessage: ScOption[HTMLString] = ScNone
    var emptyMessageStyle: ScOption[CSSStyleName] = ScNone
    var fieldIdProperty: ScOption[String] = ScNone
    var fieldPickerFieldProperties: ScOption[JSArray[String]] = ScNone
    var fieldPickerWindow: ScOption[FieldPickerWindow] = ScNone
    var fields: ScOption[JSArray[DetailViewerField]] = ScNone
    var formatCellValue: ScOption[js.Function3[String, DetailViewerRecord, DetailViewerField, void]] = ScNone
    var getCellCSSText: ScOption[js.Function4[JSAny, DetailViewerField, DetailViewerRecord, DetailViewer, CSSText]] = ScNone
    var getCellStyle: ScOption[js.Function4[JSAny, DetailViewerField, DetailViewerRecord, DetailViewer, CSSStyleName]] = ScNone
    var headerStyle: ScOption[CSSStyleName] = ScNone
    var labelPrefix: ScOption[HTMLString] = ScNone
    var labelStyle: ScOption[CSSStyleName] = ScNone
    var labelSuffix: ScOption[HTMLString] = ScNone
    var linkTextProperty: ScOption[String] = ScNone
    var loadingMessage: ScOption[HTMLString] = ScNone
    var loadingMessageStyle: ScOption[CSSStyleName] = ScNone
    var printCellStyle: ScOption[CSSStyleName] = ScNone
    var printHeaderStyle: ScOption[CSSStyleName] = ScNone
    var printLabelStyle: ScOption[CSSStyleName] = ScNone
    var recordsPerBlock: ScOption[Int] = ScNone
    var separatorStyle: ScOption[SCClassName] = ScNone
    var showEmptyField: ScOption[Boolean] = ScNone
    var showEmptyMessage: ScOption[Boolean] = ScNone
    var timeFormatter: ScOption[TimeDisplayFormat] = ScNone
    var valueAlign: ScOption[Alignment] = ScNone
    var wrapLabel: ScOption[Boolean] = ScNone
    var wrapValues: ScOption[Boolean] = ScNone
}

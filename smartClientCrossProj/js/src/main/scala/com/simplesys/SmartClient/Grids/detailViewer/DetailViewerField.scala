package com.simplesys.SmartClient.Grids.detailViewer

import com.simplesys.SmartClient.DataBinding.DetailViewer
import com.simplesys.SmartClient.System.Types
import com.simplesys.isc.System.Types.HiliteIconPosition.HiliteIconPosition
import com.simplesys.isc.System.Types.TimeDisplayFormat.TimeDisplayFormat
import com.simplesys.isc.System.Types._
import com.simplesys.isc.System.Types.void
import com.simplesys.isc.System.Types.DateDisplayFormat.DateDisplayFormat

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait DetailViewerField extends Types.Object {
    val canExport: Boolean
    val canHilite: Boolean
    val cellStyle: CSSClassName
    val dataPath: String
    var dateFormatter: DateDisplayFormat
    var decimalPad: Int
    var decimalPrecision: Int
    var displayField: String
    var emptyCellValue: HTMLString
    val escapeHTML: Boolean
    val exportFormat: FormatString
    val format: FormatString
    def formatCellValue(value: String, record: DetailViewerRecord, field: DetailViewerField, viewer: DetailViewer): void
    def getCellStyle(value: String, field: DetailViewerField, record: DetailViewerRecord, viewer: DetailViewer): CSSStyleName
    val height: Int
    val hiliteIconHeight: Int
    val hiliteIconLeftPadding: Int
    val hiliteIconPosition: HiliteIconPosition
    var hiliteIconRightPadding: Int
    var hiliteIconSize: Int
    var hiliteIconWidth: Int
    var imageHeight: Int
    var imageSize: Int
    var imageURLPrefix: String
    var imageWidth: Int
    val includeFrom: String
    var linkText: String
    var linkTextProperty: String
    var linkURLSuffix: String
    var linkURLPrefix: String
    var name: String
    var printCellStyle: CSSClassName
    val showFileInline: Boolean
    var showIf: js.Function2[DetailViewer, js.Array[DetailViewerRecord], Boolean]
    var target: String
    var timeFormatter: TimeDisplayFormat
    var title: HTMLString
    var `type`: String
    var value: HTMLString
    val valueMap: Types.Object
}

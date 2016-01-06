package com.simplesys.SmartClient.Grids

import com.simplesys.SmartClient.DataBinding.dataSource.{DSCallback, RPCCallback}
import com.simplesys.SmartClient.DataBinding.fieldPicker.FieldPickerWindow
import com.simplesys.SmartClient.DataBinding.{DataSource, DSRequest, DataBoundComponent}
import com.simplesys.SmartClient.Foundation.{AbstractCanvasCompanion, Canvas}
import com.simplesys.SmartClient.Grids.detailViewer.{DetailViewerRecord, DetailViewerField}
import com.simplesys.SmartClient.Grids.listGrid.ListGridRecord
import com.simplesys.isc.System.Types.DateDisplayFormat.DateDisplayFormat
import com.simplesys.isc.System.Types.{CSSText, SCClassName, CSSStyleName, HTMLString}

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait DetailViewer extends Canvas with DataBoundComponent {
    val blockSeparator: HTMLString
    var blockStyle: CSSStyleName
    val canPickFields: Boolean
    val cellStyle: CSSStyleName
    val configureFieldsText: String
    var data: Array[DetailViewerRecord]
    var dateFormatter: DateDisplayFormat
    var datetimeFormatter: DateDisplayFormat
    var emptyCellValue: HTMLString
    var emptyMessage: HTMLString
    def emptyMessageHTML(): String
    var emptyMessageStyle: CSSStyleName
    def exportClientData(requestProperties: DSRequest = js.native, callback: RPCCallback = js.native): Unit
    def exportData(requestProperties: DSRequest = js.native, callback: RPCCallback = js.native): Unit
    def fetchRelatedData(record: ListGridRecord, schema: Canvas | DataSource | String, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): Unit
    var fieldIdProperty: String
    def fieldIsVisible(field: String | DetailViewerField): Boolean
    val fieldPickerFieldProperties: Array[String]
    val fieldPickerWindow: FieldPickerWindow
    var fields: Array[DetailViewerField]
    var formatCellValue: js.Function3[String, DetailViewerRecord, DetailViewerField, Unit]
    var getCellCSSText: js.Function4[js.Any, DetailViewerField, DetailViewerRecord, DetailViewer, CSSText]

}

@js.native
abstract trait AbstractDetailViewerCompanion extends AbstractCanvasCompanion {
}

@js.native
object DetailViewer extends AbstractDetailViewerCompanion        

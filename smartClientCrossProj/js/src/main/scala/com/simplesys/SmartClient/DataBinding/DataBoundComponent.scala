package com.simplesys.SmartClient.DataBinding

import com.simplesys.SmartClient.DataBinding.SortSpecifier.SortSpecifier
import com.simplesys.SmartClient.DataBinding.dataSource.DSCallback
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Grids.listGrid.Hilite.Hilite
import com.simplesys.SmartClient.Grids.listGrid.ListGridField
import com.simplesys.SmartClient.Layout.{Window, HiliteEditor}
import com.simplesys.SmartClient.System.Types
import com.simplesys.SmartClient.System.Types.AdvancedCriteria.AdvancedCriteria
import com.simplesys.SmartClient.System.Types.{Callback, Criteria, Field, Record}
import com.simplesys.SmartClient.System.Class
import com.simplesys.isc.System.Types.Alignment.Alignment
import com.simplesys.isc.System.Types.DragDataAction.DragDataAction
import com.simplesys.isc.System.Types.FetchMode.FetchMode
import com.simplesys.isc.System.Types.FieldNamingStrategy.FieldNamingStrategy
import com.simplesys.isc.System.Types.HiliteIconPosition.HiliteIconPosition
import com.simplesys.isc.System.Types.RecategorizeMode.RecategorizeMode
import com.simplesys.isc.System.Types.TextMatchStyle.TextMatchStyle
import com.simplesys.isc.System.Types.{CSSStyleName, DataPath, HTMLString}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait DataBoundComponent extends Class {
    var addDropValues: Boolean
    def addFormulaField(): Unit
    var addFormulaFieldText: String
    var addOperation: String
    def addSummaryField(): Unit
    var addSummaryFieldText: String
    def anySelected(): Boolean
    def askForSort(): Unit
    val autoFetchData: Boolean
    var badFormulaResultValue: String
    var canAddFormulaFields: Boolean
    var canAddSummaryFields: Boolean
    val canEditFieldAttribute: String
    var canEditHilites: Boolean
    var dataArity: String
    val dataFetchMode: FetchMode
    val dataField: String
    var dataPageSize: Int
    var dataSource: DataSource | String
    var deepCloneOnEdit: Boolean
    var descriptionField: String
    def deselectAllRecords(): Unit
    def deselectRange(startRow: Int, endRow: Int): Unit
    def deselectRecord(record: Record | Int): Unit
    def deselectRecords(records: js.Array[Record]): Unit
    def disableHilite(hiliteID: String): Unit
    def disableHiliting(): Unit
    def dragComplete(): Unit
    var dragDataAction: DragDataAction
    var dragRecategorize: RecategorizeMode
    var dragTrackerStyle: CSSStyleName
    def dropComplete(transferredRecords: js.Array[Record]): Unit
    var dropValues: Types.Object
    val duplicateDragMessage: String
    def editFields(): Unit
    def editFormulaField(field: Field): Unit
    var editFormulaFieldText: String
    def editHilites(): Unit
    var editHilitesDialogTitle: String
    var editHilitesText: String
    def editSummaryField(field: Field): Unit
    var editSummaryFieldText: String
    var emptyExportMessage: String
    def enableHilite(hiliteID: String, enable: Boolean = js.native): Unit
    def enableHiliting(enable: Boolean = js.native): Unit
    var exportAll: Boolean
    def exportData(requestProperties: DSRequest = js.native, callback: DSCallback = js.native)
    var exportFields: js.Array[String]
    var exportIncludeSummaries: Boolean
    var fetchOperation: String
    val fieldEditorWindow: Window
    var fieldEditorWindowTitle: HTMLString
    var fieldNamingStrategy: FieldNamingStrategy
    def find(advancedCriteria: AdvancedCriteria): Types.Object
    def findAll(advancedCriteria: AdvancedCriteria): js.Array[Types.Object]
    def findByKey(keyValue: Types.Object): Record
    def findIndex(advancedCriteria: AdvancedCriteria): Int
    def findNextIndex(startIndex: Int, advancedCriteria: AdvancedCriteria, endIndex: Int = js.native): Int
    def getDataPathField(dataPath: DataPath): Field
    def getDragData(source: DataBoundComponent): js.Array[Record]
    def getDropValues(record: Record, sourceDS: DataSource, targetRecord: Record, index: Int, sourceWidget: Canvas): Types.Object
    def getField(fieldID: String | Int): Field
    def getFieldAlignments(): js.Array[Alignment]
    def getFieldNum(fieldID: String | Int): Int
    def getFormulaFieldValue(field: Field, record: Record): Double | String
    def getHilites(): js.Array[Hilite]
    def getHiliteState(): String
    def getRecordHiliteCSSText(record: Record, cssText: String, field: Field): String
    def getSelectionLength(): Int
    def getSort(): js.Array[SortSpecifier]
    def getSummaryFieldValue(field: Field, record: Record): String
    def getTitleField(): String
    def getTitleFieldValue(record: Record): String
    val hiliteEditor: HiliteEditor
    var hiliteIconHeight: Int
    var hiliteIconLeftPadding: Int
    val hiliteIconPosition: HiliteIconPosition
    var hiliteIconRightPadding: Int
    val hiliteIcons: js.Array[String]
    var hiliteIconSize: Int
    var hiliteIconWidth: Int
    var hiliteProperty: String
    var hilites: js.Array[Hilite]
    var hiliteState: String
    val iconField: String
    var includeHilitesInSummaryFields: Boolean
    val infoField: String
    val initialCriteria: Criteria
    def isOffline(): Boolean
    var missingSummaryFieldValue: String
    var offlineMessage: String
    var offlineSaveMessage: String
    var preventDuplicates: Boolean
    var progressiveLoading: Boolean
    var removeFormulaFieldText: String
    var removeOperation: String
    var removeSummaryFieldText: String
    def selectAllRecords(): Unit
    def selectionUpdated(record: Record, recordList: js.Array[Record]): Unit
    def selectRange(startRow: Int, endRow: Int, newState: Boolean = js.native): Unit
    def setHilites(hilites: Hilite): Unit
    def setHiliteState(hiliteState: String): Unit
    def setSort(sortSpecifiers: SortSpecifier): Unit
    def shouldIncludeHiliteInSummaryField(summaryFieldName: String, usedFieldName: String): Boolean
    var showComplexFields: Boolean
    var showDetailFields: Boolean
    var showHiddenFields: Boolean
    var showOfflineMessage: Boolean
    val titleField: String
    def transferDragData(): js.Array[Types.Object]
    def transferRecords(dropRecords: js.Array[Record], targetRecord: Record, index: Int, sourceWidget: Canvas, callback: Callback = js.native): Unit
    def transferSelectedData(source: DataBoundComponent, index: Int, callback: Callback = js.native): Unit
    var unknownErrorMessage: HTMLString
    var updateOperation: String
    var useAllDataSourceFields: Boolean
    val useFlatFields: Boolean
    def userAddedField(field: ListGridField): Boolean
    def willFetchData(newCriteria: Criteria, textMatchStyle: TextMatchStyle = js.native): Boolean
}



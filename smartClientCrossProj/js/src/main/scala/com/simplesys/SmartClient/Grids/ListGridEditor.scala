package com.simplesys.SmartClient.Grids

import com.simplesys.SmartClient.Control.MenuSS
import com.simplesys.SmartClient.Control.menu.MenuSSItem
import com.simplesys.SmartClient.DataBinding.Callbacks._
import com.simplesys.SmartClient.DataBinding.{DSRequest, DataSource}
import com.simplesys.SmartClient.Grids.listGrid.{ListGridField, ListGridRecord}
import com.simplesys.SmartClient.Layout.VLayoutSS
import com.simplesys.SmartClient.System.Types
import com.simplesys.SmartClient.System.Types._
import com.simplesys.System.Types.AutoFitWidthApproach._
import com.simplesys.System.Types.DragDataAction._
import com.simplesys.System.Types.DragTrackerMode._
import com.simplesys.System.Types.ListGridEditEvent._
import com.simplesys.System.Types.SelectionAppearance._
import com.simplesys.System.Types.SelectionStyle._
import com.simplesys.System.Types.TextMatchStyle._
import com.simplesys.System.Types.{ID, void}
import com.simplesys.types.{JSAny, JSArray}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait GridEditor[T <: ListGridField, R <: ListGridRecord, S <: ListGridSelectedState] extends VLayoutSS {
    var canDragSelectText: Boolean
    var canAcceptDroppedRecords: Boolean
    var autoFitFieldWidth: Boolean
    var canResizeFields: Boolean
    def findByKey(keyValue: JSAny): R
    def removeData(removeRecord: R, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): void
    def saveAllEdits(): void
    def selectAllRecords(visibleNodesOnly: Boolean): void
    val showAllRecords: Boolean
    def selectSingleRecordByKey(keyValue: JSAny, newStyle: Boolean): R
    def fetchData(criteria: Criteria = js.native, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): void
    def hasChanges(): Boolean
    def getDataLength(): Int
    var showRecordComponentsByCel: Boolean
    var showRecordComponents: Boolean
    var filterOnKeypress: Boolean
    var drawAheadRatio: Double
    var autoSaveEdits: Boolean
    var selectionType: SelectionStyle
    var canEdit: Boolean
    var showRollOve: Boolean
    var autoFetchData: Boolean
    var showRowNumbers: Boolean
    var autoSaveConfig: Boolean
    var showAdvancedFilter: Boolean
    def selectSingleRecord(record: R): void
    def selectFirstRecord(): void
    def hasErrors(): Boolean
    def getFieldByName(name: String): T
    def removeSelectedData(callback: DSCallback = js.native, requestProperties: DSRequest = js.native): void
    def restoreViewState(callback: Callback): void
    def getCriteria(): Criteria
    def setValueMap(fieldID: ID, map: ValueMap): void
    def setDataSource(dataSource: DataSource): void
    def setSelectedState(selectedState: S): void
    def cancelEditing(): void
    var emptyMessage: String
    def updateData(updatedRecord: R, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): void
    var wrapCells: Boolean
    val autoFetchTextMatchStyle: TextMatchStyle
    def getSelection(excludePartialSelections: Boolean = js.native): JSArray[R]
    var fixedRecordHeights: Boolean
    val dragTrackerMode: DragTrackerMode
    def setData(newData: JSArray[R]): void
    var autoFitWidthApproach: AutoFitWidthApproach
    def startEditing(rowNum: Int = js.native, colNum: Int = js.native, suppressFocus: Boolean = js.native): Boolean
    def addData(newRecord: Record, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): void
    var modalEditing: Boolean
    var canSelectCells: Boolean
    var useClientFilteringSorting: Boolean
    var selectionAppearance: SelectionAppearance
    def selectRecords(records: JSArray[R], newState: Boolean = js.native): void
    def setFields(newFields: JSArray[T] = js.native): void
    def selectRecord(record: R, newState: Boolean = js.native): void
    def selectRecordByKey(keyValue: JSAny, newState: Boolean = js.native): void
    def fullRefresh(criteria: Criteria = js.native, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): void
    def invalidateCache(): void
    def saveViewState(callback: Callback): void
    def getViewState(): ListGridViewState
    var cancelEditingConfirmationMessage: String
    def getAllRows(): JSArray[R]
    var fetchDelay: Int
    def startEditingNew(newValues: Types.Object | R = js.native, suppressFocus: Boolean = js.native): void
    var editEvent: ListGridEditEvent
    def getEditRecord(): R
    def getSelectedRecord(): R
    def getSelectedRecords(excludePartialSelections: Boolean = js.native): JSArray[R]
    def isSelected(): Boolean
    var canSelectTextExpandedField: Boolean
    var showFilterEditor: Boolean
    def discardAllEdits(): void
    def getSelectedState(): S
    def getRecord(data: JSAny): R
    var dataPageSize: Int
    def getEditorType(field: T, values: Types.Object): String
    def deselectRecord(record: R | Int): void
    def deselectRecords(records: JSArray[R]): void
    def deselectAllRecords(): void
    def getRowNum(record: R): Int
    var funcMenu: MenuSS
    var dataSource: DataSource
    def setContextMenu(menu: MenuSS): void
    def getContextMenu(): MenuSS
    def setFuncMenu(menu: MenuSS): void
    def getFuncMenu(): MenuSS
    var saveItems: JSArray[String | MenuSSItem]
    def setSelectionChanged(func: js.Function2[R, Boolean, _]): void
    def setSelectionUpdated(func: js.Function2[R, JSArray[R], _]): void
    def unSetSelectionChanged(func: js.Function2[R, Boolean, _]): void
    def unSetSelectionUpdated(func: js.Function2[R, JSArray[R], _]): void
    def setMasterGrid(grid: ListGrid | TreeGrid | ListGridEditor | TreeGridEditor): void
    def setForignFieldFields(grid: ListGrid, masterGrid: ListGrid): void
    var masterGrid: ListGrid | ListGridEditor | TreeGridEditor
    var canDragRecordsOut: Boolean
    var canReorderRecords: Boolean
    var dragDataAction: DragDataAction
}

@js.native
trait ListGridEditor extends VLayoutSS with GridEditor[ListGridField, ListGridRecord, ListGridSelectedState] {
    var grid: ListGrid
}

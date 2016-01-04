package com.simplesys.SmartClient.Grids

import com.simplesys.SmartClient.Charts.{FacetChart, Chart}
import com.simplesys.SmartClient.Control.{Button, IButton}
import com.simplesys.SmartClient.DataBinding._
import com.simplesys.SmartClient.DataBinding.dataSource.{RPCCallback, DSCallback}
import com.simplesys.SmartClient.Forms.DynamicForm
import com.simplesys.SmartClient.Forms.FormsItems.FormItem
import com.simplesys.SmartClient.Foundation.{HTMLFlow, GridRenderer, Canvas}
import com.simplesys.SmartClient.Grids.listGrid.ListGridField.ListGridField
import com.simplesys.SmartClient.Grids.listGrid.{UserFormula, RecordEditor}
import com.simplesys.SmartClient.Layout.{HLayout, Layout, AbstractVLayoutCompanion, VLayout}
import com.simplesys.SmartClient.System.SortSpecifier.SortSpecifier
import com.simplesys.SmartClient.System.Types
import com.simplesys.SmartClient.System.Types.AdvancedCriteria.AdvancedCriteria
import com.simplesys.SmartClient.System.Types._
import com.simplesys.SmartClient.System.selection.CellSelection
import com.simplesys.isc.System.Types.Alignment.Alignment
import com.simplesys.isc.System.Types.AnimationAcceleration.AnimationAcceleration
import com.simplesys.isc.System.Types.AutoComplete.AutoComplete
import com.simplesys.isc.System.Types.AutoFitIconFieldType.AutoFitIconFieldType
import com.simplesys.isc.System.Types.AutoFitWidthApproach.AutoFitWidthApproach
import com.simplesys.isc.System.Types.Autofit.Autofit
import com.simplesys.isc.System.Types.ChartType.ChartType
import com.simplesys.isc.System.Types.DateDisplayFormat.DateDisplayFormat
import com.simplesys.isc.System.Types.DragDataAction.DragDataAction
import com.simplesys.isc.System.Types.DragTrackerMode.DragTrackerMode
import com.simplesys.isc.System.Types.EditCompletionEvent.EditCompletionEvent
import com.simplesys.isc.System.Types.EnterKeyEditAction.EnterKeyEditAction
import com.simplesys.isc.System.Types.EscapeKeyEditAction.EscapeKeyEditAction
import com.simplesys.isc.System.Types.ExpansionComponentPoolingMode.ExpansionComponentPoolingMode
import com.simplesys.isc.System.Types.ExpansionMode.ExpansionMode
import com.simplesys.isc.System.Types.FetchMode.FetchMode
import com.simplesys.isc.System.Types.ListGridEditEvent.ListGridEditEvent
import com.simplesys.isc.System.Types.Overflow.Overflow
import com.simplesys.isc.System.Types.ReorderPosition.ReorderPosition
import com.simplesys.isc.System.Types.TextMatchStyle.TextMatchStyle
import com.simplesys.isc.System.Types.VerticalAlignment.VerticalAlignment
import com.simplesys.isc.System.Types._

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait ListGrid extends VLayout with DataBoundComponent {
    def addData(newRecord: Record, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): Unit
    def addEmbeddedComponent(component: Canvas, record: Record, rowNum: Int = js.native, colNum: Int = js.native, position: Int = js.native): Unit
    def addSort(sortSpecifier: SortSpecifier): Unit
    val advancedFieldPickerThreshold: Int
    val allowFilterExpressions: Boolean
    val allowRowSpanning: Boolean
    var alternateBodyStyleName: CSSStyleName
    var alternateFieldFrequency: Int
    var alternateFieldStyles: Boolean
    var alternateRecordFrequency: Int
    var alternateRecordStyles: Boolean
    val alwaysShowEditors: Boolean
    var animateFolderEffect: AnimationAcceleration
    var animateFolderMaxRows: Int
    var animateFolders: Boolean
    var animateFolderSpeed: Int
    var animateFolderTime: Int
    var animateRemoveRecord: Boolean
    var animateRemoveSpeed: Int
    var animateRemoveTime: Int
    var animateRollOver: Boolean
    var animateRollUnder: Boolean
    var animateSelection: Boolean
    var animateSelectionUnder: Boolean
    def applyCellData(cellData: js.Array[Record]): Unit
    var applyFormulaAfterSummary: Boolean
    def applyRecordData(recordData: js.Array[Record]): Unit
    var applyRowNumberStyle: Boolean
    def applySortToData(sortSpecifiers: js.Array[SortSpecifier]): Unit
    var arrowKeyAction: String
    val asynchGroupingPrompt: HTMLString
    var autoComplete: AutoComplete
    var autoConfirmSaveEdits: Boolean
    var autoFetchDisplayMap: Boolean
    val autoFetchTextMatchStyle: TextMatchStyle
    var autoFitAllText: String
    val autoFitClipFields: js.Array[String]
    var autoFitData: Autofit
    val autoFitExpandField: String
    var autoFitExtraRecords: Int
    def autoFitField(fieldName: String): Int
    def autoFitFields(fields: js.Array[ListGridField] = js.native): Unit
    val autoFitFieldsFillViewport: Boolean
    var autoFitFieldText: String
    val autoFitFieldWidths: Boolean
    val autoFitHeaderHeights: Boolean
    val autoFitIconFields: AutoFitIconFieldType
    var autoFitMaxColumns: Int
    var autoFitMaxHeight: Int
    var autoFitMaxRecords: Int
    var autoFitMaxWidth: Int
    var autoFitWidthApproach: AutoFitWidthApproach
    var autoSaveEdits: Boolean
    val autoSizeHeaderSpans: Boolean
    val backgroundComponent: Canvas with MultiAutoChild
    val baseStyle: CSSStyleName
    val body: GridRenderer with MultiAutoChild
    var bodyBackgroundColor: String
    var bodyKeyPress: js.ThisFunction0[callbackHandler, Boolean]
    var bodyOverflow: Overflow
    var bodyStyleName: CSSStyleName
    val booleanBaseStyle: CSSStyleName
    var booleanFalseImage: SCImgURL
    var booleanImageHeight: Int
    var booleanImageWidth: Int
    var booleanPartialImage: SCImgURL
    var booleanTrueImage: SCImgURL
    var canAcceptDroppedRecords: Boolean
    var canAutoFitFields: Boolean
    def cancelEditing(): Unit
    var cancelEditingConfirmationMessage: String
    val canCollapseGroup: Boolean
    var canDragRecordsOut: Boolean
    var canDragSelect: Boolean
    var canDragSelectText: Boolean
    var canDropInEmptyArea: Boolean
    var canEdit: Boolean
    def canEditCell(rowNum: Int, colNum: Int): Boolean
    var canEditTitles: Boolean
    var canExpandMultipleRecords: Boolean
    def canExpandRecord(record: ListGridRecord, rowNum: Int): Boolean
    val canExpandRecordProperty: String
    var canExpandRecords: Boolean
    val canFocusInEmptyGrid: Boolean
    var canFreezeFields: Boolean
    var canGroupBy: Boolean
    var canMultiGroup: Boolean
    var canMultiSort: Boolean
    var canPickFields: Boolean
    val canPickOmittedFields: Boolean
    val canRemoveRecords: Boolean
    var canReorderFields: Boolean
    var canReorderRecords: Boolean
    var canResizeFields: Boolean
    var canSelectAll: Boolean
    def canSelectCell(rowNum: Int, colNum: Int): Boolean
    val canSelectCells: Boolean
    var canSelectGroups: Boolean
    def canSelectRecord(record: ListGridRecord): Boolean
    var canSort: Boolean
    val canTabToHeader: Boolean
    val cellChanged: js.Function5[ListGridRecord, js.Any, Int, Int, ListGrid, Unit]
    val cellClick: js.Function3[ListGridRecord, Int, Int, Boolean]
    val cellContextClick: js.Function3[ListGridRecord, Int, Int, Boolean]
    val cellContextMenu: Layout with AutoChild
    val cellDoubleClick: js.Function3[ListGridRecord, Int, Int, Boolean]
    val cellErrorIconHover: js.Function3[ListGridRecord, Int, Int, Boolean]
    def cellHasChanges(rowNum: Int, colNum: Int): Boolean
    def cellHasErrors(rowNum: Int, fieldID: Int | String): Boolean
    var cellHeight: Int
    val cellHover: js.Function3[ListGridRecord, Int, Int, Boolean]
    val cellHoverHTML: js.Function3[ListGridRecord, Int, Int, HTMLString]
    val cellMouseDown: js.Function3[ListGridRecord, Int, Int, Boolean]
    val cellMouseUp: js.Function3[ListGridRecord, Int, Int, Boolean]
    val cellOut: js.Function3[ListGridRecord, Int, Int, Boolean]
    val cellOver: js.Function3[ListGridRecord, Int, Int, Boolean]
    var cellPadding: Int
    val cellSelectionChanged: js.Function1[js.Array[js.Any], Boolean]
    val cellValueHover: js.Function3[ListGridRecord, Int, Int, Boolean]
    val cellValueHoverHTML: js.Function3[ListGridRecord, Int, Int, HTMLString]
    def cellValueIsClipped(rowNum: Int, colNum: Int): Boolean
    def chartColumn(dataColumn: String, labelColumn: String, chartProperties: Chart): Chart
    val chartConstructor: String
    def chartData(labelField: String, dataFields: js.Array[String] = js.native, dataRows: js.Array[ListGridRecord] = js.native, chartProperties: FacetChart = js.native, labelFieldFirst: Boolean = js.native): FacetChart
    def chartRow(rowNum: Int, dataFields: js.Array[String], chartProperties: Chart = js.native): Chart
    val chartType: ChartType
    val checkboxField: ListGridField with AutoChild
    var checkboxFieldFalseImage: SCImgURL
    val checkboxFieldHSpace: Int
    val checkboxFieldImageHeight: Int
    val checkboxFieldImageWidth: Int
    var checkboxFieldPartialImage: SCImgURL
    var checkboxFieldTrueImage: SCImgURL
    var childExpansionMode: ExpansionMode
    var clearAllSortingText: String
    def clearCriteria(callback: DSCallback = js.native, requestProperties: DSRequest = js.native): Unit
    def clearEditValue(editValuesID: String | Types.Object, colNum: Int | String): Unit
    def clearFieldError(rowNum: Int, fieldName: Int | String): Unit
    var clearFilterText: String
    def clearRowErrors(rowNum: Int): Unit
    def clearSort(): Unit
    var clearSortFieldText: String
    val clipHeaderTitles: Boolean
    def closeGroup(record: Record): Boolean
    val collapseGroupOnRowClick: Boolean
    def collapseRecord(record: ListGridRecord): Unit
    def collapseRecords(records: js.Array[ListGridRecord]): Unit
    def configureGrouping(): Unit
    var configureGroupingText: String
    var configureSortText: String
    var confirmCancelEditing: Boolean
    var confirmDiscardEdits: Boolean
    var confirmDiscardEditsMessage: String
    var createRecordComponent: js.ThisFunction2[callbackHandler, ListGridRecord, Int, Canvas]
    val data: js.Array[ListGridRecord]
    var dataArrived: js.ThisFunction2[callbackHandler, Int, Int, Unit]
    var dataProperties: ResultSet
    var dateFormatter: DateDisplayFormat
    var dateInputFormat: DateInputFormat
    var datetimeFormatter: DateDisplayFormat
    val defaultFields: js.Array[ListGridField]
    val deferRemoval: Boolean
    var detailDS: String
    var detailField: String
    def discardAllEdits(rows: js.Array[Int] = js.native, dontHideEditor: Boolean = js.native): Unit
    def discardEdits(rowNum: Int, colNum: Int, dontHideEditor: Boolean = js.native): Unit
    var discardEditsOnHideField: Boolean
    var discardEditsSaveButtonTitle: String
    def displayHeaderContextMenu(target: Canvas, position: js.Array[Int] = js.native): Unit
    def displaySort(sortSpecifiers: js.Array[SortSpecifier]): Unit
    val dragTrackerMode: DragTrackerMode
    var drawAheadRatio: Double
    var drawAllMaxCells: Int
    var drawAreaChanged: js.ThisFunction4[callbackHandler, Int, Int, Int, Int, Unit]
    var editByCell: Boolean
    var editComplete: js.ThisFunction6[callbackHandler, Int, Int, Record, Record, EditCompletionEvent, DSResponse, Unit]
    var editEvent: ListGridEditEvent
    var editFailed: js.ThisFunction6[callbackHandler, Int, Int, Record, Record, EditCompletionEvent, DSResponse, Unit]
    var editFailedBaseStyle: CSSStyleName
    var editFailedCSSText: String
    var editOnF2Keypress: Boolean
    var editOnFocus: Boolean
    var editorEnter: js.ThisFunction4[callbackHandler, ListGridRecord, js.Any, Int, Int, Unit]
    var editorExit: js.ThisFunction5[callbackHandler, EditCompletionEvent, ListGridRecord, js.Any, Int, Int, Boolean]
    val editPendingBaseStyle: CSSStyleName
    var editPendingCSSText: String
    var emptyCellValue: HTMLString
    var emptyMessage: HTMLString
    var emptyMessageStyle: CSSStyleName
    def endEditing(): Unit
    var enforceVClipping: Boolean
    var enterKeyEditAction: EnterKeyEditAction
    val enumCriteriaAsInitialValues: Boolean
    var errorIconHeight: Int
    var errorIconSrc: SCImgURL
    var errorIconWidth: Int
    var escapeKeyEditAction: EscapeKeyEditAction
    def expandRecord(record: ListGridRecord): Unit
    def expandRecords(record: js.Array[ListGridRecord]): Unit
    var expansionCanEdit: Boolean
    var expansionComponentPoolingMode: ExpansionComponentPoolingMode
    val expansionDetailField: HTMLFlow with MultiAutoChild
    val expansionDetailRelated: HLayout with MultiAutoChild
    val expansionDetails: DetailViewer with MultiAutoChild
    val expansionEditor: DynamicForm with MultiAutoChild
    var expansionEditorCollapseOnSave: Boolean
    val expansionEditorSaveButton: IButton with MultiAutoChild
    var expansionEditorSaveButtonTitle: String
    val expansionEditorSaveDialogPrompt: String
    val expansionEditorShowSaveDialog: Boolean
    var expansionField: ListGrid with AutoChild
    var expansionFieldFalseImage: SCImgURL
    val expansionFieldImageHeight: Int
    val expansionFieldImageWidth: Int
    var expansionFieldTrueImage: SCImgURL
    val expansionLayout: VLayout with MultiAutoChild
    var expansionMode: ExpansionMode
    val expansionRelated: ListGrid with MultiAutoChild
    val exportAlternateRowBGColor: CSSColor
    def exportClientData(requestProperties: DSRequest = js.native, callback: RPCCallback): Unit
    val exportDefaultBGColor: CSSColor
    var exportFieldAlignments: Boolean
    var exportFieldWidths: Boolean
    var exportHeaderHeights: Boolean
    val exportRawValues: Boolean
    var exportWidthScale: Double
    var exportWrapHeaderTitles: Boolean
    val fastCellUpdates: Boolean
    def fetchData(criteria: Criteria = js.native, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): Unit
    var fetchDelay: Int
    def fetchRelatedData(record: ListGridRecord, schema: Canvas | DataSource | String, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): Unit
    def fieldIsEditable(field: ListGridField | Int | String): Boolean
    def fieldIsVisible(field: ListGridField | String): Boolean
    val fieldPickerFieldProperties: js.Array[String]
    val fieldPickerShowSampleValues: String
    var fields: js.Array[ListGridField]
    var fieldState: String
    var fieldStateChanged: js.ThisFunction0[Unit, Unit]
    var fieldVisibilitySubmenuTitle: String
    val filterButtonPrompt: String
    val filterButtonProperties: js.Array[Button]
    var filterByCell: Boolean
    def filterByEditor(): Unit
    def filterData(criteria: Criteria = js.native, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): Unit
    val filterEditor: RecordEditor with AutoChild
    var filterEditorHeight: Int
    val filterEditorProperties: RecordEditor
    var filterEditorSubmit: js.ThisFunction1[callbackHandler, Criteria, Boolean]
    val filterLocalData: Boolean
    var filterOnKeypress: Boolean
    def findNextEditCell(rowNum: Int, colNum: Int, direction: Int, stepThroughFields: Boolean, checkStartingCell: Boolean = js.native): js.Array[Int]
    var fixedFieldWidths: Boolean
    var fixedRecordHeights: Boolean
    def focusInCell(row: Int, col: Int): Unit
    def focusInFilterEditor(fieldName: String): Unit
    def focusInRow(row: Int): Unit
    var formatCellValue: js.ThisFunction3[callbackHandler, ListGridRecord, Int, Int, HTMLString]
    var formatEditorValue: js.ThisFunction3[callbackHandler, ListGridRecord, Int, Int, js.Any]
    var formulaBuilderSpanTitleSeparator: String
    def formulaUpdated(field: ListGridField, formula: UserFormula): Unit
    var freezeFieldText: HTMLString
    var freezeOnLeftText: String
    var freezeOnRightText: String
    var frozenBaseStyle: String
    val frozenHeaderBaseStyle: CSSStyleName
    val frozenHeaderTitleStyle: CSSStyleName
    var generateClickOnEnter: Boolean
    var generateClickOnSpace: Boolean
    var generateDoubleClickOnEnter: Boolean
    var generateDoubleClickOnSpace: Boolean
    def getAllEditRows(): js.Array[Int]
    def getAllFields(): js.Array[ListGridField]
    var getBaseStyle: js.ThisFunction3[callbackHandler, ListGridRecord, Int, Int, CSSStyleName]
    def getBody(): GridRenderer
    def getCellAlign(record: ListGridRecord, rowNum: Int, colNum: Int): Alignment
    def getCellCSSText(record: ListGridRecord, rowNum: Int, colNum: Int): String
    def getCellErrors(rowNum: Int, fieldName: String | Int): js.Array[String]
    var getCellHoverComponent: js.ThisFunction3[callbackHandler, ListGridRecord, Int, Int, Canvas]
    def getCellPageRect(record: ListGridRecord, rowNum: Int, colNum: Int): js.Array[Int]
    var getCellRecord: js.ThisFunction1[callbackHandler, Int, ListGridRecord]
    def getCellRowSpan(record: ListGridRecord, rowNum: Int, colNum: Int): Int
    def getCellSelection(): CellSelection
    def getCellStartRow(record: ListGridRecord, rowNum: Int, colNum: Int): Int
    var getCellStyle: js.ThisFunction3[callbackHandler, ListGridRecord, Int, Int, CSSStyleName]
    def getCellVAlign(record: ListGridRecord, rowNum: Int, colNum: Int): VerticalAlignment
    var getCellValue: js.ThisFunction3[callbackHandler, ListGridRecord, Int, Int, String]
    def getCheckboxField(): ListGridField
    def getColumnLeft(colNum: Int): Int
    def getColumnPageLeft(colNum: Int): Int
    def getColumnWidth(colNum: Int): Int
    def getCriteria(): Criteria
    def getCurrentExpansionComponent(record: ListGridRecord | Int): Canvas
    def getCurrentFieldWidths(): js.Array[Int]
    def getDefaultFieldWidth(field: ListGridField): Int
    def getDefaultFormattedFieldValue(record: ListGridRecord, field: ListGridField, rowNum: Int = js.native, colNum: Int = js.native): String
    def getDefaultFormattedValue(record: ListGridRecord, rowNum: Int, colNum: Int): String
    def getDisplayValue(fieldID: String | Int | ListGridField, valueFieldValue: js.Any): String
    var getDragData: js.Function1[DataBoundComponent, js.Array[ListGridRecord]]
    def getDragTrackerIcon(records: js.Array[ListGridRecord]): String
    def getDragTrackerTitle(record: ListGridRecord, rowNum: Int): String
    def getDrawArea(): js.Array[Int]
    def getDrawnRowHeight(rowNum: Int): Int
    def getDrawnRows(): js.Array[Int]
    def getDropIndex(recordNum: Int = js.native, reorderPosition: ReorderPosition = js.native): Int
    def getEditCol(): Int
    def getEditedCell(record: ListGridRecord, field: Int | String): js.Any
    def getEditedRecord(valuesID: Int | Types.Object): Types.Object
    def getEditField(): Types.Object
    def getEditFormItem(field: String | Int): FormItem
    def getEditorProperties(field: ListGridField): Types.Object
    def getEditorType(field: ListGridField, values: Types.Object): String
    def getEditorValueIcons(field: ListGridField, values: Types.Object): Types.Object
    def getEditorValueMap(field: ListGridField, values: Types.Object): ValueMap
    def getEditRow(): Int
    def getEditValue(rowNum: Int, colNum: Int): js.Any
    def getEditValues(valuesID: Types.Object | Int): Types.Object
    def getEventColumn(x: Int): Int
    def getEventRow(y: Int): Int
    def getExpandedRecords(): js.Array[ListGridRecord]
    def getExpansionComponent(record: ListGridRecord): Canvas
    def getExpansionField(): ListGridField
    def getExportBGColor(rowNum: Int, colNum: Int, record: ListGridRecord): CSSColor
    def getExportColumnBGColor(colNum: Int): CSSColor
    def getExportRowBGColor(rowNum: Int, record: ListGridRecord): CSSColor
    def getField(colNum: Int): ListGridField
    def getFieldByName(fieldName: String): ListGridField
    def getFieldContentWidth(field: ListGridField): Int
    def getFieldName(colNum: Int): String
    def getFieldState(): ListGridFieldState
    def getFieldTitle(fieldId: String | Int): String
    def getFieldWidth(fieldNum: Int | String): Int
    def getFilterEditorCriteria(omitHiddenFields: Boolean = js.native): Criteria | AdvancedCriteria
    def  getFilterEditorType (field:ListGridField):String
}

@js.native
abstract trait AbstractListGridCompanion extends AbstractVLayoutCompanion {
}

@js.native
object ListGrid extends AbstractListGridCompanion        






















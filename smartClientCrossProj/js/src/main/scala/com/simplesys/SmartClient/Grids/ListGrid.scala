package com.simplesys.SmartClient.Grids

import com.simplesys.SmartClient.Charts.{FacetChart, Chart}
import com.simplesys.SmartClient.Control.{Button, IButton}
import com.simplesys.SmartClient.DataBinding._
import com.simplesys.SmartClient.DataBinding.dataSource.{RPCCallback, DSCallback}
import com.simplesys.SmartClient.Forms.DynamicForm
import com.simplesys.SmartClient.Forms.FormsItems.FormItem
import com.simplesys.SmartClient.Foundation.{StatefulCanvas, HTMLFlow, GridRenderer, Canvas}
import com.simplesys.SmartClient.Grids.listGrid.HeaderSpan.HeaderSpan
import com.simplesys.SmartClient.Grids.listGrid.ListGridField.ListGridField
import com.simplesys.SmartClient.Grids.listGrid.{UserFormula, RecordEditor}
import com.simplesys.SmartClient.Layout.{HLayout, Layout, AbstractVLayoutCompanion, VLayout}
import com.simplesys.SmartClient.System.SortSpecifier.SortSpecifier
import com.simplesys.SmartClient.System.{Tree, Types}
import com.simplesys.SmartClient.System.Types.AdvancedCriteria.AdvancedCriteria
import com.simplesys.SmartClient.System.Types._
import com.simplesys.SmartClient.System.Class
import com.simplesys.SmartClient.System.selection.CellSelection
import com.simplesys.isc.System.Types.Alignment.Alignment
import com.simplesys.isc.System.Types.AnimationAcceleration.AnimationAcceleration
import com.simplesys.isc.System.Types.AutoComplete.AutoComplete
import com.simplesys.isc.System.Types.AutoFitEvent.AutoFitEvent
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
import com.simplesys.isc.System.Types.GroupStartOpen.GroupStartOpen
import com.simplesys.isc.System.Types.HoverMode.HoverMode
import com.simplesys.isc.System.Types.ListGridComponent.ListGridComponent
import com.simplesys.isc.System.Types.ListGridEditEvent.ListGridEditEvent
import com.simplesys.isc.System.Types.Overflow.Overflow
import com.simplesys.isc.System.Types.RecordDropPosition.RecordDropPosition
import com.simplesys.isc.System.Types.ReorderPosition.ReorderPosition
import com.simplesys.isc.System.Types.RowEndEditAction.RowEndEditAction
import com.simplesys.isc.System.Types.SortDirection.SortDirection
import com.simplesys.isc.System.Types.SummaryFunction.SummaryFunction
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
    def getFilterEditorType(field: ListGridField): String
    def getFilterEditorValueMap(field: ListGridField): ValueMap
    def getFocusRow(): Int
    def getFormulaFieldValue(field: ListGridField, record: ListGridRecord): Double | String
    def getGridSummary(field: ListGridField): js.Any
    def getGridSummaryData(): js.Array[ListGridRecord]
    def getGridSummaryFunction(field: ListGridField): SummaryFunction
    def getGroupByFields(): js.Array[String]
    def getGroupByText(field: ListGridField): HTMLString
    def getGroupNodeHTML(node: Types.Object): Unit
    def getGroupState(): ListGridGroupState
    def getGroupSummaryData(records: js.Array[ListGridRecord], groupNode: ListGridRecord): js.Array[ListGridRecord]
    def getGroupTreeSelection(excludePartialSelection: Boolean = js.native, groupNodesOnly: Boolean = js.native): js.Array[ListGridRecord]
    def getHeaderContextMenuItems(fieldNum: Int): js.Array[MenuItem]
    def getHeaderSpanContextMenuItems(headerSpan: HeaderSpan): js.Array[MenuItem]
    def getOriginalData(): Types.Object
    def getRecord(recordNum: Int): ListGridRecord
    def getRecordComponent(rowNum: Int, colNum: Int = js.native): Canvas
    def getRecordDropPosition(): RecordDropPosition
    def getRecordIndex(record: ListGridRecord): Int
    def getRecordSummary(record: ListGridRecord, field: ListGridField): js.Any
    def getRelatedDataSource(record: ListGridRecord): DataSource
    def getRequiredFieldMessage(field: ListGridField, record: ListGridRecord): String
    def getRollOverCanvas(rowNum: Int, colNum: Int): Canvas
    def getRollUnderCanvas(rowNum: Int, colNum: Int): Canvas
    def getRowErrors(rowNum: Int): Types.Object
    var getRowHeight: js.Function2[Int, Int, Int]
    def getRowNum(record: ListGridRecord): Int
    def getRowPageTop(rowNum: Int): Int
    var getRowSpan: js.Function3[ListGridRecord, Int, Int, Int]
    def getRowTop(rowNum: Int): Int
    def getSelectedCellData(): js.Array[ListGridRecord]
    def getSelectedRecord(): ListGridRecord
    def getSelectedRecords(excludePartialSelections: Boolean = js.native): js.Array[ListGridRecord]
    def getSelectedState(): ListGridSelectedState
    def getSelection(excludePartialSelections: Boolean = js.native): js.Array[ListGridRecord]
    def getSortByGroupFirst(): Unit
    def getSortField(): String
    def getSortFieldCount(): Int
    def getSortNumeralHTML(fieldName: String, sortIndex: Int): HTMLString
    def getSortSpecifier(fieldName: String): SortSpecifier
    def getSortState(): ListGridSortState
    def getSummaryFieldValue(field: ListGridField, record: ListGridRecord): String
    def getSummaryTitle(field: ListGridField): String
    def getToggleFreezeText(field: ListGridField): HTMLString
    def getTotalRows(): Int
    def getValueIcon(field: ListGridField, value: js.Any, record: ListGridRecord): SCImgURL
    def getViewState(): ListGridViewState
    def getVisibleRows(): js.Array[Int]
    val gridComponents: js.Array[ListGridComponent] | js.Array[js.Any]
    var gridSummaryRecordProperty: String
    def groupBy(arguments: js.Dictionary[js.Any] = js.native): Unit
    var groupByAsyncThreshold: Int
    var groupByComplete: js.Function1[js.Array[String], Unit]
    val groupByField: js.Array[String] | String
    var groupByFieldSummaries: js.Array[String]
    var groupByMaxRecords: Int
    var groupByText: HTMLString
    var groupIcon: SCImgURL
    var groupIconSize: Int
    var groupIndentSize: Int
    var groupLeadingIndent: Int
    var groupNodeBaseStyle: String
    var groupNodeStyle: String
    var groupSortDirection: SortDirection
    var groupStartOpen: js.Array[GroupStartOpen] | GroupStartOpen
    var groupState: ListGridGroupState
    var groupStateChanged: js.ThisFunction0[callbackHandler, Unit]
    var groupSummaryRecordProperty: String
    var groupSummaryStyle: CSSStyleName
    val groupTitleColumnDefaults: ListGridField
    val groupTitleColumnProperties: ListGridField
    val groupTitleField: String
    val groupTree: Tree with AutoChild
    var handleGroupBy: js.Function1[js.Array[String], Boolean]
    def hasChanges(): Boolean
    def hasErrors(): Boolean
    val header: Layout with AutoChild
    val headerAutoFitEvent: AutoFitEvent
    val headerBackgroundColor: CSSColor
    val headerBarStyle: CSSStyleName
    val headerBaseStyle: CSSStyleName
    val headerButtonConstructor: Class
    val headerButtonDefaults: Button
    val headerButtonProperties: Button
    var headerClick: js.Function1[Int, Unit]
    val headerContextMenu: Canvas with AutoChild
    var headerDoubleClick: js.Function1[Int, Unit]
    var headerHeight: Int
    var headerHover: js.Function1[Int, Unit]
    var headerHoverAlign: Alignment
    var headerHoverHeight: Int
    def headerHoverHTML(fieldNum: Int, defaultHTML: HTMLString): HTMLString
    var headerHoverOpacity: Int
    var headerHoverStyle: CSSStyleName
    var headerHoverVAlign: VerticalAlignment
    var headerHoverWidth: Int
    var headerHoverWrap: Boolean
    var headerMenuButton: StatefulCanvas with AutoChild
    val headerMenuButtonConstructor: SCClassName
    val headerMenuButtonHeight: String
    val headerMenuButtonIcon: SCImgURL
    val headerMenuButtonIconHeight: Int
    val headerMenuButtonIconWidth: Int
    val headerMenuButtonWidth: Int
    var headerSpan: StatefulCanvas with MultiAutoChild
    val headerSpanConstructor: SCClassName
    val headerSpanHeight: Int
    var headerSpans: js.Array[HeaderSpan]
    val headerSpanVAlign: VerticalAlignment
    def headerTitleClipped(fieldNum: Int): Boolean
    val headerTitleStyle: SCClassName
    var hideEmptySummaryRow: Boolean
    def hideField(field: String | ListGridField, suppressRelayout: Boolean = js.native): Unit
    def hideFields(fields: js.Array[String] | js.Array[ListGridField], suppressRelayout: Boolean = js.native): Unit
    val hiliteCanReplaceValue: Boolean
    var hiliteEditorSpanTitleSeparator: String
    val hiliteHTMLAfterFormat: Boolean
    val hiliteReplaceValueFieldTitle: String
    var hiliteRowOnFocus: Boolean
    var hilitesChanged: js.ThisFunction0[callbackHandler, Unit]
    var hoverMode: HoverMode
    var iconPadding: Int
    var imageSize: Int
    var includeInSummaryProperty: String
    val initialSort: js.Array[SortSpecifier]
    var instantScrollTrackRedraw: Boolean
    def invalidateCache(): Unit
    def invalidateRecordComponents(): Unit
    var invalidSummaryValue: String
    def isCheckboxField(field: ListGridField): Boolean
    def isExpanded(record: ListGridRecord): Boolean
    def isExpansionField(field: ListGridField): Boolean
    val isGrouped: Boolean
    def isGroupNode(record: ListGridRecord): Boolean
    def isPartiallySelected(record: ListGridRecord): Boolean
    def isRowNumberField(field: ListGridField): Boolean
    def isSelected(record: ListGridRecord): Boolean
    var isSeparatorProperty: String
    def isSortField(fieldName: String): Boolean
    var leaveHeaderMenuButtonSpace: Boolean
    var linkTextProperty: Boolean
    var listEndEditAction: RowEndEditAction
    var loadingDataMessage: HTMLString
    var loadingDataMessageStyle: CSSStyleName
    val loadingMessage: String
    var locateColumnsBy: String
    var locateRowsBy: String
    var longTextEditorThreshold: Int
    var longTextEditorType: String
    def markRecordRemoved(rowNum: Int): Unit
    def markRecordsRemoved(records: js.Array[ListGridRecord] | js.Array[Int]): Unit
    def markSelectionRemoved(): Unit
    var maxExpandedRecords: Int
    val maxExpandedRecordsPrompt: HTMLString
    var minFieldWidth: Int
    var modalEditing: Boolean
    var navigateOnTab: Boolean
    var neverValidate: Boolean
    val normalBaseStyle: CSSStyleName
    var normalCellHeight: Int
    var nullGroupTitle: String
    var offlineMessageStyle: CSSStyleName
    def openGroup(record: ListGridRecord): Boolean
    var originalData: Types.Object
    var originBaseStyle: CSSStyleName
    var parseEditorValue: js.Function4[js.Any, ListGridRecord, Int, Int, js.Any]
    var poolComponentsPerColumn: Boolean
    var printAutoFit: Boolean
    var printBaseStyle: CSSStyleName
    var printBooleanBaseStyle: CSSStyleName
    var printBooleanFalseImage: SCImgURL
}

@js.native
abstract trait AbstractListGridCompanion extends AbstractVLayoutCompanion {
}

@js.native
object ListGrid extends AbstractListGridCompanion        






















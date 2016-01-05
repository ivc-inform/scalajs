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
import com.simplesys.SmartClient.Grids.listGrid.{UserSummary, UserFormula, RecordEditor}
import com.simplesys.SmartClient.Layout.{HLayout, Layout, AbstractVLayoutCompanion, VLayout}
import com.simplesys.SmartClient.System.SortSpecifier.SortSpecifier
import com.simplesys.SmartClient.System.{Selection, Tree, Types, Class}
import com.simplesys.SmartClient.System.Types.AdvancedCriteria.AdvancedCriteria
import com.simplesys.SmartClient.System.Types._
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
import com.simplesys.isc.System.Types.EmbeddedPosition.EmbeddedPosition
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
import com.simplesys.isc.System.Types.RecordComponentPoolingMode.RecordComponentPoolingMode
import com.simplesys.isc.System.Types.RecordDropAppearance.RecordDropAppearance
import com.simplesys.isc.System.Types.RecordDropPosition.RecordDropPosition
import com.simplesys.isc.System.Types.ReorderPosition.ReorderPosition
import com.simplesys.isc.System.Types.RowEndEditAction.RowEndEditAction
import com.simplesys.isc.System.Types.RowSpanEditMode.RowSpanEditMode
import com.simplesys.isc.System.Types.RowSpanSelectionMode.RowSpanSelectionMode
import com.simplesys.isc.System.Types.SelectionAppearance.SelectionAppearance
import com.simplesys.isc.System.Types.SelectionNotificationType.SelectionNotificationType
import com.simplesys.isc.System.Types.SelectionStyle.SelectionStyle
import com.simplesys.isc.System.Types.SortArrow.SortArrow
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
    var printBooleanPartialImage: SCImgURL
    var printBooleanTrueImage: SCImgURL
    var printCheckboxFieldFalseImage: SCImgURL
    var printCheckboxFieldPartialImage: SCImgURL
    var printCheckboxFieldTrueImage: SCImgURL
    var printHeaderStyle: CSSStyleName
    var printMaxRows: Int
    var printWrapCells: Boolean
    var quickDrawAheadRatio: Double
    def recalculateGridSummary(): Unit
    def recalculateSummaries(records: js.Array[ListGridRecord] = js.native, fields: js.Array[ListGridField] = js.native): Unit
    var recordBaseStyleProperty: String
    var recordCanRemoveProperty: String
    var recordCanSelectProperty: String
    var recordClick: js.ThisFunction7[callbackHandler, ListGrid, ListGridRecord, Int, ListGridField, Int, js.Any, js.Any, Boolean]
    var recordComponentHeight: Int
    var recordComponentPoolingMode: RecordComponentPoolingMode
    var recordComponentPosition: EmbeddedPosition
    var recordCustomStyleProperty: String
    var recordDetailDSProperty: String
    var recordDoubleClick: js.ThisFunction7[callbackHandler, ListGrid, ListGridRecord, Int, ListGridField, Int, js.Any, js.Any, Boolean]
    def recordDrop(dropRecords: js.Array[ListGridRecord], targetRecord: ListGridRecord, index: Int, sourceWidget: Canvas): Unit
    var recordDropAppearance: RecordDropAppearance
    var recordEditProperty: String
    val recordEnabledProperty: String
    def recordMarkedAsRemoved(rowNum: Int): Boolean
    var recordSummaryBaseStyle: CSSStyleName
    def redrawHeader(rightNow: Boolean): Unit
    def refreshCell(rowNum: Int, colNum: Int): Unit
    def refreshCellStyle(rowNum: Int, colNum: Int): Unit
    def refreshData(callback: DSCallback = js.native): Unit
    def refreshFields(): Unit
    def refreshRecordComponent(rowNum: Int, colNum: Int = js.native): Unit
    def refreshRow(rowNum: Int): Unit
    def regroup(): Unit
    def removeData(data: ListGridRecord, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): Unit
    var removedCSSText: String
    def removeEmbeddedComponent(record: ListGridRecord | Canvas, component: Canvas = js.native): Unit
    val removeFieldDefaults: ListGridField
    val removeFieldProperties: ListGridField
    var removeFieldTitle: String
    val removeIcon: SCImgURL
    var removeIconSize: Int
    var removeRecordClick: js.ThisFunction1[callbackHandler, Int, Unit]
    def removeSelectedData(callback: DSCallback = js.native, requestProperties: DSRequest = js.native): Unit
    def reorderField(fieldNum: Int, moveToPosition: Int): Unit
    def reorderFields(start: Int, end: Int, moveDelta: Int): Unit
    val reselectOnUpdate: Boolean
    var reselectOnUpdateNotifications: SelectionNotificationType
    def resizeField(fieldNum: Int, newWidth: Int): Unit
    var resizeFieldsInRealTime: Boolean
    def resort(): Unit
    var reverseRTLAlign: Boolean
    val rollOverCanvas: Canvas with AutoChild
    val rollUnderCanvas: Canvas with AutoChild
    var rowClick: js.Function4[ListGridRecord, Int, Int, Boolean, Boolean]
    var rowContextClick: js.Function3[ListGridRecord, Int, Int, Boolean]
    var rowDoubleClick: js.Function4[ListGridRecord, Int, Int, Boolean, Boolean]
    var rowEditorEnter: js.Function3[ListGridRecord, Types.Object, Int, Unit]
    var rowEditorExit: js.Function4[EditCompletionEvent, ListGridRecord, Types.Object, Int, Boolean]
    var rowEndEditAction: RowEndEditAction
    def rowHasChanges(rowNum: Int): Boolean
    def rowHasErrors(rowNum: Int): Boolean
    var rowHover: js.Function3[ListGridRecord, Int, Int, Boolean]
    var rowMouseDown: js.Function3[ListGridRecord, Int, Int, Boolean]
    var rowMouseUp: js.Function3[ListGridRecord, Int, Int, Boolean]
    var rowNumberField: ListGridField with AutoChild
    var rowNumberStart: Int
    var rowNumberStyle: CSSStyleName
    var rowOut: js.Function3[ListGridRecord, Int, Int, Boolean]
    var rowOver: js.Function3[ListGridRecord, Int, Int, Boolean]
    var rowSpanEditMode: RowSpanEditMode
    var rowSpanSelectionMode: RowSpanSelectionMode
    def saveAllEdits(rows: js.Array[Int] = js.native, saveCallback: Callback = js.native): Boolean
    var saveByCell: Boolean
    def saveEdits(editCompletionEvent: EditCompletionEvent = js.native, callback: js.Function4[Int, Int, EditCompletionEvent, Boolean, Unit] = js.native, rowNum: Int = js.native): Unit
    val saveLocally: Boolean
    var saveRequestProperties: DSRequest
    val screenReaderCellSeparator: HTMLString
    val screenReaderRowSeparator: HTMLString
    var scrollRedrawDelay: Int
    def scrollToCell(rowNum: Int, colNum: Int, xPosition: Alignment = js.native, yPosition: VerticalAlignment = js.native): Unit
    var scrollToCellXPosition: Alignment
    var scrollToCellYPosition: VerticalAlignment
    def scrollToColumn(colNum: Int, xPosition: Alignment = js.native): Unit
    def scrollToRow(rowNum: Int, yPosition: VerticalAlignment = js.native): Unit
    var scrollWheelRedrawDelay: Int
    def selectAllRecords(visibleNodesOnly: Boolean = js.native): Unit
    var selectedState: ListGridSelectedState
    var selectHeaderOnSort: Boolean
    val selection: Selection
    var selectionAppearance: SelectionAppearance
    var selectionCanvas: Canvas with AutoChild
    var selectionChanged: js.Function2[ListGridRecord, Boolean, Unit]
    val selectionProperty: String
    var selectionType: SelectionStyle
    val selectionUnderCanvas: Canvas with AutoChild
    var selectionUpdated: js.Function2[ListGridRecord, js.Array[ListGridRecord], Unit]
    var selectOnEdit: Boolean
    def selectRecord(record: ListGridRecord, newState: Boolean = js.native): Unit
    def selectRecords(records: js.Array[ListGridRecord], newState: Boolean = js.native): Unit
    def selectSingleRecord(record: ListGridRecord): Unit
    def setAlternateBodyStyleName(styleName: CSSStyleName): Unit
    def setAlternateRecordStyles(alternateStyles: Boolean): Unit
    def setAutoFitData(autoFitData: String): Unit
    def setAutoFitExtraRecords(extraRecords: Int): Unit
    def setAutoFitFieldWidths(autoFit: Boolean, dontResetWidths: Boolean = js.native): Unit
    def setAutoFitMaxColumns(maxColumns: Int): Unit
    def setAutoFitMaxHeight(height: Int): Unit
    def setAutoFitMaxRecords(maxRecords: Int): Unit
    def setAutoFitMaxWidth(width: Int): Unit
    def setAutoFitWidth(fieldName: String, autoFit: Boolean): Unit
    def setAutoFitWidthApproach(approach: AutoFitWidthApproach): Unit
    def setBodyOverflow(overflow: Overflow): Unit
    def setBodyStyleName(styleName: CSSStyleName): Unit
    def setCanExpandRecords(canExpand: Boolean): Unit
    def setCanFreezeFields(canFreeze: Boolean): Unit
    def setCanReorderRecords(canReorderRecords: Boolean): Unit
    def setCanResizeFields(canResize: Boolean): Unit
    def setCriteria(criteria: Criteria | AdvancedCriteria): Unit
    def setData(newData: js.Array[ListGridRecord]): Unit
    def setDataSource(dataSource: DataSource, fields: js.Array[ListGridField]): Unit
    def setDontAutoDestroyComponent(component: Canvas, dontAutoDestroy: Boolean): Unit
    def setEditorValueMap(fieldID: Types.Object | Int | String, map: Types.Object): Unit
    def setEditValue(rowNum: Int, colNum: Int, value: js.Any): Unit
    def setEditValues(rowNum: Int, values: Types.Object): Unit
    def setFastCellUpdates(fastCellUpdates: Boolean): Unit
    def setFieldButtonProperties(name: String, properties: Canvas): Unit
    def setFieldCellIcon(fieldName: String, cellIcon: SCImgURL): Unit
    def setFieldError(rowNum: Int, fieldName: Int, errorMessage: String): Unit
    def setFieldHeaderBaseStyle(name: String, newStyle: CSSStyleName): Unit
    def setFieldHeaderTitleStyle(name: String, newStyle: CSSStyleName): Unit
    def setFieldIcon(fieldName: String, icon: SCImgURL): Unit
    def setFieldProperties(fieldNum: String, properties: ListGridField): Unit
    def setFields(newFields: js.Array[ListGridField] = js.native): Unit
    def setFieldState(fieldState: ListGridFieldState): Unit
    def setFieldTitle(fieldNum: Int | String, title: String): Unit
    def setFilterEditorCriteria(criteria: Criteria | AdvancedCriteria): Unit
    def setGroupByFieldSummaries(groupByFieldSummaries: js.Array[String]): Unit
    def setGroupState(groupState: ListGridGroupState): Unit
    def setHeaderHeight(height: Int): Unit
    def setHeaderSpanBaseStyle(name: String, newStyle: CSSStyleName): Unit
    def setHeaderSpanButtonProperties(name: String, properties: Canvas): Unit
    def setHeaderSpanHeaderTitle(name: String, newTitle: String): Unit
    def setHeaderSpans(headerSpans: js.Array[HeaderSpan]): Unit
    def setHeaderSpanTitle(name: String, newTitle: String): Unit
    def setHeaderSpanTitleStyle(name: String, newTitle: CSSStyleName): Unit
    def setRecordComponentHeight(height: Int): Unit
    def setRowErrors(rowNum: Int, errors: js.Any): Unit
    def setSelectedState(selectedState: ListGridSelectedState): Unit
    def setSelectionAppearance(selectionAppearance: String): Unit
    def setSelectionType(selectionType: SelectionStyle): Unit
    def setShowCollapsedGroupSummary(showCollapsedGroupSummary: Boolean): Unit
    def setShowFilterEditor(value: Boolean): Unit
    def setShowGridSummary(showGridSummary: Boolean): Unit
    def setShowGroupSummary(showGroupSummary: Boolean): Unit
    def setShowGroupSummaryInHeader(showGroupSummaryInHeader: Boolean): Unit
    def setShowHeader(show: Boolean): Unit
    def setShowRecordComponents(showRecordComponents: Boolean): Unit
    def setSort(sortSpecifiers: js.Array[SortSpecifier]): Unit
    def setSortByGroupFirst(sortByGroupFirst: Boolean): Unit
    def setSortHandler(sortSpecifiers: js.Array[SortSpecifier]): Unit
    def setSortState(sortState: ListGridSortState): Unit
    def setUserFormula(field: ListGridField | String, userFormula: UserFormula = js.native): Unit
    def setUserFormulaText(field: ListGridField | String, text: String = js.native): Unit
    def setUserSummary(field: ListGridField | String, userSummary: UserSummary = js.native): Unit
    def setUserSummaryText(field: ListGridField | String, text: String = js.native): Unit
    def setValueMap(fieldID: String | Int, map: Types.Object): Unit
    def setViewState(viewState: ListGridViewState): Unit
    var showAllColumns: Boolean
    var showAllRecords: Boolean
    var showAsynchGroupingPrompt: Boolean
    var showBackgroundComponents: Boolean
    var showCellContextMenus: Boolean
    var showClippedHeaderTitlesOnHover: Boolean
    var showClippedValuesOnHover: Boolean
    var showCollapsedGroupSummary: Boolean
    var showEmptyMessage: Boolean
    var showErrorIcons: Boolean
    var showExpansionEditorSaveButton: Boolean
    def showField(field: String | ListGridField, suppressRelayout: Boolean = js.native): Unit
    def showFields(fields: js.Array[String] | js.Array[ListGridField], suppressRelayout: Boolean = js.native): Unit
    var showFilterEditor:Boolean
    var showGridSummary:Boolean
    var showGroupSummary:Boolean
    var showGroupSummaryInHeader:Boolean
    var showGroupTitleColumn:Boolean
    var showHeader:Boolean
    var showHeaderContextMenu:Boolean
    var showHeaderMenuButton:Boolean
    var showHeaderSpanTitlesInFormulaBuilder:Boolean
    var showHeaderSpanTitlesInHiliteEditor:Boolean
    var showHeaderSpanTitlesInSortEditor:Boolean
    var showHilitesInGroupSummary:Boolean
    var showPartialSelection:Boolean
    var showRecordComponent:js.Function2[ListGridRecord, Int, Boolean]
    var showRecordComponents:Boolean
    var showRecordComponentsByCell:Boolean
    var showRollOver:Boolean
    var showRollOverCanvas:Boolean
    var showRollUnderCanvas:Boolean
    var showRowNumbers:Boolean
    var showSelectedStyle:Boolean
    var showSelectionCanvas:Boolean
    var showSelectionUnderCanvas:Boolean
    var showSortArrow:SortArrow
    var showSortNumerals:Boolean
    var showTreeColumnPicker:Boolean
    var shrinkForFreeze:Boolean
    var singleCellValueProperty:String
    def sort (sortField:String|Int = js.native, sortDirection:SortDirection)
}

@js.native
abstract trait AbstractListGridCompanion extends AbstractVLayoutCompanion {
}

@js.native
object ListGrid extends AbstractListGridCompanion        






















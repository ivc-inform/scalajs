package com.simplesys.SmartClient.Grids.listGrid

import com.simplesys.SmartClient.DataBinding.{DSRequest, DataSource}
import com.simplesys.SmartClient.Forms.{Validator, DynamicForm}
import com.simplesys.SmartClient.Forms.FormsItems.FormItem
import com.simplesys.SmartClient.Forms.FormsItems.formItem.FormItemIcon
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Grids.Grid
import com.simplesys.SmartClient.System.Types
import com.simplesys.SmartClient.System.Types.{Criteria, ValueMap}
import com.simplesys.System.Types2.Alignment.Alignment
import com.simplesys.System.Types2.AutoComplete.AutoComplete
import com.simplesys.System.Types2.AutoFitWidthApproach.AutoFitWidthApproach
import com.simplesys.System.Types2.DateDisplayFormat.DateDisplayFormat
import com.simplesys.System.Types2.EditCompletionEvent.EditCompletionEvent
import com.simplesys.System.Types2.EnterKeyEditAction.EnterKeyEditAction
import com.simplesys.System.Types2.EscapeKeyEditAction.EscapeKeyEditAction
import com.simplesys.System.Types2.HiliteIconPosition.HiliteIconPosition
import com.simplesys.System.Types2.ListGridFieldType.ListGridFieldType
import com.simplesys.System.Types2.OperatorId.OperatorId
import com.simplesys.System.Types2.RecordSummaryFunction.RecordSummaryFunction
import com.simplesys.System.Types2.SortDirection.SortDirection
import com.simplesys.System.Types2.SummaryFunction.SummaryFunction
import com.simplesys.System.Types2.TextMatchStyle.TextMatchStyle
import com.simplesys.System.Types2.TimeDisplayFormat.TimeDisplayFormat
import com.simplesys.System.Types2._
import com.simplesys.Types1.{JSArray, JSAny}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait ListGridField extends Types.Object {
    var align: Alignment
    var applyAfterSummary: Boolean
    var autoComplete: AutoComplete
    var autoFetchDisplayMap: Boolean
    var autoFitWidth: Boolean
    var autoFitWidthApproach: AutoFitWidthApproach
    var autoFreeze: Boolean
    var baseStyle: CSSStyleName
    var canAutoFitWidth: Boolean
    var canDragResize: Boolean
    var canEdit: Boolean
    var canEditFormula: Boolean
    var canEditSummary: Boolean
    var canExport: Boolean
    var canFilter: Boolean
    var canFreeze: Boolean
    var canGroupBy: Boolean
    var canHide: Boolean
    var canHilite: Boolean
    var canReorder: Boolean
    var canSort: Boolean
    var canSortClientOnly: Boolean
    var canToggle: Boolean
    var cellAlign: Alignment
    var cellChanged: js.Function6[ListGridRecord, JSAny, JSAny, Int, Int, Grid[ListGridField, ListGridRecord], void]
    var cellIcon: SCImgURL
    var change: js.Function4[DynamicForm, FormItem, JSAny, JSAny, Boolean]
    var changed: js.Function3[DynamicForm, FormItem, JSAny, void]
    var dataPath: String
    var dateFormatter: DateDisplayFormat
    var decimalPad: Int
    var decimalPrecision: Int
    def defaultDynamicValue(item: FormItem, form: DynamicForm, values: Types.Object): void
    var defaultFilterValue: JSAny
    val defaultGroupingMode: String
    val defaultIconSrc: String
    var defaultValue: JSAny
    var defaultWidth: Int
    var displayField: String
    var displayValueFromRecord: Boolean
    var editorEnter: js.Function5[ListGridRecord, JSAny, Int, Int, Grid[ListGridField, ListGridRecord], void]
    var editorExit: js.Function6[EditCompletionEvent, ListGridRecord, JSAny, Int, Int, Grid[ListGridField, ListGridRecord], void]
    val editorIconHeight: Int
    val editorIconWidth: Int
    var editorImageURLPrefix: String
    var editorImageURLSuffix: String
    var editorProperties: FormItem
    var editorType: FormItemClassName
    var editorValueIconHeight: Int
    var editorValueIcons: Types.Object
    var editorValueIconWidth: Int
    var editorValueMap: Types.Object
    var emptyCellValue: HTMLString
    var enterKeyEditAction: EnterKeyEditAction
    var escapeHTML: Boolean
    var escapeKeyEditAction: EscapeKeyEditAction
    var exportFieldWidth: Boolean
    var exportFormat: FormatString
    val exportRawValues: Boolean
    var filterEditorProperties: FormItem
    var filterEditorType: FormItemClassName
    var filterEditorValueMap: Types.Object
    var filterOnKeypress: Boolean
    var filterOperator: OperatorId
    val format: FormatString
    def formatCellValue(value: JSAny, record: ListGridRecord, rowNum: Int, colNum: Int, grid: Grid[ListGridField, ListGridRecord]): HTMLString
    def formatEditorValue(value: JSAny, record: ListGridRecord, rowNum: Int, colNum: Int, grid: Grid[ListGridField, ListGridRecord]): JSAny
    var formatGridSummary: String
    var formatGroupSummary: String
    var frozen: Boolean
    def getAutoFreezePosition(): Int
    def getEditorValueMap(values: Types.Object, field: ListGridField, grid: Grid[ListGridField, ListGridRecord]): ValueMap
    def getFieldTitle(viewer: Grid[ListGridField, ListGridRecord], fieldNum: Int): String
    def getGridSummary(records: JSArray[ListGridRecord], field: ListGridField, groupSummaries: JSArray[Types.Object] = js.native): JSAny
    def getGroupSummary(records: JSArray[ListGridRecord], field: ListGridField, groupNode: Types.Object = js.native): JSAny
    def getGroupTitle(groupValue: JSAny, groupNode: groupNode, field: Types.Object, fieldName: String, grid: Grid[ListGridField, ListGridRecord]): JSAny
    def getGroupValue(value: JSAny, record: ListGridRecord, field: Types.Object, fieldName: String, grid: Grid[ListGridField, ListGridRecord]): JSAny
    def getRecordSummary(record: ListGridRecord, field: ListGridField, grid: Grid[ListGridField, ListGridRecord]): JSAny
    def getSummaryTitle(viewer: Grid[ListGridField, ListGridRecord], field: ListGridField): void
    val groupGranularity: Int
    val groupingMode: String
    val groupingModes: ValueMap
    val groupPrecision: Int
    val headerBaseStyle: CSSStyleName
    var headerHoverDelay: Int
    val headerTitle: String
    var headerTitleStyle: CSSStyleName
    var hidden: Boolean
    val hiliteHTMLAfterFormat: Boolean
    val hiliteIconHeight: Int
    val hiliteIconLeftPadding: Int
    var hiliteIconPosition: HiliteIconPosition
    var hiliteIconRightPadding: Int
    var hiliteIconSize: Int
    var hiliteIconWidth: Int
    var hoverDelay: Int
    var hoverHTML: js.Function5[ListGridRecord, JSAny, Int, Int, Grid[ListGridField, ListGridRecord], HTMLString]
    var hoverWidth: Int
    var hoverWrap: Boolean
    var icon: SCImgURL
    var iconHeight: Int
    var iconOrientation: String
    var icons: JSArray[FormItemIcon]
    var iconSize: Int
    var iconSpacing: Int
    var iconVAlign: String
    var iconWidth: Int
    var ignoreKeyboardClicks: Boolean
    var imageHeight: Int
    var imageSize: Int
    var imageURLPrefix: String
    var imageURLSuffix: String
    var imageWidth: Int
    var includeFrom: String
    var includeInRecordSummary: Boolean
    val includeInRecordSummaryFields: JSArray[String]
    val initialValue: JSAny
    var inputFormat: DateInputFormat
    val isRemoveField: Boolean
    val leaveHeaderMenuButtonSpace: Boolean
    var linkText: String
    var linkTextProperty: String
    var linkURLPrefix: String
    var linkURLSuffix: String
    var multiple: Boolean
    var name: String
    var optionCriteria: Criteria
    var optionDataSource: String
    var optionFilterContext: DSRequest
    var optionOperationId: String
    var optionTextMatchStyle: TextMatchStyle
    def parseEditorValue(value: JSAny, record: Types.Object, rowNum: Int, colNum: Int, grid: Grid[ListGridField, ListGridRecord]): JSAny
    var partialSummary: Boolean
    var prompt: HTMLString
    var recordClick: js.Function7[Grid[ListGridField, ListGridRecord], ListGridRecord, Int, ListGridField, Int, JSAny, JSAny, Boolean]
    var recordDoubleClick: js.Function7[Grid[ListGridField, ListGridRecord], ListGridRecord, Int, ListGridField, Int, JSAny, JSAny, Boolean]
    var recordSummaryFunction: RecordSummaryFunction
    var required: Boolean
    var shouldPrint: Boolean
    var showAlternateStyle: Boolean
    var showDefaultContextMenu: Boolean
    var showDisabledIcon: Boolean
    var showDownIcon: Boolean
    var showFileInline: Boolean
    var showFocusedIcon: Boolean
    var showGridSummary: Boolean
    var showGroupSummary: Boolean
    var showHover: Boolean
    var showIf: js.Function3[Grid[ListGridField, ListGridRecord], ListGridField, Int, Boolean]
    var showRollOverIcon: Boolean
    var showSelectedIcon: Boolean
    var showTitle: Boolean
    var showValueIconOnly: Boolean
    var sortByDisplayField: Boolean
    var sortByMappedValue: Boolean
    var sortDirection: SortDirection
    def sortNormalizer(recordObject: Types.Object, fieldName: String, context: Grid[ListGridField, ListGridRecord]): JSAny
    var summaryFunction: SummaryFunction | JSArray[SummaryFunction]
    var summaryTitle: String
    var summaryValue: HTMLString
    val summaryValueTitle: String
    var suppressValueIcon: Boolean
    var target: String
    var timeFormatter: TimeDisplayFormat
    var title: String
    var `type`: ListGridFieldType
    var userFormula: UserFormula
    var userSummary: UserSummary
    var validateOnChange: Boolean
    var validators: JSArray[Validator]
    var valueField: String
    var valueIconClick: js.Function6[Grid[ListGridField, ListGridRecord], ListGridRecord, Int, ListGridField, JSAny, FormItem, Boolean]
    var valueIconHeight: Int
    var valueIconLeftPadding: Int
    var valueIconOrientation: String
    var valueIconRightPadding: Int
    var valueIcons: Types.Object
    var valueIconSize: Int
    var valueIconWidth: Int
    var valueMap: Types.Object | JSArray[String]
    var width: Int | String
    var wrap: Boolean
}

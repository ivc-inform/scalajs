package com.simplesys.SmartClient.Grids.listGrid

import com.simplesys.SmartClient.DataBinding.{DSRequest, DataSource}
import com.simplesys.SmartClient.Forms.{Validator, DynamicForm}
import com.simplesys.SmartClient.Forms.FormsItems.FormItem
import com.simplesys.SmartClient.Forms.FormsItems.formItem.FormItemIcon
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Grids.ListGrid
import com.simplesys.SmartClient.System.Types
import com.simplesys.SmartClient.System.Types.{Criteria, ValueMap}
import com.simplesys.System.Types.Alignment.Alignment
import com.simplesys.System.Types.AutoComplete.AutoComplete
import com.simplesys.System.Types.AutoFitWidthApproach.AutoFitWidthApproach
import com.simplesys.System.Types.DateDisplayFormat.DateDisplayFormat
import com.simplesys.System.Types.EditCompletionEvent.EditCompletionEvent
import com.simplesys.System.Types.EnterKeyEditAction.EnterKeyEditAction
import com.simplesys.System.Types.EscapeKeyEditAction.EscapeKeyEditAction
import com.simplesys.System.Types.HiliteIconPosition.HiliteIconPosition
import com.simplesys.System.Types.ListGridFieldType.ListGridFieldType
import com.simplesys.System.Types.OperatorId.OperatorId
import com.simplesys.System.Types.RecordSummaryFunction.RecordSummaryFunction
import com.simplesys.System.Types.SortDirection.SortDirection
import com.simplesys.System.Types.SummaryFunction.SummaryFunction
import com.simplesys.System.Types.TextMatchStyle.TextMatchStyle
import com.simplesys.System.Types.TimeDisplayFormat.TimeDisplayFormat
import com.simplesys.System.Types._

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

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
    var cellChanged: js.Function6[ListGridRecord, js.Any, js.Any, Int, Int, ListGrid[ListGridField, ListGridRecord], void]
    var cellIcon: SCImgURL
    var change: js.Function4[DynamicForm, FormItem, js.Any, js.Any, Boolean]
    var changed: js.Function3[DynamicForm, FormItem, js.Any, void]
    var dataPath: String
    var dateFormatter: DateDisplayFormat
    var decimalPad: Int
    var decimalPrecision: Int
    def defaultDynamicValue(item: FormItem, form: DynamicForm, values: Types.Object): void
    var defaultFilterValue: js.Any
    val defaultGroupingMode: String
    val defaultIconSrc: String
    var defaultValue: js.Any
    var defaultWidth: Int
    var displayField: String
    var displayValueFromRecord: Boolean
    var editorEnter: js.Function5[ListGridRecord, js.Any, Int, Int, ListGrid[ListGridField, ListGridRecord], void]
    var editorExit: js.Function6[EditCompletionEvent, ListGridRecord, js.Any, Int, Int, ListGrid[ListGridField, ListGridRecord], void]
    val editorIconHeight: Int
    val editorIconWidth: Int
    var editorImageURLPrefix: String
    var editorImageURLSuffix: String
    var editorProperties: FormItem
    var editorType: FormItem
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
    var filterEditorType: FormItem
    var filterEditorValueMap: Types.Object
    var filterOnKeypress: Boolean
    var filterOperator: OperatorId
    val format: FormatString
    def formatCellValue(value: js.Any, record: ListGridRecord, rowNum: Int, colNum: Int, grid: ListGrid[ListGridField, ListGridRecord]): HTMLString
    def formatEditorValue(value: js.Any, record: ListGridRecord, rowNum: Int, colNum: Int, grid: ListGrid[ListGridField, ListGridRecord]): js.Any
    var formatGridSummary: String
    var formatGroupSummary: String
    var frozen: Boolean
    def getAutoFreezePosition(): Int
    def getEditorValueMap(values: Types.Object, field: ListGridField, grid: ListGrid[ListGridField, ListGridRecord]): ValueMap
    def getFieldTitle(viewer: ListGrid[ListGridField, ListGridRecord], fieldNum: Int): String
    def getGridSummary(records: Array[ListGridRecord], field: ListGridField, groupSummaries: Array[Types.Object] = js.native): js.Any
    def getGroupSummary(records: Array[ListGridRecord], field: ListGridField, groupNode: Types.Object = js.native): js.Any
    def getGroupTitle(groupValue: js.Any, groupNode: GroupNode, field: Types.Object, fieldName: String, grid: ListGrid[ListGridField, ListGridRecord]): js.Any
    def getGroupValue(value: js.Any, record: ListGridRecord, field: Types.Object, fieldName: String, grid: ListGrid[ListGridField, ListGridRecord]): js.Any
    def getRecordSummary(record: ListGridRecord, field: ListGridField, grid: ListGrid[ListGridField, ListGridRecord]): js.Any
    def getSummaryTitle(viewer: ListGrid[ListGridField, ListGridRecord], field: ListGridField): void
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
    var hoverHTML: js.Function5[ListGridRecord, js.Any, Int, Int, ListGrid[ListGridField, ListGridRecord], HTMLString]
    var hoverWidth: Int
    var hoverWrap: Boolean
    var icon: SCImgURL
    var iconHeight: Int
    var iconOrientation: String
    var icons: Array[FormItemIcon]
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
    val includeInRecordSummaryFields: Array[String]
    val initialValue: js.Any
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
    def parseEditorValue(value: js.Any, record: Types.Object, rowNum: Int, colNum: Int, grid: ListGrid[ListGridField, ListGridRecord]): js.Any
    var partialSummary: Boolean
    var prompt: HTMLString
    var recordClick: js.Function7[ListGrid[ListGridField, ListGridRecord], ListGridRecord, Int, ListGridField, Int, js.Any, js.Any, Boolean]
    var recordDoubleClick: js.Function7[ListGrid[ListGridField, ListGridRecord], ListGridRecord, Int, ListGridField, Int, js.Any, js.Any, Boolean]
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
    var showIf: js.Function3[ListGrid[ListGridField, ListGridRecord], ListGridField, Int, Boolean]
    var showRollOverIcon: Boolean
    var showSelectedIcon: Boolean
    var showTitle: Boolean
    var showValueIconOnly: Boolean
    var sortByDisplayField: Boolean
    var sortByMappedValue: Boolean
    var sortDirection: SortDirection
    def sortNormalizer(recordObject: Types.Object, fieldName: String, context: ListGrid[ListGridField, ListGridRecord]): js.Any
    var summaryFunction: SummaryFunction | js.Array[SummaryFunction]
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
    var validators: Array[Validator]
    var valueField: String
    var valueIconClick: js.Function6[ListGrid[ListGridField, ListGridRecord], ListGridRecord, Int, ListGridField, js.Any, FormItem, Boolean]
    var valueIconHeight: Int
    var valueIconLeftPadding: Int
    var valueIconOrientation: String
    var valueIconRightPadding: Int
    var valueIcons: Types.Object
    var valueIconSize: Int
    var valueIconWidth: Int
    var valueMap: Types.Object | js.Array[String]
    var width: Int | String
    var wrap: Boolean
}

package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.SmartClient.DataBinding.DataSource
import com.simplesys.SmartClient.Forms.DynamicForm
import com.simplesys.SmartClient.Forms.FormsItems.formItem.FormItemIcon
import com.simplesys.SmartClient.Grids.listGrid.ListGridRecord
import com.simplesys.SmartClient.System.Types.Criteria
import com.simplesys.SmartClient.System.{Criterion, Types, AbstractClassCompanion, Class}
import com.simplesys.isc.System.Types.Alignment.Alignment
import com.simplesys.isc.System.Types.AutoComplete.AutoComplete
import com.simplesys.isc.System.Types.DateDisplayFormat.DateDisplayFormat
import com.simplesys.isc.System.Types.FormItemElementType.FormItemElementType
import com.simplesys.isc.System.Types.OperatorId.OperatorId
import com.simplesys.isc.System.Types.TextMatchStyle.TextMatchStyle
import com.simplesys.isc.System.Types.VerticalAlignment.VerticalAlignment
import com.simplesys.isc.System.Types._

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait FormItem extends Class {
    var accessKey: Char
    var align: Alignment
    var allowExpressions: Boolean
    var alwaysFetchMissingValues: Boolean
    var applyAlignToText: Boolean
    var applyHeightToTextBox: Boolean
    var ariaRole: String
    var ariaState: Types.Object
    var autoComplete: AutoComplete
    var blur: js.Function2[DynamicForm, FormItem, _]
    def blurItem(): Unit
    var browserSpellCheck: Boolean
    var canEdit: Boolean
    def canEditCriterion(criterion: Criterion): Boolean
    var canEditOpaqueValues: Boolean
    var canFocus: Boolean
    var canSelectText: Boolean
    var cellHeight: Int
    var cellStyle: FormItemBaseStyle
    var change: js.Function4[DynamicForm, FormItem, js.Any, js.Any, Boolean]
    var changed: js.Function3[DynamicForm, FormItem, js.Any, _]
    def clearErrors(): Unit
    def clearValue(): Unit
    var click: js.Function2[DynamicForm, FormItem, Boolean]
    var clipStaticValue: Boolean
    var clipTitle: Boolean
    var colSpan: Int
    var containerWidget: CanvasItem
    var controlStyle: FormItemBaseStyle
    val criteriaField: String
    val dataPath: DataPath
    var dateFormatter: DateDisplayFormat
    var decimalPad: Int
    var decimalPrecision: Int
    var defaultDynamicValue: js.Function3[FormItem, DynamicForm, Types.Object, _]
    var defaultIconSrc: SCImgURL
    var defaultValue: js.Any
    def disable(): Unit
    var disabled: Boolean
    def disableIcon(icon: String): Unit
    var disableIconsOnReadOnly: Boolean
    var displayField: String
    var doubleClick: js.Function2[DynamicForm, FormItem, Boolean]
    var editorEnter: js.Function3[DynamicForm, FormItem, js.Any, _]
    var editorExit: js.Function3[DynamicForm, FormItem, js.Any, _]
    var editorType: FormItem
    var editPendingCSSText: CSSText
    var emptyDisplayValue: String
    var emptyValueIcon: String
    def enable()
    def enableIcon(icon: String)
    var endRow: Boolean
    var errorIconHeight: Int
    var errorIconSrc: SCImgURL
    var errorIconWidth: Int
    var errorMessageWidth: Int
    var errorOrientation: Alignment
    var exportFormat: FormatString
    var filterLocally: Boolean
    var focus: js.Function2[DynamicForm, FormItem, _]
    def focusInItem(): Unit
    val foreignDisplayField: String
    val form: DynamicForm
    val format: FormatString
    var formatEditorValue: js.Function4[js.Any, ListGridRecord, DynamicForm, FormItem, String]
    var formatValue: js.Function4[js.Any, ListGridRecord, DynamicForm, FormItem, String]
    def getCanEdit(): Boolean
    def getCanFocus(): Boolean
    def getCriterion(textMatchStyle: TextMatchStyle): Criterion
    def getCursorPosition(): Int
    def getCustomState(elementType: FormItemElementType, derivedState: String): String
    def getDataPath(): DataPath
    def getDisplayFieldName(): String
    def getDisplayValue(value: js.Any): js.Any
    def getErrorHTML(error: String | js.Array[String]): HTMLString
    def getErrors(): String | js.Array[String]
    def getFieldName(): String
    def getFullDataPath(): DataPath
    def getGridColNum(): Int
    def getGridRowNum(): Int
    def getIcon(name: String): FormItemIcon
    def getIconHeight(icon: Types.Object): Int
    def getIconWidth(icon: Types.Object): Int
    def getLeft(): Int
    def getOptionDataSource(): DataSource
    def getPageLeft(): Int
    def getPageRect(): js.Array[Int]
    def getPageTop(): Int
    def getPixelHeight(): Int
    def getPixelWidth(): Int
    def getPrintValueIcon(value: js.Any): SCImgURL
    def getPrintValueIconStyle(value: js.Any): CSSClassName
    def getRect(): js.Array[Int]
    def getSelectedRecord(): ListGridRecord
    def getTitle(): HTMLString
    def getTop(): Int
    def getValue(): js.Any
    def getValueFieldName(): String
    def getValueIcon(value: js.Any): SCImgURL
    def getValueIconStyle(value: js.Any): CSSClassName
    def getVisibleHeight(): Int
    def getVisibleTitleWidth(labelOnly: Boolean): Int
    def getVisibleWidth(): Int
    def getWidth(): Int
    var globalTabIndex: Int
    def hasAdvancedCriteria(): Boolean
    def hasErrors(): Boolean
    var height: String | Int
    var hidden: Boolean
    def hide(): Unit
    def hideIcon(icon: String): Unit
    var hint: HTMLString
    var hintStyle: CSSClassName
    var hoverAlign: Alignment
    var hoverDelay: Int
    var hoverHeight: Int
    var hoverOpacity: Int
    var hoverStyle: CSSStyleName
    var hoverVAlign: VerticalAlignment
    var hoverWidth: Int
    var iconClick: js.Function3[DynamicForm, FormItem, FormItemIcon, _]
    var iconHeight: Int
    var iconHSpace: Int
    var iconKeyPress: js.Function5[String, Char, DynamicForm, FormItem, FormItemIcon, _]
    var iconPrompt: HTMLString
    var icons: js.Array[FormItemIcon]
    var iconVAlign: VerticalAlignment
    var iconWidth: Int
    var ID: String
    var imageURLPrefix: String
    var imageURLSuffix: String
    var implicitSave: Boolean
    var implicitSaveOnBlur: Boolean
    var inputFormat: DateInputFormat
    def invalidateDisplayValueCache(): Unit
    def isDisabled(): Boolean
    def isDrawn(): Boolean
    def isFocused(): Boolean
    def isInGrid(): Boolean
    def isVisible(): Boolean
    var itemHover: js.Function2[FormItem, DynamicForm, _]
    var itemHoverHTML: js.Function2[FormItem, DynamicForm, HTMLString]
    var keyDown: js.Function3[FormItem, DynamicForm, String, Boolean]
    var keyPress: js.Function3[FormItem, DynamicForm, Char, Boolean]
    var keyUp: js.Function3[FormItem, DynamicForm, KeyName, Boolean]
    var left: Int
    var loadingDisplayValue: String
    var locateItemBy: String
    def mapDisplayToValue(value: String): Types.Object
    def mapValueToDisplay(value: Types.Object): String
    val multipleValueSeparator: String
    val name: String
    val operator: OperatorId
    val optionCriteria: Criteria
    val optionDataSource: String | DataSource
}

@js.native
abstract trait AbstractFormItemCompanion extends AbstractClassCompanion {
    def create(): Unit = js.native
}

@js.native
object FormItem extends AbstractFormItemCompanion        

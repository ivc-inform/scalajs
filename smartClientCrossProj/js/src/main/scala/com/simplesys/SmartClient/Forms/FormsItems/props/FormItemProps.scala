package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.SmartClient.DataBinding.DataSource
import com.simplesys.SmartClient.Forms.FormsItems.FormItems._
import com.simplesys.SmartClient.Forms.FormsItems.formItem.FormItemIcon
import com.simplesys.SmartClient.Forms.FormsItems.{CanvasItem, FormItem}
import com.simplesys.SmartClient.Forms.{DynamicForm, Validator}
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Grids.listGrid.ListGridRecord
import com.simplesys.SmartClient.RPC.RPCRequest
import com.simplesys.SmartClient.System.Types
import com.simplesys.SmartClient.System.Types._
import com.simplesys.SmartClient.System.props.ClassProps
import com.simplesys.System.Types.Alignment.Alignment
import com.simplesys.System.Types.AutoComplete.AutoComplete
import com.simplesys.System.Types.DateDisplayFormat.DateDisplayFormat
import com.simplesys.System.Types.FormItemType.FormItemType
import com.simplesys.System.Types.OperatorId.OperatorId
import com.simplesys.System.Types.ReadOnlyDisplayAppearance.ReadOnlyDisplayAppearance
import com.simplesys.System.Types.TitleOrientation.TitleOrientation
import com.simplesys.System.Types.VerticalAlignment.VerticalAlignment
import com.simplesys.System.Types._
import com.simplesys.option.{FormItemType_String, IntString, ScNone, ScOption}
import com.simplesys.Types1._

import scala.scalajs.js
import scala.scalajs.js._

class FormItemProps extends ClassProps {
    var accessKey: ScOption[Char] = ScNone
    var align: ScOption[Alignment] = ScNone
    var allowExpressions: ScOption[Boolean] = ScNone
    var alwaysFetchMissingValues: ScOption[Boolean] = ScNone
    var applyAlignToText: ScOption[Boolean] = ScNone
    var applyHeightToTextBox: ScOption[Boolean] = ScNone
    var ariaRole: ScOption[String] = ScNone
    var ariaState: ScOption[Types.Object] = ScNone
    var autoComplete: ScOption[AutoComplete] = ScNone
    var blur: ScOption[js.Function2[DynamicForm, FormItem, _]] = ScNone
    var browserSpellCheck: ScOption[Boolean] = ScNone
    var canEdit: ScOption[Boolean] = ScNone
    var canEditOpaqueValues: ScOption[Boolean] = ScNone
    var canFocus: ScOption[Boolean] = ScNone
    var canSelectText: ScOption[Boolean] = ScNone
    var cellHeight: ScOption[Int] = ScNone
    var cellStyle: ScOption[FormItemBaseStyle] = ScNone
    var change: ScOption[js.Function4[DynamicForm, FormItem, JSAny, JSAny, Boolean]] = ScNone
    var changed: ScOption[js.Function3[DynamicForm, FormItem, JSAny, _]] = ScNone
    var changeOnKeypress: ScOption[Boolean] = ScNone
    var click: ScOption[js.Function2[DynamicForm, FormItem, Boolean]] = ScNone
    var clipStaticValue: ScOption[Boolean] = ScNone
    var clipTitle: ScOption[Boolean] = ScNone
    var colSpan: ScOption[Int] = ScNone
    var containerWidget: ScOption[CanvasItem] = ScNone
    var controlStyle: ScOption[FormItemBaseStyle] = ScNone
    var criteriaField: ScOption[String] = ScNone
    var dataPath: ScOption[DataPath] = ScNone
    var dateFormatter: ScOption[DateDisplayFormat] = ScNone
    var decimalPad: ScOption[Int] = ScNone
    var decimalPrecision: ScOption[Int] = ScNone
    var defaultDynamicValue: ScOption[js.Function3[FormItem, DynamicForm, Types.Object, _]] = ScNone
    var defaultIconSrc: ScOption[SCImgURL] = ScNone
    var defaultValue: ScOption[JSAny] = ScNone
    var disabled: ScOption[Boolean] = ScNone
    var disableIconsOnReadOnly: ScOption[Boolean] = ScNone
    var displayField: ScOption[String] = ScNone
    var doubleClick: ScOption[js.Function2[DynamicForm, FormItem, Boolean]] = ScNone
    var editorEnter: ScOption[js.Function3[DynamicForm, FormItem, JSAny, _]] = ScNone
    var editorExit: ScOption[js.Function3[DynamicForm, FormItem, JSAny, _]] = ScNone
    var editorType: ScOption[FormItems] = ScNone
    var editPendingCSSText: ScOption[CSSText] = ScNone
    var emptyDisplayValue: ScOption[String] = ScNone
    var emptyValueIcon: ScOption[String] = ScNone
    var endRow: ScOption[Boolean] = ScNone
    var errorIconHeight: ScOption[Int] = ScNone
    var errorIconSrc: ScOption[SCImgURL] = ScNone
    var errorIconWidth: ScOption[Int] = ScNone
    var errorMessageWidth: ScOption[Int] = ScNone
    var errorOrientation: ScOption[Alignment] = ScNone
    var exportFormat: ScOption[FormatString] = ScNone
    var filterLocally: ScOption[Boolean] = ScNone
    var focus: ScOption[js.Function2[DynamicForm, FormItem, _]] = ScNone
    var foreignDisplayField: ScOption[String] = ScNone
    var form: ScOption[DynamicForm] = ScNone
    var format: ScOption[FormatString] = ScNone
    var formatEditorValue: ScOption[js.Function4[JSAny, ListGridRecord, DynamicForm, FormItem, String]] = ScNone
    var formatValue: ScOption[js.Function4[JSAny, ListGridRecord, DynamicForm, FormItem, String]] = ScNone
    var globalTabIndex: ScOption[Int] = ScNone
    var height: ScOption[IntString[Int, String]] = ScNone
    var hidden: ScOption[Boolean] = ScNone
    var hint: ScOption[HTMLString] = ScNone
    var hintStyle: ScOption[CSSClassName] = ScNone
    var hoverAlign: ScOption[Alignment] = ScNone
    var hoverDelay: ScOption[Int] = ScNone
    var hoverHeight: ScOption[Int] = ScNone
    var hoverOpacity: ScOption[Int] = ScNone
    var hoverStyle: ScOption[CSSStyleName] = ScNone
    var hoverVAlign: ScOption[VerticalAlignment] = ScNone
    var hoverWidth: ScOption[Int] = ScNone
    var iconClick: ScOption[js.Function3[DynamicForm, FormItem, FormItemIcon, _]] = ScNone
    var iconHeight: ScOption[Int] = ScNone
    var iconHSpace: ScOption[Int] = ScNone
    var iconKeyPress: ScOption[js.Function5[String, Char, DynamicForm, FormItem, FormItemIcon, _]] = ScNone
    var iconPrompt: ScOption[HTMLString] = ScNone
    var icons: ScOption[JSArray[FormItemIcon]] = ScNone
    var iconVAlign: ScOption[VerticalAlignment] = ScNone
    var iconWidth: ScOption[Int] = ScNone
    var ID: ScOption[String] = ScNone
    var imageURLPrefix: ScOption[String] = ScNone
    var imageURLSuffix: ScOption[String] = ScNone
    var implicitSave: ScOption[Boolean] = ScNone
    var implicitSaveOnBlur: ScOption[Boolean] = ScNone
    var inputFormat: ScOption[DateInputFormat] = ScNone
    var itemHover: ScOption[js.Function2[FormItem, DynamicForm, _]] = ScNone
    var itemHoverHTML: ScOption[js.Function2[FormItem, DynamicForm, HTMLString]] = ScNone
    var keyDown: ScOption[js.Function3[FormItem, DynamicForm, String, Boolean]] = ScNone
    var keyPress: ScOption[js.Function3[FormItem, DynamicForm, Char, Boolean]] = ScNone
    var keyUp: ScOption[js.Function3[FormItem, DynamicForm, KeyName, Boolean]] = ScNone
    var left: ScOption[Int] = ScNone
    var loadingDisplayValue: ScOption[String] = ScNone
    var locateItemBy: ScOption[String] = ScNone
    var multipleValueSeparator: ScOption[String] = ScNone
    var name: ScOption[String] = ScNone
    var operator: ScOption[OperatorId] = ScNone
    var optionCriteria: ScOption[Criteria] = ScNone
    var optionDataSource: ScOption[DataSource] = ScNone
    var optionFilterContext: ScOption[RPCRequest] = ScNone
    var optionOperationId: ScOption[String] = ScNone
    var originalValueMessage: ScOption[HTMLString] = ScNone
    var parseEditorValue: ScOption[js.Function3[String, DynamicForm, FormItem, JSAny]] = ScNone
    var pendingStatusChanged: ScOption[js.Function5[DynamicForm, FormItem, Boolean, JSAny, JSAny, Boolean]] = ScNone
    var picker: ScOption[Canvas] = ScNone
    var pickerConstructor: ScOption[SCClassName] = ScNone
    var pickerIconClick: ScOption[js.Function3[DynamicForm, FormItem, FormItemIcon, _]] = ScNone
    var pickerIconDefaults: ScOption[FormItemIcon] = ScNone
    var pickerIconHeight: ScOption[Int] = ScNone
    var pickerIconName: ScOption[String] = ScNone
    var pickerIconPrompt: ScOption[HTMLString] = ScNone
    var pickerIconProperties: ScOption[FormItemIcon] = ScNone
    var pickerIconSrc: ScOption[SCImgURL] = ScNone
    var pickerIconStyle: ScOption[FormItemBaseStyle] = ScNone
    var pickerIconWidth: ScOption[Int] = ScNone
    var pickerProperties: ScOption[Canvas] = ScNone
    var printTextBoxStyle: ScOption[FormItemBaseStyle] = ScNone
    var printTitleStyle: ScOption[FormItemBaseStyle] = ScNone
    var prompt: ScOption[HTMLString] = ScNone
    var readOnlyDisplay: ScOption[ReadOnlyDisplayAppearance] = ScNone
    var readOnlyTextBoxStyle: ScOption[FormItemBaseStyle] = ScNone
    var redrawOnChange: ScOption[Boolean] = ScNone
    var rejectInvalidValueOnChange: ScOption[Boolean] = ScNone
    var required: ScOption[Boolean] = ScNone
    var requiredMessage: ScOption[String] = ScNone
    var rowSpan: ScOption[Int] = ScNone
    var saveOnEnter: ScOption[Boolean] = ScNone
    var selectOnClick: ScOption[Boolean] = ScNone
    var selectOnFocus: ScOption[Boolean] = ScNone
    var shouldSaveValue: ScOption[Boolean] = ScNone
    var shouldStopKeyPressBubbling: ScOption[js.Function2[String, Int, Boolean]] = ScNone
    var showClippedTitleOnHover: ScOption[Boolean] = ScNone
    var showClippedValueOnHover: ScOption[Boolean] = ScNone
    var showDeletions: ScOption[Boolean] = ScNone
    var showDisabled: ScOption[Boolean] = ScNone
    var showErrorIcon: ScOption[Boolean] = ScNone
    var showErrorStyle: ScOption[Boolean] = ScNone
    var showErrorText: ScOption[Boolean] = ScNone
    var showFocused: ScOption[Boolean] = ScNone
    var showFocusedErrorState: ScOption[Boolean] = ScNone
    var showFocusedIcons: ScOption[Boolean] = ScNone
    var showFocusedPickerIcon: ScOption[Boolean] = ScNone
    var showHint: ScOption[Boolean] = ScNone
    var showIcons: ScOption[Boolean] = ScNone
    var showIf: ScOption[js.Function4[FormItem, JSAny, DynamicForm, Types.Object, Boolean]] = ScNone
    var showOldValueInHover: ScOption[Boolean] = ScNone
    var showOverIcons: ScOption[Boolean] = ScNone
    var showPending: ScOption[Boolean] = ScNone
    var showPickerIcon: ScOption[Boolean] = ScNone
    var showRTL: ScOption[Boolean] = ScNone
    var showTitle: ScOption[Boolean] = ScNone
    var showValueIconOnly: ScOption[Boolean] = ScNone
    var startRow: ScOption[Boolean] = ScNone
    var staticHeight: ScOption[Int] = ScNone
    var stopOnError: ScOption[Boolean] = ScNone
    var suppressValueIcon: ScOption[Boolean] = ScNone
    var synchronousValidation: ScOption[Boolean] = ScNone
    var tabIndex: ScOption[Int] = ScNone
    var textAlign: ScOption[Alignment] = ScNone
    var textBoxStyle: ScOption[FormItemBaseStyle] = ScNone
    //    var timeFormatter: ScOption[TimeDisplayFormat] = ScNone
    var title: ScOption[String] = ScNone
    var titleAlign: ScOption[Alignment] = ScNone
    var titleClassName: ScOption[CSSStyleName] = ScNone
    var titleClick: ScOption[js.Function2[DynamicForm, FormItem, Boolean]] = ScNone
    var titleColSpan: ScOption[Int] = ScNone
    var titleDoubleClick: ScOption[js.Function2[DynamicForm, FormItem, Boolean]] = ScNone
    var titleHover: ScOption[js.Function2[DynamicForm, FormItem, Boolean]] = ScNone
    var titleHoverHTML: ScOption[js.Function2[DynamicForm, FormItem, HTMLString]] = ScNone
    var titleOrientation: ScOption[TitleOrientation] = ScNone
    var titleStyle: ScOption[FormItemBaseStyle] = ScNone
    var titleVAlign: ScOption[VerticalAlignment] = ScNone
    var top: ScOption[Int] = ScNone
    var transformInput: ScOption[js.Function4[DynamicForm, FormItem, JSAny, JSAny, JSAny]] = ScNone
    var useDisabledHintStyleForReadOnly: ScOption[Boolean] = ScNone
    var validateOnChange: ScOption[Boolean] = ScNone
    var validateOnExit: ScOption[Boolean] = ScNone
    var validators: ScOption[JSArray[Validator]] = ScNone
    var validOperators: ScOption[JSArray[OperatorId]] = ScNone
    var vAlign: ScOption[VerticalAlignment] = ScNone
    var value: ScOption[JSAny] = ScNone
    var valueDeselectedCSSText: ScOption[CSSText] = ScNone
    var valueField: ScOption[JSAny] = ScNone
    var valueHover: ScOption[js.Function2[FormItem, DynamicForm, _]] = ScNone
    var valueHoverHTML: ScOption[js.Function2[FormItem, DynamicForm, HTMLString]] = ScNone
    var valueIconClick: ScOption[js.Function3[FormItem, DynamicForm, JSAny, Boolean]] = ScNone
    var valueIconHeight: ScOption[Int] = ScNone
    var valueIconLeftPadding: ScOption[Int] = ScNone
    var valueIconRightPadding: ScOption[Int] = ScNone
    var valueIconSize: ScOption[Int] = ScNone
    var valueIconWidth: ScOption[Int] = ScNone
    var valueIcons: ScOption[JSDictionary[String]] = ScNone
    var valueMap: ScOption[ValueMap] = ScNone
    var visible: ScOption[Boolean] = ScNone
    var width: ScOption[IntString[Int, String]] = ScNone
    var wrapTitle: ScOption[Boolean] = ScNone
    var `type`: ScOption[FormItemType_String[FormItemType, String]] = ScNone
}

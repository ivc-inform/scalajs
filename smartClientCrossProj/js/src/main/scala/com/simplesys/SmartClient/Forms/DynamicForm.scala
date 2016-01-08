package com.simplesys.SmartClient.Forms

import com.simplesys.SmartClient.DataBinding.dataSource.DSCallback
import com.simplesys.SmartClient.DataBinding.{DataSource, DSRequest, DataBoundComponent}
import com.simplesys.SmartClient.Forms.FormsItems.FormItem
import com.simplesys.SmartClient.Forms.dynamicForm.FormItemEventInfo
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Grids.ListGrid
import com.simplesys.SmartClient.Grids.listGrid.{ListGridRecord, ListGridField}
import com.simplesys.SmartClient.System.Types.AdvancedCriteria.AdvancedCriteria
import com.simplesys.SmartClient.System.Types.{ValueMap, Criteria, Record}
import com.simplesys.SmartClient.System.{Criterion, KeyIdentifier, Types, AbstractClassCompanion}
import com.simplesys.SmartClient.Workdlow.UserTask
import com.simplesys.isc.System.Types.Alignment.Alignment
import com.simplesys.isc.System.Types.AutoComplete.AutoComplete
import com.simplesys.isc.System.Types.DSOperationType.DSOperationType
import com.simplesys.isc.System.Types.DateDisplayFormat.DateDisplayFormat
import com.simplesys.isc.System.Types.Encoding.Encoding
import com.simplesys.isc.System.Types.FormMethod.FormMethod
import com.simplesys.isc.System.Types.OperatorId.OperatorId
import com.simplesys.isc.System.Types.ReadOnlyDisplayAppearance.ReadOnlyDisplayAppearance
import com.simplesys.isc.System.Types.TextMatchStyle.TextMatchStyle
import com.simplesys.isc.System.Types.TimeDisplayFormat.TimeDisplayFormat
import com.simplesys.isc.System.Types.TitleOrientation.TitleOrientation
import com.simplesys.isc.System.Types.VisibilityMode.VisibilityMode
import com.simplesys.isc.System.Types._

import scala.scalajs.js
import scala.scalajs.js.{Any, Array, |}

@js.native
trait DynamicForm extends Canvas with DataBoundComponent {
    var action: URL
    def addFieldErrors(fieldName: String, errors: Array[String], show: Boolean): Unit
    var allowExpressions: Boolean
    var autoComplete: AutoComplete
    val autoFetchTextMatchStyle: TextMatchStyle
    var autoFocus: Boolean
    var autoFocusOnError: Boolean
    var browserSpellCheck: Boolean
    def cancel(requestProperties: DSRequest = js.native): Unit
    def cancelEditing(): Unit
    var cancelParamName: String
    var cancelParamValue: String
    var canEdit: Boolean
    var canSubmit: Boolean
    val canTabToSectionHeaders: Boolean
    var cellBorder: Int
    var cellPadding: Int
    def clearErrors(show: Boolean): Unit
    def clearFieldErrors(fieldName: String, show: Boolean): Unit
    def clearValue(fieldName: String): Unit
    def clearValues(): Unit
    var clipItemTitles: Boolean
    var clipStaticValue: Boolean
    var colWidths: Array[Any]
    def completeEditing(): Unit
    var dateFormatter: DateDisplayFormat
    var datetimeFormatter: DateDisplayFormat
    val defaultSearchOperator: OperatorId
    var disableValidation: Boolean
    def editNewRecord(initialValues: Types.Object | Record = js.native): Unit
    def editRecord(record: Record): Unit
    def editSelectedData(selectionComponent: ListGrid[ListGridField] | String): Unit
    var encoding: Encoding
    val errorItemCellStyle: String
    val errorItemProperties: Types.Object
    var errorOrientation: Alignment
    var errors: Array[Types.Object]
    val errorsPreamble: HTMLString
    def fetchData(criteria: Criteria = js.native, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): Unit
    def fetchRelatedData(record: ListGridRecord, schema: Canvas | DataSource | String, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): Unit
    def fieldIsEditable(field: FormItem | Int | String): Boolean
    var fields: Array[FormItem]
    def filterData(criteria: Criteria = js.native, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): Unit
    var fixedColWidths: Boolean
    def focusInItem(itemName: String): Unit
    def formSubmitFailed(): Unit
    var formSubmitFailedWarning: String
    def getChangedValues(): Types.Object
    def getEditorType(field: Types.Object, values: Types.Object = js.native): String
    def getErrors(): Types.Object
    def getErrorsHTML(errors: Types.Object): HTMLString
    def getEventItem(): FormItem
    def getEventItemInfo(): FormItemEventInfo
    def getField(itemName: String): FormItem
    def getFieldErrors(fieldName: String): Array[String]
    def getFields(): Array[FormItem]
    def getFocusItem(): FormItem
    def getItem(itemName: String): FormItem
    def getItemErrorHTML(item: FormItem, error: Array[String]): Unit
    def getItems(): Array[FormItem]
    def getOldValues(): Types.Object
    def getSaveOperationType(requestProperties: DSRequest = js.native): DSOperationType
    def getTitleAlign(item: FormItem): Alignment
    def getTitleOrientation(item: FormItem = js.native): TitleOrientation
    def getValidatedValues(): Types.Object
    def getValue(fieldName: String): js.Any
    def getValues(): Types.Object
    def getValuesAsAdvancedCriteria(textMatchStyle: TextMatchStyle = js.native): AdvancedCriteria
    def getValuesAsCriteria(advanced: Boolean, textMatchStyle: TextMatchStyle = js.native): Criteria | AdvancedCriteria
    def handleAsyncValidationReply(success: Boolean, errors: Types.Object): Unit
    var handleHiddenValidationErrors: js.ThisFunction1[DynamicForm, Types.Object, Boolean]
    def hasErrors(): Boolean
    def hasFieldErrors(fieldName: String): Boolean
    def hideItem(itemName: String): Unit
    var hiliteRequiredFields: Boolean
    var implicitSave: Boolean
    var implicitSaveDelay: Int
    var implicitSaveOnBlur: Boolean
    def isNewRecord(): Boolean
    def isPendingAsyncValidation(): Boolean
    var itemChange: js.Function3[FormItem, js.Any, js.Any, Boolean]
    var itemChanged: js.Function2[FormItem, js.Any, _]
    var itemHoverAlign: Alignment
    var itemHoverDelay: Int
    var itemHoverHeight: Int
    var itemHoverHTML: js.Function1[FormItem, _]
    var itemHoverOpacity: Int
    var itemHoverStyle: CSSStyleName
    var itemHoverVAlign: Int
    var itemHoverWidth: Int
    var itemKeyPress: js.Function3[FormItem, String, Int, Boolean]
    var itemLayout: String
    var items: Array[FormItem]
    var longTextEditorThreshold: Int
    var longTextEditorType: String
    var method: FormMethod
    var minColWidth: Int
    var nestedEditorType: String
    var nestedListEditorType: String
    var numCols: Int
    var operator: OperatorId
    var originalValueMessage: HTMLString
    var readOnlyDisplay: ReadOnlyDisplayAppearance
    var readOnlyTextBoxStyle: FormItemBaseStyle
    var rejectInvalidValueOnChange: Boolean
    def rememberValues(): Types.Object
    var requiredMessage: HTMLString
    var requiredRightTitlePrefix: HTMLString
    var requiredTitlePrefix: HTMLString
    var requiredTitleSuffix: HTMLString
    def reset(): Unit
    def resetValues(): Unit
    val revertValueKey: KeyIdentifier
    var rightTitlePrefix: HTMLString
    var rightTitleSuffix: HTMLString
    def saveData(callback: DSCallback = js.native, requestProperties: DSRequest = js.native): Unit
    var saveOnEnter: Boolean
    var saveOperationType: DSOperationType
    var sectionVisibilityMode: VisibilityMode
    var selectOnClick: Boolean
    var selectOnFocus: Boolean
    def setAction(action: URL): Unit
    def setCanEdit(canEdit: Boolean): Unit
    def setErrors(errors: Types.Object, showErrors: Boolean): Unit
    def setFieldErrors(fieldName: String, errors: Array[String], show: Boolean): Unit
    def setFields(itemList: Array[FormItem]): Unit
    def setItems(itemList: Array[FormItem]): Unit
    def setMethod(method: FormMethod): Unit
    def setReadOnlyDisplay(appearance: ReadOnlyDisplayAppearance): Unit
    def setSaveOperationType(operationType: DSOperationType): Unit
    def setTarget(target: String): Unit
    def setTitleOrientation(titleOrientation: TitleOrientation): Unit
    def setValue(fieldName: String, value: js.Any): Unit
    def setValueMap(itemName: String, valueMap: ValueMap): Unit
    def setValues(newData: Types.Object = js.native): Unit
    def setValuesAsCriteria(criteria: Criterion): Unit
    val showComplexFieldsRecursively: Boolean
    val showDeletions: Boolean
    val showErrorIcons: Boolean
    def showErrors(): Unit
    var showErrorStyle: Boolean
    var showErrorText: Boolean
    def showFieldErrors(fieldName: String): Unit
    var showInlineErrors: Boolean
    def showItem(fieldName: String): Unit
    var showOldValueInHover: Boolean
    var showTitlesWithErrorMessages: Boolean
    val stopOnError: Boolean
    def submit(callback: DSCallback = js.native, requestProperties: DSRequest = js.native): Unit
    def submitForm(): Unit
    var submitValues: js.Function2[Types.Object, DynamicForm, _]
    var suppressValidationErrorCallback: Boolean
    var synchronousValidation: Boolean
    var target: String
    var timeFormatter: TimeDisplayFormat
    var titleAlign: Alignment
    var titleClipped: js.Function1[FormItem, Boolean]
    var titleHoverHTML: js.Function1[FormItem, HTMLString]
    var titleOrientation: TitleOrientation
    var titlePrefix: HTMLString
    var titleSuffix: HTMLString
    var titleWidth: String | Int
    var userTask: UserTask
    def validate(validateHiddenFields: Boolean): Boolean
    def validateData(callback: DSCallback = js.native, requestProperties: DSRequest = js.native): Unit
    var validateOnChange: Boolean
    var validateOnExit: Boolean
    var validationURL: URL
    def valueHoverHTML(item: FormItem): Unit
    var values: Types.Object
    def valuesAreValid(validateHiddenFields: Boolean, returnErrors: Boolean): Boolean | Types.Object
    var valuesChanged: js.ThisFunction0[DynamicForm, _]
    def valuesHaveChanged(): Boolean
    var wrapItemTitles: Boolean
}


@js.native
abstract trait AbstractDynamicFormCompanion extends AbstractClassCompanion {
}

@js.native
object DynamicForm extends AbstractDynamicFormCompanion        

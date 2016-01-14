package com.simplesys.SmartClient.Forms

import com.simplesys.SmartClient.DataBinding._
import com.simplesys.SmartClient.Forms.FormsItems.FormItem
import com.simplesys.SmartClient.Forms.dynamicForm.FormItemEventInfo
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Grids.ListGrid
import com.simplesys.SmartClient.Grids.listGrid.{ListGridField, ListGridRecord}
import com.simplesys.SmartClient.System.Types.{Criteria, Record, ValueMap}
import com.simplesys.SmartClient.System.{AbstractClassCompanion, KeyIdentifier, Types}
import com.simplesys.SmartClient.Workdlow.UserTask
import com.simplesys.System.Types.Alignment.Alignment
import com.simplesys.System.Types.AutoComplete.AutoComplete
import com.simplesys.System.Types.DSOperationType.DSOperationType
import com.simplesys.System.Types.DateDisplayFormat.DateDisplayFormat
import com.simplesys.System.Types.Encoding.Encoding
import com.simplesys.System.Types.FormMethod.FormMethod
import com.simplesys.System.Types.OperatorId.OperatorId
import com.simplesys.System.Types.ReadOnlyDisplayAppearance.ReadOnlyDisplayAppearance
import com.simplesys.System.Types.TextMatchStyle.TextMatchStyle
import com.simplesys.System.Types.TimeDisplayFormat.TimeDisplayFormat
import com.simplesys.System.Types.TitleOrientation.TitleOrientation
import com.simplesys.System.Types.VisibilityMode.VisibilityMode
import com.simplesys.System.Types._

import scala.scalajs.js
import scala.scalajs.js._

@js.native
trait DynamicForm extends Canvas with DataBoundComponent {
    var action: URL
    def addFieldErrors(fieldName: String, errors: Array[String], show: Boolean): void
    var allowExpressions: Boolean
    var autoComplete: AutoComplete
    val autoFetchTextMatchStyle: TextMatchStyle
    var autoFocus: Boolean
    var autoFocusOnError: Boolean
    var browserSpellCheck: Boolean
    def cancel(requestProperties: DSRequest = js.native): void
    def cancelEditing(): void
    var cancelParamName: String
    var cancelParamValue: String
    var canEdit: Boolean
    var canSubmit: Boolean
    val canTabToSectionHeaders: Boolean
    var cellBorder: Int
    var cellPadding: Int
    def clearErrors(show: Boolean): void
    def clearFieldErrors(fieldName: String, show: Boolean): void
    def clearValue(fieldName: String): void
    def clearValues(): void
    var clipItemTitles: Boolean
    var clipStaticValue: Boolean
    var colWidths: Array[Any]
    def completeEditing(): void
    var dateFormatter: DateDisplayFormat
    var datetimeFormatter: DateDisplayFormat
    val defaultSearchOperator: OperatorId
    var disableValidation: Boolean
    def editNewRecord(initialValues: Types.Object | Record = js.native): void
    def editRecord(record: Record): void
    def editSelectedData(selectionComponent: ListGrid[ListGridField, ListGridRecord] | String): void
    var encoding: Encoding
    val errorItemCellStyle: String
    val errorItemProperties: Types.Object
    var errorOrientation: Alignment
    var errors: Array[Types.Object]
    val errorsPreamble: HTMLString
    def fetchData(criteria: Criteria = js.native, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): void
    def fetchRelatedData(record: ListGridRecord, schema: Canvas | DataSource | String, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): void
    def fieldIsEditable(field: FormItem | Int | String): Boolean
    var fields: Array[FormItem]
    def filterData(criteria: Criteria = js.native, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): void
    var fixedColWidths: Boolean
    def focusInItem(itemName: String): void
    def formSubmitFailed(): void
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
    def getItemErrorHTML(item: FormItem, error: Array[String]): void
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
    def handleAsyncValidationReply(success: Boolean, errors: Types.Object): void
    var handleHiddenValidationErrors: js.ThisFunction1[DynamicForm, Types.Object, Boolean]
    def hasErrors(): Boolean
    def hasFieldErrors(fieldName: String): Boolean
    def hideItem(itemName: String): void
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
    def reset(): void
    def resetValues(): void
    val revertValueKey: KeyIdentifier
    var rightTitlePrefix: HTMLString
    var rightTitleSuffix: HTMLString
    def saveData(callback: DSCallback = js.native, requestProperties: DSRequest = js.native): void
    var saveOnEnter: Boolean
    var saveOperationType: DSOperationType
    var sectionVisibilityMode: VisibilityMode
    var selectOnClick: Boolean
    var selectOnFocus: Boolean
    def setAction(action: URL): void
    def setCanEdit(canEdit: Boolean): void
    def setErrors(errors: Types.Object, showErrors: Boolean): void
    def setFieldErrors(fieldName: String, errors: Array[String], show: Boolean): void
    def setFields(itemList: Array[FormItem]): void
    def setItems(itemList: Array[FormItem]): void
    def setMethod(method: FormMethod): void
    def setReadOnlyDisplay(appearance: ReadOnlyDisplayAppearance): void
    def setSaveOperationType(operationType: DSOperationType): void
    def setTarget(target: String): void
    def setTitleOrientation(titleOrientation: TitleOrientation): void
    def setValue(fieldName: String, value: js.Any): void
    def setValueMap(itemName: String, valueMap: ValueMap): void
    def setValues(newData: Types.Object = js.native): void
    def setValuesAsCriteria(criteria: Criterion): void
    val showComplexFieldsRecursively: Boolean
    val showDeletions: Boolean
    val showErrorIcons: Boolean
    def showErrors(): void
    var showErrorStyle: Boolean
    var showErrorText: Boolean
    def showFieldErrors(fieldName: String): void
    var showInlineErrors: Boolean
    def showItem(fieldName: String): void
    var showOldValueInHover: Boolean
    var showTitlesWithErrorMessages: Boolean
    val stopOnError: Boolean
    def submit(callback: DSCallback = js.native, requestProperties: DSRequest = js.native): void
    def submitForm(): void
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
    def validateData(callback: DSCallback = js.native, requestProperties: DSRequest = js.native): void
    var validateOnChange: Boolean
    var validateOnExit: Boolean
    var validationURL: URL
    def valueHoverHTML(item: FormItem): void
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

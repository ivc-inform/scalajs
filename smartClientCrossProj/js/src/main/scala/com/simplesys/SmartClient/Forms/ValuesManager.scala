package com.simplesys.SmartClient.Forms

import com.simplesys.SmartClient.DataBinding.Callbacks.DSCallback
import com.simplesys.SmartClient.DataBinding.{AdvancedCriteria, DSRequest, DataSource}
import com.simplesys.SmartClient.Forms.FormsItems.FormItem
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Grids.Grid
import com.simplesys.SmartClient.Grids.listGrid.{ListGridField, ListGridRecord}
import com.simplesys.SmartClient.System.{AbstractClassCompanion, Class}
import com.simplesys.System.Types.DSOperationType.DSOperationType
import com.simplesys.System.Types.OperatorId.OperatorId
import com.simplesys.System.Types.TextMatchStyle.TextMatchStyle
import com.simplesys.System.Types.{Criteria, Record, void}
import com.simplesys.Types1.{JSAny, JSArray}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait ValuesManager extends Class {
    def addFieldErrors(fieldName: String, errors: JSArray[String], showErrors: Boolean): void
    def addMember(member: DynamicForm | String): void
    def addMembers(members: JSArray[DynamicForm] | JSArray[String]): void
    var addOperation: String
    var autoSynchronize: Boolean
    def cancel(requestProperties: DSRequest = js.native): void
    def clearErrors(showErrors: Boolean): void
    def clearFieldErrors(fieldName: String, show: Boolean): void
    def clearValue(fieldName: String): void
    def clearValues(): void
    var dataSource: DataSource | String
    var deepCloneOnEdit: Boolean
    var disableValidation: Boolean
    def editNewRecord(initialValues: js.Object | Record = js.native): void
    def editRecord(record: Record): void
    def editSelectedData(selectionComponent: Grid[ListGridField, ListGridRecord] | String): void
    def fetchData(criteria: Criteria = js.native, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): void
    def filterData(criteria: Criteria = js.native, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): void
    def getChangedValues(): js.Object
    def getDataSource(): DataSource
    def getErrors(): js.Object
    def getFieldErrors(fieldName: String): JSArray[String]
    def getItem(itemID: String, retrieveAll: Boolean = js.native): FormItem
    def getMember(ID: String): Canvas
    def getMemberForField(fieldName: String): Canvas
    def getMembers(): JSArray[Canvas]
    def getMemberValues(ID: String): js.Object
    def getOldValues(): js.Object
    def getSaveOperationType(requestProperties: DSRequest = js.native): DSOperationType
    def getValidatedValues(): js.Object
    def getValue(fieldName: String, component: Canvas = js.native): JSAny
    def getValues(): js.Object
    def getValuesAsAdvancedCriteria(textMatchStyle: TextMatchStyle = js.native): AdvancedCriteria
    def getValuesAsCriteria(advanced: Boolean, textMatchStyle: TextMatchStyle = js.native): Criteria | AdvancedCriteria
    var handleHiddenValidationErrors: js.Function1[js.Object, Boolean]
    def hasErrors(): Boolean
    def hasFieldErrors(fieldName: String): Boolean
    def isNewRecord(): Boolean
    var members: JSArray[DynamicForm]
    val operator: OperatorId
    def rememberValues(): js.Object
    def removeMember(member: DynamicForm | String): void
    def removeMembers(members: JSArray[DynamicForm] | JSArray[String]): void
    var removeOperation: String
    def resetValues(): void
    def saveData(callback: DSCallback = js.native, requestProperties: DSRequest = js.native): void
    var saveOperationType: DSOperationType
    def setDataSource(dataSource: DataSource): void
    def setErrors(errors: Object, showErrors: Boolean): void
    def setFieldErrors(fieldName: String, errors: JSArray[String], showErrors: Boolean): void
    def setMemberValues(ID: String, values: js.Object): void
    def setValue(fieldName: String, newValue: JSAny): void
    def setValues(values: js.Object): void
    def showErrors(): void
    def showFieldErrors(): void
    def submit(callback: DSCallback = js.native, requestProperties: DSRequest = js.native): void
    var submitValues: js.Function2[js.Object, ValuesManager, _]
    var suppressValidationErrorCallback: Boolean
    def synchronizeMember(member: Canvas): void
    def synchronizeMembers(): void
    def synchronizeMembersOnDataPath(dataPath: String): void
    var updateOperation: String
    def validate(): Boolean
    def valuesHaveChanged(): Boolean
}

@js.native
abstract trait AbstractValuesManagerCompanion extends AbstractClassCompanion {
    def getById(ID: String): ValuesManager = js.native
}

@js.native
   object ValuesManager extends AbstractValuesManagerCompanion


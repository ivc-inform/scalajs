package com.simplesys.SmartClient.Forms

import com.simplesys.SmartClient.DataBinding.dataSource.DSCallback
import com.simplesys.SmartClient.DataBinding.{AdvancedCriteria, DataSource, DSRequest}
import com.simplesys.SmartClient.Forms.FormsItems.FormItem
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Grids.ListGrid
import com.simplesys.SmartClient.Grids.listGrid.{ListGridRecord, ListGridField}
import com.simplesys.SmartClient.System.Types.{Criteria, Record}
import com.simplesys.SmartClient.System.{Types, AbstractClassCompanion, Class}
import com.simplesys.System.Types.DSOperationType.DSOperationType
import com.simplesys.System.Types.OperatorId.OperatorId
import com.simplesys.System.Types.TextMatchStyle.TextMatchStyle
import com.simplesys.System.Types.void

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait ValuesManager extends Class {
    def addFieldErrors(fieldName: String, errors: Array[String], showErrors: Boolean): void
    def addMember(member: DynamicForm | String): void
    def addMembers(members: js.Array[DynamicForm] | js.Array[String]): void
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
    def editNewRecord(initialValues: Types.Object | Record = js.native): void
    def editRecord(record: Record): void
    def editSelectedData(selectionComponent: ListGrid[ListGridField, ListGridRecord] | String): void
    def fetchData(criteria: Criteria = js.native, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): void
    def filterData(criteria: Criteria = js.native, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): void
    def getChangedValues(): Types.Object
    def getDataSource(): DataSource
    def getErrors(): Types.Object
    def getFieldErrors(fieldName: String): Array[String]
    def getItem(itemID: String, retrieveAll: Boolean = js.native): FormItem
    def getMember(ID: String): Canvas
    def getMemberForField(fieldName: String): Canvas
    def getMembers(): Array[Canvas]
    def getMemberValues(ID: String): Types.Object
    def getOldValues(): Types.Object
    def getSaveOperationType(requestProperties: DSRequest = js.native): DSOperationType
    def getValidatedValues(): Types.Object
    def getValue(fieldName: String, component: Canvas = js.native): js.Any
    def getValues(): Types.Object
    def getValuesAsAdvancedCriteria(textMatchStyle: TextMatchStyle = js.native): AdvancedCriteria
    def getValuesAsCriteria(advanced: Boolean, textMatchStyle: TextMatchStyle = js.native): Criteria | AdvancedCriteria
    var handleHiddenValidationErrors: js.Function1[Types.Object, Boolean]
    def hasErrors(): Boolean
    def hasFieldErrors(fieldName: String): Boolean
    def isNewRecord(): Boolean
    var members: Array[DynamicForm]
    val operator: OperatorId
    def rememberValues(): Types.Object
    def removeMember(member: DynamicForm | String): void
    def removeMembers(members: js.Array[DynamicForm] | js.Array[String]): void
    var removeOperation: String
    def resetValues(): void
    def saveData(callback: DSCallback = js.native, requestProperties: DSRequest = js.native): void
    var saveOperationType: DSOperationType
    def setDataSource(dataSource: DataSource): void
    def setErrors(errors: Object, showErrors: Boolean): void
    def setFieldErrors(fieldName: String, errors: Array[String], showErrors: Boolean): void
    def setMemberValues(ID: String, values: Types.Object): void
    def setValue(fieldName: String, newValue: js.Any): void
    def setValues(values: Types.Object): void
    def showErrors(): void
    def showFieldErrors(): void
    def submit(callback: DSCallback = js.native, requestProperties: DSRequest = js.native): void
    var submitValues: js.Function2[Types.Object, ValuesManager, _]
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

package companion {

import scala.scalajs.js

@js.native
   object ValuesManager extends AbstractValuesManagerCompanion
}


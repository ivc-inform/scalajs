package com.simplesys.SmartClient.Forms

import com.simplesys.SmartClient.DataBinding.dataSource.DSCallback
import com.simplesys.SmartClient.DataBinding.{DataSource, DSRequest}
import com.simplesys.SmartClient.Forms.FormsItems.FormItem
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Grids.ListGrid
import com.simplesys.SmartClient.Grids.listGrid.ListGridField
import com.simplesys.SmartClient.System.Types.AdvancedCriteria.AdvancedCriteria
import com.simplesys.SmartClient.System.Types.{Criteria, Record}
import com.simplesys.SmartClient.System.{Types, AbstractClassCompanion, Class}
import com.simplesys.isc.System.Types.DSOperationType.DSOperationType
import com.simplesys.isc.System.Types.OperatorId.OperatorId
import com.simplesys.isc.System.Types.TextMatchStyle.TextMatchStyle

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait ValuesManager extends Class {
    def addFieldErrors(fieldName: String, errors: Array[String], showErrors: Boolean): Unit
    def addMember(member: DynamicForm | String): Unit
    def addMembers(members: js.Array[DynamicForm] | js.Array[String]): Unit
    var addOperation: String
    var autoSynchronize: Boolean
    def cancel(requestProperties: DSRequest = js.native): Unit
    def clearErrors(showErrors: Boolean): Unit
    def clearFieldErrors(fieldName: String, show: Boolean): Unit
    def clearValue(fieldName: String): Unit
    def clearValues(): Unit
    var dataSource: DataSource | String
    var deepCloneOnEdit: Boolean
    var disableValidation: Boolean
    def editNewRecord(initialValues: Types.Object | Record = js.native): Unit
    def editRecord(record: Record): Unit
    def editSelectedData(selectionComponent: ListGrid[ListGridField] | String): Unit
    def fetchData(criteria: Criteria = js.native, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): Unit
    def filterData(criteria: Criteria = js.native, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): Unit
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
    def removeMember(member: DynamicForm | String): Unit
    def removeMembers(members: js.Array[DynamicForm] | js.Array[String]): Unit
    var removeOperation: String
    def resetValues(): Unit
    def saveData(callback: DSCallback = js.native, requestProperties: DSRequest = js.native): Unit
    var saveOperationType: DSOperationType
    def setDataSource(dataSource: DataSource): Unit
    def setErrors(errors: Object, showErrors: Boolean): Unit
    def setFieldErrors(fieldName: String, errors: Array[String], showErrors: Boolean): Unit
    def setMemberValues(ID: String, values: Types.Object): Unit
    def setValue(fieldName: String, newValue: js.Any): Unit
    def setValues(values: Types.Object): Unit
    def showErrors(): Unit
    def showFieldErrors(): Unit
    def submit(callback: DSCallback = js.native, requestProperties: DSRequest = js.native): Unit
    var submitValues: js.Function2[Types.Object, ValuesManager, _]
    var suppressValidationErrorCallback: Boolean
    def synchronizeMember(member: Canvas): Unit
    def synchronizeMembers(): Unit
    def synchronizeMembersOnDataPath(dataPath: String): Unit
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

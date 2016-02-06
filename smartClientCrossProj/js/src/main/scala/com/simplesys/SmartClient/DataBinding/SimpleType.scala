package com.simplesys.SmartClient.DataBinding

import com.simplesys.SmartClient.DataBinding.dataSource.DataSourceField
import com.simplesys.SmartClient.DataBinding.simpleType.SummaryConfiguration
import com.simplesys.SmartClient.Forms.{Validator, DynamicForm}
import com.simplesys.SmartClient.Forms.FormsItems.FormItem
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Grids.detailViewer.DetailViewerField
import com.simplesys.SmartClient.Grids.listGrid.ListGridField
import com.simplesys.SmartClient.System.Types.{ValueMap, Record}
import com.simplesys.SmartClient.System.{Types, Class, AbstractClassCompanion}
import com.simplesys.System.Types.OperatorId.OperatorId
import com.simplesys.System.Types.SummaryFunction.SummaryFunction
import com.simplesys.System.Types.{void, ID, FormatString}
import com.simplesys.types.{JSArray, JSAny}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.|

@js.native
trait SimpleType extends Class {
    def compareValues(value1: JSAny, value2: JSAny, field: DataSourceField | ListGridField | DetailViewerField)
    var defaultGroupingMode: String
    def editFormatter(value: JSAny, field: FormItem = js.native, form: DynamicForm = js.native, record: Record = js.native): String
    var editorType: FormItem
    var exportFormat: FormatString
    var fieldProperties: DataSourceField
    var filterEditorType: FormItem
    var format: FormatString
    def getAtomicValue(value: JSAny, reason: String): JSAny
    def getGroupingModes(): ValueMap
    def getGroupTitle(value: JSAny, record: Record, field: Types.Object, fieldName: String, component: Canvas): String
    def getGroupValue(value: JSAny, record: Record, field: Types.Object, fieldName: String, component: Canvas): JSAny
    var groupingModes: ValueMap
    val inheritsFrom: ID
    val name: ID
    def normalDisplayFormatter(value: JSAny, field: FormItem | DetailViewerField = js.native, component: DataBoundComponent = js.native, record: Types.Object = js.native): void
    def parseInput(value: JSAny, field: FormItem = js.native, form: DynamicForm = js.native, record: Record = js.native): void
    var readOnlyEditorType: FormItem
    def shortDisplayFormatter(value: JSAny, field: FormItem | DetailViewerField = js.native, component: DataBoundComponent = js.native, record: Types.Object = js.native): void
    def updateAtomicValue(atomicValue: JSAny, currentValue: JSAny, reason: String): JSAny
    var validators: JSArray[Validator]
    var validOperators: JSArray[OperatorId]
    var valueMap: ValueMap
}

@js.native
abstract trait AbstractSimpleTypeCompanion extends AbstractClassCompanion {
    def applySummaryFunction(records: JSArray[Types.Object], field: DataSourceField, summaryFunction: SummaryFunction, summaryConfig: SummaryConfiguration): JSAny = js.native
    def getDefaultSummaryFunction(typeName: String): SummaryFunction = js.native
    def getType(typeName: String): SimpleType = js.native
    def registerSummaryFunction(functionName: String, method: JSArray[Record] | DataSourceField | SummaryConfiguration): void = js.native
    def setDefaultSummaryFunction(typeName: String, summaryFunction: SummaryFunction): void = js.native
}

@js.native
@JSName("SimpleType")
object SimpleTypeStatic extends AbstractSimpleTypeCompanion

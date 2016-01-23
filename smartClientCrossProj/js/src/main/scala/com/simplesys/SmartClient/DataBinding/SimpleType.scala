package com.simplesys.SmartClient.DataBinding

import com.simplesys.SmartClient.DataBinding.dataSource.DataSourceField
import com.simplesys.SmartClient.Forms.{Validator, DynamicForm}
import com.simplesys.SmartClient.Forms.FormsItems.FormItem
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Grids.detailViewer.DetailViewerField
import com.simplesys.SmartClient.Grids.listGrid.ListGridField
import com.simplesys.SmartClient.System.Types.{ValueMap, Record}
import com.simplesys.SmartClient.System.{Types, Class, AbstractClassCompanion}
import com.simplesys.System.Types.OperatorId.OperatorId
import com.simplesys.System.Types.{void, ID, FormatString}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait SimpleType extends Class {
    def compareValues(value1: js.Any, value2: js.Any, field: DataSourceField | ListGridField | DetailViewerField)
    var defaultGroupingMode: String
    def editFormatter(value: js.Any, field: FormItem = js.native, form: DynamicForm = js.native, record: Record = js.native): String
    var editorType: FormItem
    var exportFormat: FormatString
    var fieldProperties: DataSourceField
    var filterEditorType: FormItem
    var format: FormatString
    def getAtomicValue(value: js.Any, reason: String): js.Any
    def getGroupingModes(): ValueMap
    def getGroupTitle(value: js.Any, record: Record, field: Types.Object, fieldName: String, component: Canvas): String
    def getGroupValue(value: js.Any, record: Record, field: Types.Object, fieldName: String, component: Canvas): js.Any
    var groupingModes: ValueMap
    val inheritsFrom: ID
    val name: ID
    def normalDisplayFormatter(value: js.Any, field: FormItem | DetailViewerField = js.native, component: DataBoundComponent = js.native, record: Types.Object = js.native): void
    def parseInput(value: js.Any, field: FormItem = js.native, form: DynamicForm = js.native, record: Record = js.native): void
    var readOnlyEditorType: FormItem
    def shortDisplayFormatter(value: js.Any, field: FormItem | DetailViewerField = js.native, component: DataBoundComponent = js.native, record: Types.Object = js.native): void
    def updateAtomicValue(atomicValue: js.Any, currentValue: js.Any, reason: String): js.Any
    var validators: js.Array[Validator]
    var validOperators: js.Array[OperatorId]
    var valueMap: ValueMap
}

@js.native
abstract trait AbstractSimpleTypeCompanion extends AbstractClassCompanion {
}

@js.native
object SimpleType extends AbstractSimpleTypeCompanion

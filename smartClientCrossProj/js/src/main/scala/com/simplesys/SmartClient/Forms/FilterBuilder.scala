package com.simplesys.SmartClient.Forms

import com.simplesys.SmartClient.Control.ImgButton
import com.simplesys.SmartClient.DataBinding.DataSource
import com.simplesys.SmartClient.Forms.FormsItems.{FormItem, PickList}
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Layout.{VStack, AbstractLayoutCompanion, Layout}
import com.simplesys.SmartClient.System.Criterion
import com.simplesys.SmartClient.System.Types.AdvancedCriteria.AdvancedCriteria
import com.simplesys.isc.System.Types.AutoChild
import com.simplesys.isc.System.Types.LogicalOperator.LogicalOperator

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait FilterBuilder extends Layout {
    val addButton: ImgButton with AutoChild
    val addButtonPrompt: String
    def addClause(filterClause: FilterClause): Boolean
    def addCriterion(criterion: Criterion): Boolean
    val allowEmpty: Boolean
    val bracket: Canvas with AutoChild
    val clauseStack: VStack with AutoChild
    def clearCriteria(): Unit
    val criteria: AdvancedCriteria
    val dataSource: DataSource
    val defaultSubClauseOperator: LogicalOperator
    val fieldDataSource: DataSource
    val fieldPicker: PickList with AutoChild
    val fieldPickerProperties: FormItem
    val fieldPickerTitle: String
    var filterChanged: js.Function1[Unit, _]
    def getChildFilters(): Array[FilterBuilder]
    def getCriteria(includeEmptyValues: Boolean = js.native): AdvancedCriteria
}

@js.native
abstract trait AbstractFilterBuilderCompanion extends AbstractLayoutCompanion {
}

@js.native
object FilterBuilder extends AbstractFilterBuilderCompanion        

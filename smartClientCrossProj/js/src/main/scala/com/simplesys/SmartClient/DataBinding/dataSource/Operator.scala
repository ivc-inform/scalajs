package com.simplesys.SmartClient.DataBinding.dataSource

import com.simplesys.SmartClient.DataBinding.Criterion
import com.simplesys.SmartClient.Forms.FormsItems.FormItem
import com.simplesys.System.Types.FieldType.FieldType
import com.simplesys.System.Types.OperatorId.OperatorId
import com.simplesys.System.Types.OperatorValueType.OperatorValueType
import com.simplesys.System.Types.{ID, Record}
import com.simplesys.System.{JSAny, JSArray}

import scala.scalajs.js

@js.native
trait Operator extends js.Object {
    def compareCriteria(newCriterion: Criterion, oldCriterion: Criterion): Int
    var condition: js.Function5[JSAny, Record, JSAny, Criterion, Operator, Boolean]
    val editorType: FormItem
    val fieldTypes: JSArray[FieldType]
    def getCriterion(fieldName: String, item: FormItem): Criterion
    val hidden: Boolean
    val ID: OperatorId
    val requiresServer:Boolean
    val symbol:String
    val title:String
    val titleProperty:ID
    val valueType:OperatorValueType
}



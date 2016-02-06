package com.simplesys.SmartClient.DataBinding.dataSource

import com.simplesys.SmartClient.DataBinding.Criterion
import com.simplesys.SmartClient.Forms.FormsItems.FormItem
import com.simplesys.SmartClient.System.Types.Record
import com.simplesys.SmartClient.System.Types
import com.simplesys.System.Types.FieldType.FieldType
import com.simplesys.System.Types.ID
import com.simplesys.System.Types.OperatorId.OperatorId
import com.simplesys.System.Types.OperatorValueType.OperatorValueType
import com.simplesys.Types.{JSArray, JSAny}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait Operator extends Types.Object {
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



package com.simplesys.SmartClient.DataBinding.dataSource

import com.simplesys.SmartClient.Forms.FormsItems.FormItem
import com.simplesys.SmartClient.System.Types.Record
import com.simplesys.SmartClient.System.{Criterion, Types}
import com.simplesys.isc.System.Types.FieldType.FieldType
import com.simplesys.isc.System.Types.ID
import com.simplesys.isc.System.Types.OperatorId.OperatorId
import com.simplesys.isc.System.Types.OperatorValueType.OperatorValueType

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait Operator extends Types.Object {
    def compareCriteria(newCriterion: Criterion, oldCriterion: Criterion): Int
    var condition: js.Function5[js.Any, Record, js.Any, Criterion, Operator, Boolean]
    val editorType: FormItem
    val fieldTypes: Array[FieldType]
    def getCriterion(fieldName: String, item: FormItem): Criterion
    val hidden: Boolean
    val ID: OperatorId
    val requiresServer:Boolean
    val symbol:String
    val title:String
    val titleProperty:ID
    val valueType:OperatorValueType
}



package com.simplesys.SmartClient.DataBinding.props.dataSource

import com.simplesys.SmartClient.DataBinding.Criterion
import com.simplesys.SmartClient.DataBinding.dataSource.Operator
import com.simplesys.SmartClient.Forms.FormsItems.FormItem
import com.simplesys.SmartClient.System.Types.Record
import com.simplesys.System.Types.FieldType.FieldType
import com.simplesys.System.Types.ID
import com.simplesys.System.Types.OperatorId.OperatorId
import com.simplesys.System.Types.OperatorValueType.OperatorValueType
import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.props.AbstractClassProps
import com.simplesys.types.{JSArray, JSAny}

import scala.scalajs.js
import scala.scalajs.js._

class OperatorProps extends AbstractClassProps {
    var condition: ScOption[js.Function5[JSAny, Record, JSAny, Criterion, Operator, Boolean]] = ScNone
    var editorType: ScOption[FormItem] = ScNone
    var fieldTypes: ScOption[JSArray[FieldType]] = ScNone
    var hidden: ScOption[Boolean] = ScNone
    var ID: ScOption[OperatorId] = ScNone
    var requiresServer: ScOption[Boolean] = ScNone
    var symbol: ScOption[String] = ScNone
    var title: ScOption[String] = ScNone
    var titleProperty: ScOption[ID] = ScNone
    var valueType: ScOption[OperatorValueType] = ScNone
}

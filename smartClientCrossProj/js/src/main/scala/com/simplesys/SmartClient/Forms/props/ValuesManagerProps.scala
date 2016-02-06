package com.simplesys.SmartClient.Forms.props

import com.simplesys.SmartClient.DataBinding.DataSource
import com.simplesys.SmartClient.Forms.{DynamicForm, ValuesManager}
import com.simplesys.SmartClient.System.Types
import com.simplesys.SmartClient.System.props.ClassProps
import com.simplesys.System.Types2.DSOperationType.DSOperationType
import com.simplesys.System.Types2.OperatorId.OperatorId
import com.simplesys.option.{ScOption, ScNone}
import com.simplesys.Types1.JSArray

import scala.scalajs.js
import scala.scalajs.js._

class ValuesManagerProps extends ClassProps {
    var addOperation: ScOption[String] = ScNone
    var autoSynchronize: ScOption[Boolean] = ScNone
    var dataSource: ScOption[DataSource | String] = ScNone
    var deepCloneOnEdit: ScOption[Boolean] = ScNone
    var disableValidation: ScOption[Boolean] = ScNone
    var handleHiddenValidationErrors: ScOption[js.Function1[Types.Object, Boolean]] = ScNone
    var members: ScOption[JSArray[DynamicForm]] = ScNone
    var operator: ScOption[OperatorId] = ScNone
    var removeOperation: ScOption[String] = ScNone
    var saveOperationType: ScOption[DSOperationType] = ScNone
    var submitValues: ScOption[js.Function2[Types.Object, ValuesManager, _]] = ScNone
    var suppressValidationErrorCallback: ScOption[Boolean] = ScNone
    var updateOperation: ScOption[String] = ScNone
}

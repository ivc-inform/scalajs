package com.simplesys.SmartClient.Forms.validator

import com.simplesys.SmartClient.DataBinding.DataBoundComponent
import com.simplesys.SmartClient.DataBinding.dataSource.DataSourceField
import com.simplesys.SmartClient.Forms.FormsItems.FormItem
import com.simplesys.SmartClient.Forms.Validator
import com.simplesys.SmartClient.System.Types
import com.simplesys.SmartClient.System.Types.Record

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait validatorDefinition extends Types.Object {
    var action: js.Function5[Boolean, DataSourceField | FormItem, Validator, Record, DataBoundComponent, _]
    var condition: js.Function4[DataSourceField | FormItem, Validator, js.Any, Types.Object, Boolean]
    val defaultErrorMessage: String
    val requiresServer: Boolean
    val `type`: String
}


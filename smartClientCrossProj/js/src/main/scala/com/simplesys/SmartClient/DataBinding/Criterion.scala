package com.simplesys.SmartClient.DataBinding

import com.simplesys.System.Types.OperatorId.OperatorId
import com.simplesys.System.JSArray

import scala.scalajs.js

@js.native
trait Criterion extends js.Object {
    var criteria: JSArray[Criterion]
    var end: js.Object
    var fieldName: String
    var operator: OperatorId
    var start: js.Object
    var value: js.Object
}

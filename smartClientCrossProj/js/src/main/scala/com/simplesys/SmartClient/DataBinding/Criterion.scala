package com.simplesys.SmartClient.DataBinding

import com.simplesys.SmartClient.System.Types
import com.simplesys.System.Types.OperatorId.OperatorId
import com.simplesys.types.JSArray

import scala.scalajs.js

@js.native
trait Criterion extends Types.Object {
    var criteria: JSArray[Criterion]
    var end: js.Object
    var fieldName: String
    var operator: OperatorId
    var start: Types.Object
    var value: Types.Object
}

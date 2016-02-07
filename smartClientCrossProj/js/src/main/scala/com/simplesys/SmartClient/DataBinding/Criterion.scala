package com.simplesys.SmartClient.DataBinding

import com.simplesys.System.Types.OperatorId.OperatorId
import com.simplesys.System.{JSObject, JSArray}

import scala.scalajs.js

@js.native
trait Criterion extends JSObject {
    var criteria: JSArray[Criterion]
    var end: JSObject
    var fieldName: String
    var operator: OperatorId
    var start: JSObject
    var value: JSObject
}

package com.simplesys.SmartClient.System.inst

import com.simplesys.SmartClient.System.Types
import com.simplesys.isc.System.Types.OperatorId.OperatorId

import scala.scalajs.js

@js.native
trait Criterion extends Types.Object {
    var criteria: js.Array[Criterion] = js.native
    var end: js.Object = js.native
    var fieldName:String = js.native
    var operator: OperatorId = js.native
    var start: Types.Object = js.native
    var value: Types.Object = js.native
}

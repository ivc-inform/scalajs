package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.System.inst.Array

import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.|

package object Types {
    type Object = js.Object

    type Field = Object

    type Criteria = js.Dictionary[Object]

    trait CallbackObject {
        val target: Object
        val methodName: String
    }

    type Properties = js.Object
    type ObjectLiteral = js.Dynamic
    type Record = js.Dictionary[Object]
    type ListGridRecord = js.Dictionary[Object]

    type Callback = js.ThisFunction | CallbackObject
    type ValueMap = Array[Object] | js.Dictionary[Object]
}

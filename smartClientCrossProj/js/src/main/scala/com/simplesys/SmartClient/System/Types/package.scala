package com.simplesys.SmartClient.System

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

    type Callback = js.Function | CallbackObject
    type ValueMap = Array[Object] | js.Dictionary[Object]

    implicit def str2TypeObject(str: String) = str.asInstanceOf[Types.Object]
    implicit def int2TypeObject(int: Int) = int.asInstanceOf[Types.Object]

}

package com.simplesys.SmartClient.System

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
    type ValueMap = js.Dictionary[js.Any]
    type XMLDocument = js.Object
    type XMLElement = js.Object
    type XMLNode = js.Object
    type XPath = String
}

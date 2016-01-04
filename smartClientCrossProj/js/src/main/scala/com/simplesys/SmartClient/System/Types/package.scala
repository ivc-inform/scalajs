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

    type Properties = Object
    type Record = js.Dictionary[Object]
    type CellRecord = Object
    type ListGridRecord = js.Dictionary[js.Any]
    type MenuItem = js.Dictionary[js.Any]
    type ListGridSelectedState = Object

    type Callback = js.ThisFunction | CallbackObject
    type ValueMap = js.Dictionary[js.Any]
    type XMLDocument = Object
    type XMLElement = Object
    type XMLNode = Object
    type ListGridFieldState = Object
    type ListGridGroupState = Object
    type XPath = String
}

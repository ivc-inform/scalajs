package com.simplesys.SmartClient.System

import com.simplesys.types.{JSAny, JSArrayAny}

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
    type EdgeSizes = Object
    type Record = js.Dictionary[JSAny]
    type DataSourceRecord = js.Dictionary[JSAny]
    type CellRecord = Object
    type ListGridSelectedState = Object
    type ListGridSortState = Object
    type ListGridViewState = Object
    type ListGridGroupState = Object

    type TreeGridOpenState = Object
    type TreeGridViewState = Object

    type DetailViewerViewState = Object

    type Callback = js.Function | js.ThisFunction | CallbackObject
    type ValueMap = JSArrayAny //| js.Dictionary[JSAny]
    type XMLDocument = Object
    type XMLElement = Object
    type XMLNode = Object
    type VelocityExpression = Object
    type XPathExpression = String
    type ListGridFieldState = Object
    type XPath = String
}

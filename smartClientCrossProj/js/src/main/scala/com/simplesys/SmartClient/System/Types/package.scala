package com.simplesys.SmartClient.System

import com.simplesys.types.{JSDictionary, JSDictionaryAny, JSAny, JSArrayAny}

import scala.scalajs.js
import scala.scalajs.js.|

package object Types {
    type Object = js.Object

    type Field = Object

    type Criteria = JSDictionary[Object]

    trait CallbackObject {
        val target: Object
        val methodName: String
    }

    type Properties = Object
    type EdgeSizes = Object
    type Record = JSDictionaryAny
    type DataSourceRecord = JSDictionaryAny
    type CellRecord = Object
    type ListGridSelectedState = Object
    type ListGridSortState = Object
    type ListGridViewState = Object
    type ListGridGroupState = Object

    type TreeGridOpenState = Object
    type TreeGridViewState = Object
    type TreeGridSelectedState = Object

    type DetailViewerViewState = Object

    type Callback = js.Function | js.ThisFunction | CallbackObject
    type ValueMap = JSDictionaryAny
    type XMLDocument = Object
    type XMLElement = Object
    type XMLNode = Object
    type VelocityExpression = Object
    type XPathExpression = String
    type ListGridFieldState = Object
    type XPath = String
}

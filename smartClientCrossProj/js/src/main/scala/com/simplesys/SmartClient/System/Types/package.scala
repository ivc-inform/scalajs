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
    type EdgeSizes = Object
    type Record = js.Dictionary[js.Any]
    type DataSourceRecord = js.Dictionary[js.Any]
    type CellRecord = Object
    type ListGridSelectedState = Object
    type ListGridSortState = Object
    type ListGridViewState = Object
    type ListGridGroupState = Object

    type TreeGridOpenState = Object
    type TreeGridViewState = Object

    type DetailViewerViewState = Object

    type Callback = js.Function | js.ThisFunction | CallbackObject
    type ValueMap = js.Dictionary[js.Any]
    type XMLDocument = Object
    type XMLElement = Object
    type XMLNode = Object
    type VelocityExpression = Object
    type XPathExpression = Object
    type ListGridFieldState = Object
    type XPath = String
}

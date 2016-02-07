package com.simplesys.System

import com.simplesys.xml.Elem

import scala.scalajs.js
import scala.scalajs.js.|

package object Types {
    type Object = JSObject

    type Field = Object

    type Criteria = JSDictionary[Object]

    trait CallbackObject {
        val target: Object
        val methodName: String
    }

    type Properties = Object
    type EdgeSizes = Object
    type Record = Object
    type DataSourceRecord = Object
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
    type FormatString = String
    type SCClassName = String
    type FormItemClassName = String
    type FormItemBaseStyle = SCClassName
    type CSSStyleName = String
    type CSSColor = String
    type CSSText = String
    type CSSClassName = String
    type Color = String
    type HTMLString = String
    type URL = String
    type URN = String
    type SCImgURL = String
    type RelativeDateString = String
    type KeyName = String
    type PageHtml = Elem
    type DataPath = String
    type AnimateShowEffectId = String
    type DateInputFormat = String
    type void = Unit
    type ID = String
}

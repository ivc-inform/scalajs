package com.simplesys.SmartClient.System.inst

import com.simplesys.SmartClient.DataBinding.SortSpecifier.SortSpecifier
import com.simplesys.SmartClient.System.Types

import scala.scalajs.js

@js.native
trait Array extends List {
    def addAt(`object`: js.Any, pos: Number): this.type
    def and(start: Number, end: Number): Boolean
    def clearProperty(property: String): Boolean
    def containsProperty(property: String, value: Types.Object = js.native): Boolean
    def getUniqueItems(): js.Array[Types.Object]
    def makeIndex(property: String, alwaysMakeArray: Boolean): Types.Object
    def map(method: Function1[_, _], arguments: Types.Object*): js.Array[Types.Object]
    def max(start: Number = js.native, end: Number = js.native): Number
    def min(start: Number = js.native, end: Number = js.native): Number
    def or(start: Number = js.native, end: Number = js.native): Boolean
    def setSort(sortSpecifiers: SortSpecifier): Array
    def slide(start: Number, destination: Number): Unit
    def slideRange(start: Number, end: Number, destination: Number): Unit
    def sum(start: Number = js.native, end: Number = js.native): Number
    def unsort(): Boolean
}

package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.DataBinding.SortSpecifier.SortSpecifier
import com.simplesys.SmartClient.System.inst.List

import scala.scalajs.js

@js.native
object Array extends List {
    type Array = Array.type

    def addAt(`object`: js.Any, pos: Number): this.type = js.native
    def and(start: Number, end: Number): Boolean = js.native
    def clearProperty(property: String): Boolean = js.native
    def containsProperty(property: String, value: Types.Object = js.native): Boolean = js.native
    def getUniqueItems(): js.Array[Types.Object] = js.native
    def makeIndex(property: String, alwaysMakeArray: Boolean): Types.Object = js.native
    def map(method: Function1[_, _], arguments: Types.Object*): js.Array[Types.Object] = js.native
    def max(start: Number = js.native, end: Number = js.native): Number = js.native
    def min(start: Number = js.native, end: Number = js.native): Number = js.native
    def or(start: Number = js.native, end: Number = js.native): Boolean = js.native
    def setSort(sortSpecifiers: SortSpecifier): Array = js.native
    def slide(start: Number, destination: Number): Unit = js.native
    def slideRange(start: Number, end: Number, destination: Number): Unit = js.native
    def sum(start: Number = js.native, end: Number = js.native): Number = js.native
    def unsort(): Boolean = js.native
}

package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.DataBinding.SortSpecifier.SortSpecifier
import com.simplesys.isc.System.Types.void

import scala.scalajs.js

@js.native
trait Array extends List {
    def addAt(`object`: js.Any, pos: Int): this.type
    def and(start: Int, end: Int): Boolean
    def clearProperty(property: String): Boolean
    def containsProperty(property: String, value: Types.Object = js.native): Boolean
    def getUniqueItems(): js.Array[Types.Object]
    def makeIndex(property: String, alwaysMakeArray: Boolean): Types.Object
    def map(method: js.ThisFunction0[_, _], arguments: Types.Object*): js.Array[Types.Object]
    def max(start: Int = js.native, end: Int = js.native): Int
    def min(start: Int = js.native, end: Int = js.native): Int
    def or(start: Int = js.native, end: Int = js.native): Boolean
    def setSort(sortSpecifiers: SortSpecifier): Array
    def slide(start: Int, destination: Int): void
    def slideRange(start: Int, end: Int, destination: Int): void
    def sum(start: Int = js.native, end: Int = js.native): Int
    def unsort(): Boolean
}

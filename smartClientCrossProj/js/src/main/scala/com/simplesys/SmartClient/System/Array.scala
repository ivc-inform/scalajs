package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.DataBinding._
import com.simplesys.System.Types.void
import com.simplesys.types.{JSArrayAny, JSArray, JSAny}

import scala.scalajs.js

@js.native
trait Array extends List {
    def addAt(`object`: JSAny, pos: Int): this.type
    def and(start: Int, end: Int): Boolean
    def clearProperty(property: String): Boolean
    def containsProperty(property: String, value: Types.Object = js.native): Boolean
    def getUniqueItems(): JSArray[Types.Object]
    def makeIndex(property: String, alwaysMakeArray: Boolean): Types.Object
    def map(method: js.ThisFunction0[_, _], arguments: Types.Object*): JSArray[Types.Object]
    def max(start: Int = js.native, end: Int = js.native): Int
    def min(start: Int = js.native, end: Int = js.native): Int
    def or(start: Int = js.native, end: Int = js.native): Boolean
    def setSort(sortSpecifiers: SortSpecifier): JSArrayAny
    def slide(start: Int, destination: Int): void
    def slideRange(start: Int, end: Int, destination: Int): void
    def sum(start: Int = js.native, end: Int = js.native): Int
    def unsort(): Boolean
}

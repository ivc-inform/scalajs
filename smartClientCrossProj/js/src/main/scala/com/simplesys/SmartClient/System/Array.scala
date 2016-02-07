package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.DataBinding._
import com.simplesys.System.Types.LogPriority._
import com.simplesys.System.Types.void
import com.simplesys.System._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait Array extends List {
    def addAt(`object`: JSAny, pos: Int): this.type
    def and(start: Int, end: Int): Boolean
    def clearProperty(property: String): Boolean
    def containsProperty(property: String, value: js.Object = js.native): Boolean
    def getUniqueItems(): JSArray[js.Object]
    def makeIndex(property: String, alwaysMakeArray: Boolean): js.Object
    def map(method: js.ThisFunction0[_, _], arguments: js.Object*): JSArray[js.Object]
    def max(start: Int = js.native, end: Int = js.native): Int
    def min(start: Int = js.native, end: Int = js.native): Int
    def or(start: Int = js.native, end: Int = js.native): Boolean
    def setSort(sortSpecifiers: SortSpecifier): JSArrayAny
    def slide(start: Int, destination: Int): void
    def slideRange(start: Int, end: Int, destination: Int): void
    def sum(start: Int = js.native, end: Int = js.native): Int
    def unsort(): Boolean
}

@js.native
abstract trait AbstractArrayCompanion extends js.Object {
  var compareAscending: js.Function2[JSAny, JSAny, Int] = js.native
  var compareDescending: js.Function2[JSAny, JSAny, Int] = js.native
}

@js.native
@JSName("Array")
object ClassArray extends AbstractArrayCompanion

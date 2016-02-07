package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.DataBinding.AdvancedCriteria
import com.simplesys.System.Types.void
import com.simplesys.System.{JSArray, JSAny, JSArrayAny}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait List extends Class {
    def add(`object`: JSAny): this.type = js.native
    def addPos(`object`: JSAny, pos: Int): this.type = js.native
    def addList(list: this.type, listStartRow: Int = js.native, listEndRow: Int = js.native): this.type = js.native
    def addListAt(list: this.type, pos: Int = js.native): this.type = js.native
    def contains(obj: JSAny, pos: Int = js.native): Boolean = js.native
    def containsAll(list: this.type): Boolean = js.native
    var dataChanged: Function0[void] = js.native
    def duplicate(): this.type = js.native
    def equals(list: this.type): Boolean = js.native
    def find(propertyName: String | js.Object | AdvancedCriteria, value: js.Object = js.native): js.Object = js.native
    def findIndex(propertyName: String | js.Object | AdvancedCriteria, value: js.Object = js.native): Int = js.native
    def findNextIndex(startIndex: Int, propertyName: String | js.Object | AdvancedCriteria, value: js.Object = js.native): Int = js.native
    def findAll(propertyName: String | js.Object | AdvancedCriteria, value: js.Object = js.native, endIndex: Int = js.native): JSArray[js.Object] = js.native
    def first(): js.Object = js.native
    def last(): js.Object = js.native
    def get(pos: Int): js.Object = js.native
    def getItems(itemList: JSArray[Int]): JSArrayAny = js.native
    def getLength(): Int = js.native
    def getProperty(property: String): JSArrayAny = js.native
    def getRange(start: Int, end: Int): JSArrayAny = js.native
    def getValueMap(idField: String, displayField: String): js.Object = js.native
    def indexOf(obj: js.Object, pos: Int = js.native, endPos: Int = js.native): Int = js.native
    def lastIndexOf(obj: js.Object, pos: Int = js.native, endPos: Int = js.native): Int = js.native
    def intersect(lists: this.type): this.type = js.native
    def removeList(lists: this.type): this.type = js.native
    def isEmpty(): Boolean = js.native
    def remove(obj: js.Object, pos:Int = js.native, endPos: Int = js.native, comparator : js.Function2[JSAny, JSAny, Boolean] = js.native): Boolean = js.native
    def removeAt(pos: Int): js.Object = js.native
    def set(pos: Int, obj: js.Object): js.Object = js.native
    def setLength(length: Int): void = js.native
    def sort(comparator: Function2[_, _, Int]): this.type = js.native
    def sortByProperty(property: String, up: Boolean, normalizer: Function2[_, _, Int] = js.native, context: js.Object = js.native): this.type = js.native
}

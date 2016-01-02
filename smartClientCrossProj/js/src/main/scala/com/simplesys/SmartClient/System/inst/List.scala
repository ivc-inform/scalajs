package com.simplesys.SmartClient.System.inst

import com.simplesys.SmartClient.System.Types

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait List extends Class {
    def add(`object`: js.Any): this.type = js.native
    def addPos(`object`: js.Any, pos: Number): this.type = js.native
    def addList(list: this.type, listStartRow: Number = js.native, listEndRow: Number = js.native): this.type = js.native
    def addListAt(list: this.type, pos: Number = js.native): this.type = js.native
    def contains(obj: js.Any, pos: Number = js.native): Boolean = js.native
    def containsAll(list: this.type): Boolean = js.native
    var dataChanged: Function0[Unit] = js.native
    def duplicate(): this.type= js.native
    def equals(list: this.type): Boolean = js.native
    def find(propertyName: String | Types.Object | AdvancedCriteria, value: Types.Object = js.native): Types.Object = js.native
    def findIndex(propertyName: String | Types.Object | AdvancedCriteria, value: Types.Object = js.native): Int = js.native
    def findNextIndex(startIndex: Int, propertyName: String | Types.Object | AdvancedCriteria, value: Types.Object = js.native): Int = js.native
    def findAll(propertyName: String | Types.Object | AdvancedCriteria, value: Types.Object = js.native, endIndex: Int = js.native): js.Array[Types.Object] = js.native
    def first(): Types.Object = js.native
    def last(): Types.Object = js.native
    def get(pos: Int): Types.Object = js.native
    def getItems(itemList: js.Array[Int]): js.Array[Types.Object] = js.native
    def getLength(): Int = js.native
    def getProperty(property: String): js.Array[Types.Object] = js.native
    def getRange(start: Number, end: Number): js.Array[Types.Object] = js.native
    def getValueMap(idField: String, displayField: String): Types.Object = js.native
    def indexOf(obj: Types.Object, pos: Number = js.native, endPos: Number = js.native): Int = js.native
    def lastIndexOf(obj: Types.Object, pos: Number = js.native, endPos: Number = js.native): Int = js.native
    def intersect(lists: this.type): this.type = js.native
    def removeList(lists: this.type): this.type = js.native
    def isEmpty(): Boolean = js.native
    def remove(obj: Types.Object): Boolean = js.native
    def removeAt(pos: Number): Types.Object = js.native
    def set(pos: Number, obj: Types.Object): Types.Object = js.native
    def setLength(length: Number): Unit = js.native
    def sort(comparator: Function2[_, _, Int]): this.type = js.native
    def sortByProperty(property: String, up: Boolean, normalizer: Function2[_, _, Int] = js.native, context: Types.Object = js.native): this.type = js.native
}

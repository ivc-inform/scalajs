package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.System
import com.simplesys.SmartClient.System.Types.Record

import scala.scalajs.js

@js.native
trait Selection extends Class {
    def anySelected(): Boolean
    def deselect(item: Types.Object): Boolean
    def deselectAll(): Boolean
    def deselectItem(position: Int): Boolean
    def deselectList(list: System.Array): Boolean
    def deselectRange(start: Int, end: Int): Boolean
    def getLength(): Int
    def getSelectedRecord(): Record
    def getSelection(excludePartialSelections: Boolean = js.native): System.Array
    def isPartiallySelected(item: Record): Boolean
    def isSelected(item: Record): Boolean
    def multipleSelected(): Boolean
    def select(item: Record): Boolean
    def selectAll(visibleNodesOnly: Boolean = js.native): Boolean
    var selectionRangeNotLoadedMessage: String
    def selectItem(position: Int): Boolean
    def selectList(list: System.Array): Boolean
    def selectSingle(item: Record): Boolean
    def setSelected(item: Record, newState: Boolean): Boolean
}
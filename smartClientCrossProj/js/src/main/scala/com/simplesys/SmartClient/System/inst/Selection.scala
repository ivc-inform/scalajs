package com.simplesys.SmartClient.System.inst

import com.simplesys.SmartClient.System.Types
import com.simplesys.SmartClient.System.Types.Record

import scala.scalajs.js

@js.native
trait Selection extends Class {
    def anySelected(): Boolean
    def deselect(item: Types.Object): Boolean
    def deselectAll(): Boolean
    def deselectItem(position: Number): Boolean
    def deselectList(list: Array): Boolean
    def deselectRange(start: Number, end: Number): Boolean
    def getLength(): Int
    def getSelectedRecord(): Record
    def getSelection(excludePartialSelections: Boolean = js.native): Array
    def isPartiallySelected(item: Record): Boolean
    def isSelected(item: Record): Boolean
    def multipleSelected(): Boolean
    def select(item: Record): Boolean
    def selectAll(visibleNodesOnly: Boolean = js.native): Boolean
    var selectionRangeNotLoadedMessage: String
    def selectItem(position: Number): Boolean
    def selectList(list: Array): Boolean
    def selectSingle(item: Record): Boolean
    def setSelected(item: Record, newState: Boolean): Boolean
}

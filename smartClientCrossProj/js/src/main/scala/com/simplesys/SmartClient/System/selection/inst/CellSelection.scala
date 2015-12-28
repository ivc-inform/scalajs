package com.simplesys.SmartClient.System.selection.inst

import com.simplesys.SmartClient.System.Array._
import com.simplesys.SmartClient.System.Number._
import com.simplesys.SmartClient.System.Types.ListGridRecord
import com.simplesys.SmartClient.System._
import com.simplesys.SmartClient.System.inst.Class

import scala.scalajs.js

@js.native
trait CellSelection extends Class {
    def anySelected(): Boolean
    def cellIsSelected(rowNum: Number, colNum: Number): Boolean
    def deselectCell(rowNum: Number, colNum: Number): Boolean
    def deselectCellList(list: inst.Array): Boolean
    def getSelectedCells(): inst.Array
    def getSelectedRecord(): ListGridRecord
    def selectCell(rowNum: Number, colNum: Number): Boolean
    def selectCellList(list: inst.Array): Boolean
    def selectionChanged(): Unit
    def selectSingleCell(rowNum: Number, colNum: Number): Boolean
}

package com.simplesys.SmartClient.System.selection

import com.simplesys.SmartClient.Grids.listGrid.ListGridRecord
import com.simplesys.SmartClient.System.{AbstractClassCompanion, Class, Types}
import com.simplesys.System.Types.void
import com.simplesys.Types1.JSArray

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait CellSelection extends Class {
    def anySelected(): Boolean
    def cellIsSelected(rowNum: Int, colNum: Int): Boolean
    def deselectCell(rowNum: Int, colNum: Int): Boolean
    def deselectCellList(list: JSArray[Types.Object]): Boolean
    def getSelectedCells(): JSArray[Types.Object]
    def getSelectedRecord(): ListGridRecord
    def selectCell(rowNum: Int, colNum: Int): Boolean
    def selectCellList(list: JSArray[Types.Object]): Boolean
    def selectionChanged(): void
    def selectSingleCell(rowNum: Int, colNum: Int): Boolean
}

@js.native
abstract trait AbstractCellSelectionCompanion extends AbstractClassCompanion {
}

@js.native
@JSName("CellSelection")
object CellSelectionStatic extends AbstractCellSelectionCompanion


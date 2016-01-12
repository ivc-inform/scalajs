package com.simplesys.SmartClient.System.selection

import com.simplesys.SmartClient.Grids.listGrid.ListGridRecord
import com.simplesys.SmartClient.System.Types._
import com.simplesys.SmartClient.System.{Types, AbstractClassCompanion, Class}
import com.simplesys.System.Types.void

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait CellSelection extends Class {
    def anySelected(): Boolean
    def cellIsSelected(rowNum: Int, colNum: Int): Boolean
    def deselectCell(rowNum: Int, colNum: Int): Boolean
    def deselectCellList(list: js.Array[Types.Object]): Boolean
    def getSelectedCells(): js.Array[Types.Object]
    def getSelectedRecord(): ListGridRecord
    def selectCell(rowNum: Int, colNum: Int): Boolean
    def selectCellList(list: js.Array[Types.Object]): Boolean
    def selectionChanged(): void
    def selectSingleCell(rowNum: Int, colNum: Int): Boolean
}

@js.native
abstract trait AbstractCellSelectionCompanion extends AbstractClassCompanion {
}

package companion {

import scala.scalajs.js

@js.native
   object CellSelection extends AbstractCellSelectionCompanion
}


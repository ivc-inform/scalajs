package com.simplesys.SmartClient.DataBinding

import com.simplesys.SmartClient.Control.IButton
import com.simplesys.SmartClient.Grids.ListGrid
import com.simplesys.SmartClient.Grids.listGrid.{ListGridRecord, ListGridField}
import com.simplesys.SmartClient.Layout.{AbstractLayoutCompanion, Layout}
import com.simplesys.SmartClient.System.Types
import com.simplesys.SmartClient.System.Types.Object
import com.simplesys.System.Types.{HTMLString, AutoChild}

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait MultiSortPanel extends Layout {
    val addLevelButton: IButton with AutoChild
    val addLevelButtonTitle: String
    val ascendingTitle: String
    val copyLevelButton: IButton with AutoChild
    val copyLevelButtonTitle: String
    val deleteLevelButton: IButton with AutoChild
    val deleteLevelButtonTitle: String
    val descendingTitle: String
    val directionFieldTitle: String
    val fields: Array[Object]
    val firstSortLevelTitle: String
    def getNumLevels(): Int
    def getSort(): Array[SortSpecifier]
    def getSortLevel(levelNum: Int): SortSpecifier
    val initialSort: Array[SortSpecifier]
    val invalidListPrompt: HTMLString
    val levelDownButton: IButton with AutoChild
    val levelDownButtonTitle: String
    val levelUpButton: IButton with AutoChild
    val levelUpButtonTitle: String
    val maxLevels: Int
    val optionsGrid: ListGrid[ListGridField, ListGridRecord] with AutoChild
    val otherSortLevelTitle: String
    val propertyFieldTitle: String
    def sortChanged (sortLevels: Array[SortSpecifier])
    def validate(): Boolean
}

@js.native
abstract trait AbstractMultiSortPanelCompanion extends AbstractLayoutCompanion {
}

@js.native
object MultiSortPanel extends AbstractMultiSortPanelCompanion


package com.simplesys.SmartClient.DataBinding

import com.simplesys.SmartClient.Control.IButton
import com.simplesys.SmartClient.Grids.Grid
import com.simplesys.SmartClient.Grids.listGrid.{ListGridField, ListGridRecord}
import com.simplesys.SmartClient.Layout.{AbstractLayoutCompanion, Layout}
import com.simplesys.System.Types.{AutoChild, HTMLString}
import com.simplesys.System.{JSObject, JSArray}

import scala.scalajs.js

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
    val fields: JSArray[JSObject]
    val firstSortLevelTitle: String
    def getNumLevels(): Int
    def getSort(): JSArray[SortSpecifier]
    def getSortLevel(levelNum: Int): SortSpecifier
    val initialSort: JSArray[SortSpecifier]
    val invalidListPrompt: HTMLString
    val levelDownButton: IButton with AutoChild
    val levelDownButtonTitle: String
    val levelUpButton: IButton with AutoChild
    val levelUpButtonTitle: String
    val maxLevels: Int
    val optionsGrid: Grid[ListGridField, ListGridRecord] with AutoChild
    val otherSortLevelTitle: String
    val propertyFieldTitle: String
    def sortChanged (sortLevels: JSArray[SortSpecifier])
    def validate(): Boolean
}

@js.native
abstract trait AbstractMultiSortPanelCompanion extends AbstractLayoutCompanion {
}

@js.native
object MultiSortPanel extends AbstractMultiSortPanelCompanion


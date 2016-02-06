package com.simplesys.SmartClient.DataBinding

import com.simplesys.SmartClient.Control.IButton
import com.simplesys.SmartClient.Foundation.AbstractCanvasCompanion
import com.simplesys.SmartClient.Grids.Grid
import com.simplesys.SmartClient.Grids.listGrid.{ListGridField, ListGridRecord}
import com.simplesys.SmartClient.Layout.Window
import com.simplesys.SmartClient.System.Types.{Callback, Object}
import com.simplesys.System.Types._
import com.simplesys.types.JSArray

import scala.scalajs.js
import scala.scalajs.js._

import scala.scalajs.js.annotation.JSName

@js.native
trait MultiSortDialog extends Window {
    val addLevelButton: IButton with AutoChild
    val addLevelButtonTitle: String
    val applyButton: IButton with AutoChild
    val applyButtonTitle: String
    val ascendingTitle: String
    val cancelButton: IButton with AutoChild
    val cancelButtonTitle: String
    val copyLevelButton: IButton with AutoChild
    val copyLevelButtonTitle: String
    val deleteLevelButton: IButton with AutoChild
    val deleteLevelButtonTitle: String
    val descendingTitle: String
    val directionFieldTitle: String
    val fields: JSArray[Object]
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
    val tile: String
    def validate(): Boolean
}

@js.native
abstract trait AbstractMultiSortDialogCompanion extends AbstractCanvasCompanion {
    def askForSort(fieldSource: JSArray[Object] | DataSource | DataBoundComponent, initialSort: JSArray[SortSpecifier], callback: Callback): void = js.native
}

@js.native
@JSName("MultiSortDialog")
object MultiSortDialogStatic extends AbstractMultiSortDialogCompanion


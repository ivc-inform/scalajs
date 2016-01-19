package com.simplesys.SmartClient.DataBinding.props

import com.simplesys.SmartClient.Control.IButton
import com.simplesys.SmartClient.DataBinding.SortSpecifier
import com.simplesys.SmartClient.Grids.Grid
import com.simplesys.SmartClient.Grids.listGrid.{ListGridField, ListGridRecord}
import com.simplesys.SmartClient.Layout.props.LayoutProps
import com.simplesys.System.Types.HTMLString
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js._

class MultiSortPanelProps extends LayoutProps {
    var addLevelButton: ScOption[IButton] = ScNone
    var addLevelButtonTitle: ScOption[String] = ScNone
    var ascendingTitle: ScOption[String] = ScNone
    var copyLevelButton: ScOption[IButton] = ScNone
    var copyLevelButtonTitle: ScOption[String] = ScNone
    var deleteLevelButton: ScOption[IButton] = ScNone
    var deleteLevelButtonTitle: ScOption[String] = ScNone
    var descendingTitle: ScOption[String] = ScNone
    var directionFieldTitle: ScOption[String] = ScNone
    var fields: ScOption[Array[Object]] = ScNone
    var firstSortLevelTitle: ScOption[String] = ScNone
    var initialSort: ScOption[Array[SortSpecifier]] = ScNone
    var invalidListPrompt: ScOption[HTMLString] = ScNone
    var levelDownButton: ScOption[IButton] = ScNone
    var levelDownButtonTitle: ScOption[String] = ScNone
    var levelUpButton: ScOption[IButton] = ScNone
    var levelUpButtonTitle: ScOption[String] = ScNone
    var maxLevels: ScOption[Int] = ScNone
    var optionsGrid: ScOption[Grid[ListGridField, ListGridRecord]] = ScNone
    var otherSortLevelTitle: ScOption[String] = ScNone
    var propertyFieldTitle: ScOption[String] = ScNone
}

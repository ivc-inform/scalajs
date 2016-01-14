package com.simplesys.SmartClient.Grids.props

import com.simplesys.SmartClient.Control.IButton
import com.simplesys.SmartClient.DataBinding.props.DataBoundComponentProps
import com.simplesys.SmartClient.Grids.ListGrid
import com.simplesys.SmartClient.Grids.listGrid.{ListGridField, ListGridRecord}
import com.simplesys.SmartClient.Grids.treeGrid.TreeNode
import com.simplesys.SmartClient.Layout.props.LayoutProps
import com.simplesys.SmartClient.System.Tree
import com.simplesys.System.Types.TextMatchStyle.TextMatchStyle
import com.simplesys.System.Types.{MultiAutoChild, SCImgURL}
import com.simplesys.option.{ScOption, ScNone}

import scala.scalajs.js
import scala.scalajs.js._

class ColumnTreeProps extends LayoutProps with DataBoundComponentProps{
    var autoFetchTextMatchStyle: ScOption[TextMatchStyle] = ScNone
    var backButton: ScOption[IButton ] = ScNone
    var backButtonTitle: ScOption[String] = ScNone
    var closedIconSuffix: ScOption[String] = ScNone
    var column: ScOption[ListGrid[ListGridField, ListGridRecord] with MultiAutoChild] = ScNone
    var columnProperties: ScOption[js.Dictionary[js.Any]] = ScNone
    var customIconOpenProperty: ScOption[String] = ScNone
    var customIconProperty: ScOption[String] = ScNone
    var data: ScOption[Tree] = ScNone
    var dataProperties: ScOption[Tree] = ScNone
    var fields: ScOption[Array[ListGridField]] = ScNone
    var firstColumnTitle: ScOption[String] = ScNone
    var folderIcon: ScOption[SCImgURL] = ScNone
    var loadDataOnDemand: ScOption[Boolean] = ScNone
    var nodeIcon: ScOption[SCImgURL] = ScNone
    var nodeSelected: ScOption[js.Function2[ListGrid[ListGridField, ListGridRecord], TreeNode, Boolean]] = ScNone
    var openIconSuffix: ScOption[String] = ScNone
    var showCustomIconOpen: ScOption[Boolean] = ScNone
    var showHeaders: ScOption[Boolean] = ScNone
    var showMultipleColumns: ScOption[Boolean] = ScNone
    var showNodeCount: ScOption[Boolean] = ScNone
    var showOpenIcons: ScOption[Boolean] = ScNone
}
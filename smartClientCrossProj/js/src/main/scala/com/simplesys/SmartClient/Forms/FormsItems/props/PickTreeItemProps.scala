package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.SmartClient.DataBinding.DataSource
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Grids.treeGrid.Tree
import com.simplesys.SmartClient.System.Types.FormItemComponentType
import com.simplesys.System.Types.{CSSStyleName, HTMLString}
import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.option.ScOption._


class PickTreeItemProps extends CanvasItemProps {
    var button: ScOption[Canvas ] = ScNone
    var canSelectParentItems: ScOption[Boolean] = ScNone
    var dataProperties: ScOption[Tree] = ScNone
    var dataSource: ScOption[DataSource] = ScNone
    var emptyMenuMessage: ScOption[HTMLString] = ScNone
    var loadDataOnDemand: ScOption[Boolean] = ScNone
    var pendingButtonStyle: ScOption[CSSStyleName] = ScNone
    var valueTree: ScOption[Tree] = ScNone
    `type` = FormItemComponentType.PickTreeItem.opt
}

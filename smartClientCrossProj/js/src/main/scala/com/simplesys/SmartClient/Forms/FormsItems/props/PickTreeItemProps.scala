package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.SmartClient.DataBinding.DataSource
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.System.Tree
import com.simplesys.System.Types.{HTMLString, CSSStyleName}
import com.simplesys.option.{ScOption, ScNone}

import scala.scalajs.js._

class PickTreeItemProps extends CanvasItemProps {
    var button: ScOption[Canvas ] = ScNone
    var canSelectParentItems: ScOption[Boolean] = ScNone
    var dataProperties: ScOption[Tree] = ScNone
    var dataSource: ScOption[DataSource | String] = ScNone
    var emptyMenuMessage: ScOption[HTMLString] = ScNone
    var loadDataOnDemand: ScOption[Boolean] = ScNone
    var pendingButtonStyle: ScOption[CSSStyleName] = ScNone
    var valueTree: ScOption[Tree] = ScNone
}

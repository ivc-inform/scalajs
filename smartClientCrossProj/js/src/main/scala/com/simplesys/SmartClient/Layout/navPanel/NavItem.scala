package com.simplesys.SmartClient.Layout.navPanel

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Grids.treeGrid.TreeNode
import com.simplesys.System.Types.CSSStyleName
import com.simplesys.types.JSArray

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait NavItem extends TreeNode {
    val customStyle: CSSStyleName
    val isHeader: Boolean
    val isSeparator: Boolean
    val items: JSArray[NavItem]
    val pane: Canvas | String
}

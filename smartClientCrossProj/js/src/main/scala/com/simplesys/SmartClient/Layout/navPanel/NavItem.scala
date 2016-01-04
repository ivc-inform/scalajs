package com.simplesys.SmartClient.Layout.navPanel

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.System.tree.TreeNode.TreeNode
import com.simplesys.isc.System.Types.{SCImgURL, CSSStyleName}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
object NavItem extends TreeNode {
    type NavItem = NavItem.type
    val customStyle: CSSStyleName = js.native
    val isHeader: Boolean = js.native
    val isSeparator: Boolean = js.native
    val items: js.Array[NavItem] = js.native
    val pane: Canvas | String
}

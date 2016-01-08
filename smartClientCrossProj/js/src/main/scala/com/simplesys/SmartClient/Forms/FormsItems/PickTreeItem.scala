package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.SmartClient.DataBinding.DataSource
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.System.Tree
import com.simplesys.isc.System.Types.{CSSStyleName, HTMLString, AutoChild}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait PickTreeItem extends CanvasItem {
    var button: Canvas with AutoChild
    var canSelectParentItems: Boolean
    val dataProperties: Tree
    val dataSource: DataSource | String
    val emptyMenuMessage: HTMLString
    def fetchData(): Unit
    val loadDataOnDemand: Boolean
    var pendingButtonStyle: CSSStyleName
    def setEmptyDisplayValue(emptyDisplayValue: String): Unit
    def setValueTree(valueTree: Tree): Unit
    val valueTree: Tree
}

@js.native
abstract trait AbstractPickTreeItemCompanion extends AbstractCanvasItemCompanion {
}

@js.native
object PickTreeItem extends AbstractPickTreeItemCompanion        

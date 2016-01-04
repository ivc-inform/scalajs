package com.simplesys.SmartClient.Layout

import com.simplesys.SmartClient.Grids.TreeGrid
import com.simplesys.SmartClient.Layout.navPanel.NavItem
import com.simplesys.isc.System.Types.{AutoChild, CSSStyleName}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait NavPanel extends SplitPane {
    var currentItem: NavItem
    var currentItemId: String
    val headerStyle: CSSStyleName
    val isTree: Boolean
    val navDeck: Deck with AutoChild
    val navGrid: TreeGrid with AutoChild
    var navItems: js.Array[NavItem]
    def setCurrentItem(newCurrentItem: NavItem = js.native): Unit
    def setCurrentItemId(newCurrentItemId: String = js.native): Unit
}

@js.native
abstract trait AbstractNavPanelCompanion extends AbstractSplitPaneCompanion {
}

@js.native
object NavPanel extends AbstractNavPanelCompanion        

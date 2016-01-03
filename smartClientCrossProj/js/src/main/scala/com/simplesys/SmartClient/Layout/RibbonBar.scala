package com.simplesys.SmartClient.Layout

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait RibbonBar extends ToolStrip {
    def addGroup(group: RibbonGroup, position: Int = js.native): Unit
}

@js.native
abstract trait AbstractRibbonBarCompanion extends AbstractToolStripCompanion {
}

@js.native
object RibbonBar extends AbstractRibbonBarCompanion        

package com.simplesys.SmartClient.Layout

import com.simplesys.System.Types.void

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait RibbonBar extends ToolStrip {
    def addGroup(group: RibbonGroup, position: Int = js.native): void
}

@js.native
abstract trait AbstractRibbonBarCompanion extends AbstractToolStripCompanion {
}

package companion {

import scala.scalajs.js

@js.native
   object RibbonBar extends AbstractRibbonBarCompanion
}


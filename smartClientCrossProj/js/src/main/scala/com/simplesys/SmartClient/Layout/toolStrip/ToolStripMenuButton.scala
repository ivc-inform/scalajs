package com.simplesys.SmartClient.Layout.toolStrip

import com.simplesys.SmartClient.Control.MenuButton
import com.simplesys.SmartClient.Foundation.AbstractCanvasCompanion

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait ToolStripMenuButton extends MenuButton {
}

@js.native
abstract trait AbstractToolStripMenuButtonCompanion extends AbstractCanvasCompanion {
}

package companion {

import scala.scalajs.js

@js.native
   object ToolStripMenuButton extends AbstractToolStripMenuButtonCompanion

}

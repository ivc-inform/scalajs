package com.simplesys.SmartClient.Layout.toolStrip

import com.simplesys.SmartClient.Control.Button
import com.simplesys.SmartClient.Foundation.AbstractCanvasCompanion

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait ToolStripButton extends Button {
}

@js.native
abstract trait AbstractToolStripButtonCompanion extends AbstractCanvasCompanion {
}

@js.native
object ToolStripButton extends AbstractToolStripButtonCompanion        

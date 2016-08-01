package com.simplesys.SmartClient.Layout

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Layout.toolStrip.ToolStripButton
import com.simplesys.SmartClient.System.IscArray
import com.simplesys.System._

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait WindowListGridEditorToolStrip extends ToolStrip {
    val members: IscArray[_ <: ToolStripButton]
    var owner: JSUndefined[Canvas]
}

//@js.native
//abstract trait AbstractWindowListGridEditorToolStripCompanion extends AbstractToolStripCompanion {
//}


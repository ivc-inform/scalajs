package com.simplesys.SmartClient.Tools.editContext

import com.simplesys.SmartClient.Foundation.{Canvas, AbstractCanvasCompanion}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait EditPane extends Canvas {
}

@js.native
abstract trait AbstractEditPaneCompanion extends AbstractCanvasCompanion {
}

@js.native
object EditPane extends AbstractEditPaneCompanion

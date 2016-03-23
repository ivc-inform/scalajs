package com.simplesys.SmartClient.Drawing

import com.simplesys.SmartClient.Foundation.{AbstractCanvasCompanion, Canvas}
import com.simplesys.System.Types.void

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait DrawPane extends Canvas {
    def addDrawItem(item: DrawItem, autoDraw: Boolean): void
}

@js.native
abstract trait AbstractDrawPaneCompanion extends AbstractCanvasCompanion {
}

@js.native
    object DrawPane extends AbstractDrawPaneCompanion

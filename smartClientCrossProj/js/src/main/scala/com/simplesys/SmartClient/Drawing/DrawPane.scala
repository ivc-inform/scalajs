package com.simplesys.SmartClient.Drawing

import com.simplesys.SmartClient.Drawing.Gradients.Gradient
import com.simplesys.SmartClient.Foundation.{AbstractCanvasCompanion, Canvas}
import com.simplesys.System.Types.{ID, void}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait DrawPane extends Canvas {
    def addDrawItem(item: DrawItem, autoDraw: Boolean): void
    def addGradient (gradient: Gradient) : ID
    def createLinearGradient (id: ID, linearGradient: LinearGradient): ID
}

@js.native
abstract trait AbstractDrawPaneCompanion extends AbstractCanvasCompanion {
}

@js.native
    object DrawPane extends AbstractDrawPaneCompanion

package com.simplesys.SmartClient.Layout

import com.simplesys.SmartClient.Foundation.Canvas

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait Deck extends Layout {
    var currentPane: Canvas
    def hideCurrentPane(): Unit
    var panes: js.Array[Canvas]
    def setCurrentPane(pane: String | Canvas): Unit
}

@js.native
abstract trait AbstractDeckCompanion extends AbstractLayoutCompanion {
}

@js.native
object Deck extends AbstractDeckCompanion        

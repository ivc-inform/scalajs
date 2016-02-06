package com.simplesys.SmartClient.Layout

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.System.Types2.void
import com.simplesys.Types1.JSArray

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait Deck extends Layout {
    var currentPane: Canvas
    def hideCurrentPane(): void
    var panes: JSArray[Canvas]
    def setCurrentPane(pane: String | Canvas): void
}

@js.native
abstract trait AbstractDeckCompanion extends AbstractLayoutCompanion {
}

@js.native
   object Deck extends AbstractDeckCompanion


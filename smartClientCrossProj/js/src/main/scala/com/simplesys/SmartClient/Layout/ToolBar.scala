package com.simplesys.SmartClient.Layout

import com.simplesys.SmartClient.Control.Button
import com.simplesys.SmartClient.System.{Types, Class}
import com.simplesys.SmartClient.Foundation.{Canvas, AbstractCanvasCompanion}
import com.simplesys.isc.System.Types.void

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait ToolBar extends Layout {
    def addButtons(buttons: js.Array[Button] = js.native, position: Int = js.native): void
    var buttonConstructor: Class
    var buttonDefaults: Types.Object
    var buttons: js.Array[Button]
    var canReorderItems: Boolean
    var canResizeItems: Boolean
    def deselectButton(buttonID: Int | String | Types.Object | Canvas): void
    def getButton(index: Int): Button
    def getButtonNumber(button: Int | String | Button | Types.Object): Int
    var itemClick: js.ThisFunction2[callbackHandler, Button, Int, void]
    var itemDoubleClick: js.ThisFunction2[callbackHandler, Button, Int, void]
    var itemDragResized: js.ThisFunction2[callbackHandler, Int, Int, void]
    def removeButtons(buttons: js.Array[Button] = js.native): void
    def selectButton(buttonID: Int | String | Types.Object | Canvas): void
    def setButtons(buttons: js.Array[Button] = js.native): void
    def setCanResizeItems(canResizeItems: Boolean): void
}

@js.native
abstract trait AbstractToolBarCompanion extends AbstractCanvasCompanion {
}

@js.native
object ToolBar extends AbstractToolBarCompanion

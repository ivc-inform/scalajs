package com.simplesys.SmartClient.Drawing.drawItem

import com.simplesys.SmartClient.Drawing.DrawItem
import com.simplesys.SmartClient.Drawing.drawItem.drawShape.DrawShapeCommand
import com.simplesys.System.Types.void
import com.simplesys.System._

import scala.scalajs.js

@js.native
trait DrawShape extends DrawItem {
    var commands: JSArray[DrawShapeCommand]
    def setCommands(commands: JSArray[DrawShapeCommand]): void
}



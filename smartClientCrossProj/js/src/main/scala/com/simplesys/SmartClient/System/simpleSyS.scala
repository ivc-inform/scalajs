package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.Control.MenuSS
import com.simplesys.SmartClient.Control.menu.MenuSSItem
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Grids.TreeGridEditor

import scala.scalajs.js

@js.native
trait Config extends Types.Object {
    val confirmDeleting: String
}

@js.native
object simpleSyS extends Types.Object {
    def checkOwner(canvas: Canvas): Canvas = js.native
    def _enableDeleteFromTree(menu: MenuSS): Boolean = js.native
    var config: Config = js.native
}

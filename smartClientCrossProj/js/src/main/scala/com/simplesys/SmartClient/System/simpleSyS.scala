package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.Control._
import com.simplesys.SmartClient.Control.menu.MenuSSItem
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.System.Types.void

import scala.scalajs.js

@js.native
trait Config extends js.Object {
    val confirmDeleting: String
}

@js.native
object simpleSyS extends js.Object {
    def checkOwner(canvas: Canvas): Canvas = js.native
    def _enableDeleteFromTree(menu: MenuSSItem): Boolean = js.native
    def _openFolders(menu: MenuSS): void = js.native
    var config: Config = js.native
}

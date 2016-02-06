package com.simplesys.SmartClient.Control

import com.simplesys.SmartClient.Foundation.{Label, Canvas}
import com.simplesys.SmartClient.System.{Types, AbstractClassCompanion, Class}
import com.simplesys.System.Types2.{void, HTMLString}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait Hover extends Class {
}

@js.native
abstract trait AbstractHoverCompanion extends AbstractClassCompanion {
    def hide():void = js.native
    var hoverCanvasDefaults: Types.Object = js.native
    var leftOffset: Int = js.native
    val moveWithMouse: Boolean = js.native
    def show(contents: HTMLString | Canvas, properties: Label): void = js.native
    var topOffset: Int = js.native
}

@js.native
object Hover extends AbstractHoverCompanion


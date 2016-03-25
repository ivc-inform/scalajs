package com.simplesys.SmartClient.Drawing

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.System.Types.{AutoChild, void}

import scala.scalajs.js

@js.native
trait DrawKnob extends Canvas {
    val drawPane: DrawPane
    val knobShape: DrawItem with AutoChild
    val knobShapeDefaults: DrawItem
    def setCenterPoint(x: Int, y: Int, viewboxCoords: Boolean = js.native): void
    var updatePoints: js.Function5[Int, Int, Int, Int, String, _]
    val x: Int
    val y: Int
}


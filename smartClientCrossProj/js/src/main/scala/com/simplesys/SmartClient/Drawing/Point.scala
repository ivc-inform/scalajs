package com.simplesys.SmartClient.Drawing

import com.simplesys.System.JSObject

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

@js.native
trait Point extends JSObject {
    val x: Int
    val y: Int
}

object Point {
    def apply(x: Int, y: Int): Point = js.Dynamic.literal(x = x, y = y).asInstanceOf[Point]
}


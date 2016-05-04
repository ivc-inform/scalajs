package com.simplesys.SmartClient.Drawing.drawItem

import com.simplesys.SmartClient.Drawing.{AbstractDrawItemCompanion, DrawItem}
import com.simplesys.SmartClient.System.{AbstractClassCompanion, Point}
import com.simplesys.System.Types.void

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait DrawLine extends DrawItem {
    val endLeft: Int
    var endPoint: Point
    val endTop: Int
    def moveStartPointTo (left: Int, top: Int): void
    def setEndPoint (left: Int, top: Int): void
    def setStartPoint (left: Int, top: Int): void
    val startLeft: Int
    var startPoint: Point
    val startTop: Int
}

@js.native
abstract trait AbstractDrawLineCompanion extends AbstractDrawItemCompanion {
}

@js.native
@JSName("DrawLine")
object DrawLineStatic extends AbstractDrawLineCompanion


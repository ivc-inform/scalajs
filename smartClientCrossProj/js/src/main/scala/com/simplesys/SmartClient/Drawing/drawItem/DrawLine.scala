package com.simplesys.SmartClient.Drawing.drawItem

import com.simplesys.SmartClient.Drawing.{DrawItem, Point}
import com.simplesys.System.Types.void

import scala.scalajs.js

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


package com.simplesys.SmartClient.Drawing.drawItem

import com.simplesys.SmartClient.Drawing.DrawItem
import com.simplesys.SmartClient.System.{IscArray, Point}
import com.simplesys.System.JSUndefined
import com.simplesys.System.Types.void

import scala.scalajs.js

@js.native
trait DrawPath extends DrawItem {
    def moveFirstPointTo(left: Int, top: Int): void
    var points: IscArray[Point]
    def setPoints(points: IscArray[Point], cx0: JSUndefined[Int] = js.native, cy0: JSUndefined[Int] = js.native): void
}



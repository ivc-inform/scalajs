package com.simplesys.SmartClient.Drawing.drawItem

import com.simplesys.SmartClient.Drawing.{DrawItem, Point}
import com.simplesys.System.JSArray
import com.simplesys.System.Types.void

import scala.scalajs.js

@js.native
trait DrawPath extends DrawItem {
    def moveFirstPointTo(left: Int, top: Int): void
    var points: JSArray[Point]
}



package com.simplesys.SmartClient.Drawing.drawItem

import com.simplesys.SmartClient.Drawing.DrawItem
import com.simplesys.System.Types.void

import scala.scalajs.js

@js.native
trait DrawRect extends DrawItem {
    var height: Int
    var left: Int
    val rounding: Double
    def setCenter(left: Int, top: Int): void
    def setHeight(height: Int): void
    def setLeft(left: Int): void
    def setRect(left: Int, top: Int, width: Int, height: Int): void
    def setRounding(rounding: Boolean): void
    def setTop(top: Int): void
    def setWidth(width: Int): void
    var top: Int
    var width: Int
}


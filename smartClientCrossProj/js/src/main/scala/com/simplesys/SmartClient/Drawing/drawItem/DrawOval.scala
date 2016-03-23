package com.simplesys.SmartClient.Drawing.drawItem

import com.simplesys.SmartClient.Drawing.{DrawItem, Point}

import scala.scalajs.js

@js.native
trait DrawOval extends DrawItem {
    var centerPoint: Point
    def getRadiusX (): Int
    def getRadiusY (): Int
    var height: Int
    var left: Int
}


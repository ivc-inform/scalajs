package com.simplesys.SmartClient.Drawing.drawItem

import com.simplesys.SmartClient.Drawing.DrawItem
import com.simplesys.SmartClient.System.Point
import com.simplesys.System.Types.ConnectorOrientation.ConnectorOrientation
import com.simplesys.System.Types.ConnectorStyle.ConnectorStyle
import com.simplesys.System.Types.void

import scala.scalajs.js

@js.native
trait DrawLinePath extends DrawItem {
    val connectorOrientation: ConnectorOrientation
    val connectorStyle: ConnectorStyle
    var controlPoint1: Point
    var controlPoint2: Point
    val endLeft: Int
    var endPoint: Point
    val endTop: Int
    def moveStartPointTo (left: Int, top: Int): void
    def setControlPoint1 (left: Int, top: Int): void
    def setControlPoint2 (left: Int, top: Int): void
    def setEndPoint (left: Int, top: Int): void
    def setStartPoint (left: Int, top: Int): void
    val startLeft: Int
    var startPoint: Point
    val startTop: Int
    val tailSize: Int
}

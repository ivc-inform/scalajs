package com.simplesys.SmartClient.Drawing.drawItem

import com.simplesys.SmartClient.Drawing.DrawKnob
import com.simplesys.SmartClient.System.{IscArray, Point}
import com.simplesys.System.Types.ConnectorOrientation.ConnectorOrientation
import com.simplesys.System.Types.ConnectorStyle._
import com.simplesys.System.Types._
import com.simplesys.System._

import scala.scalajs.js

@js.native
trait DrawLinePathSS extends DrawPath {
    def setControlPoint(id: ID, left: Int, top: Int, fireMovedAndResized: Boolean = js.native, cx0: Int = js.native, cy0: Int = js.native): void

    def _getSegmentPoints(controlPoint1: JSUndefined[Point], controlPoint2: JSUndefined[Point]): IscArray[Point]
    def getConnectorOrientationState(): ConnectorOrientation
    def getCenter(p1: JSUndefined[Point], p2: JSUndefined[Point]): Point
    def updateStartPointKnob(): void
    def updateEndPointKnob(): void
    def updateControlPoint1Knob(): void
    def updateControlPoint2Knob(): void
    var _segmentPoints: IscArray[Point]

    var _c1Knob: JSUndefined[DrawKnob]
    var _c2Knob: JSUndefined[DrawKnob]

    var _cKnobs: IscArray[DrawKnob]
    var controlPoints: IscArray[Point]

    val connectorOrientation: ConnectorOrientation
    val connectorStyle: ConnectorStyle

    var controlPoint1: JSUndefined[Point]
    var controlPoint2: JSUndefined[Point]

    var endLeft: JSUndefined[Int]
    var endPoint: Point
    var endTop: JSUndefined[Int]

    def moveStartPointTo(left: Int, top: Int): void
    def moveEndPointTo(left: Int, top: Int): void
    def setControlPoint1(left: Int, top: Int, fireMovedAndResized: Boolean = js.native, cx0: Int = js.native, cy0: Int = js.native): void
    def setControlPoint2(left: Int, top: Int, fireMovedAndResized: Boolean = js.native, cx0: Int = js.native, cy0: Int = js.native): void
    def setEndPoint(left: Int, top: Int): void
    def setStartPoint(left: Int, top: Int): void

    var startLeft: JSUndefined[Int]
    var startPoint: Point
    var startTop: JSUndefined[Int]
    val tailSize: Int
}

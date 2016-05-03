package com.simplesys.SmartClient.Drawing.drawItem

import com.simplesys.SmartClient.Drawing.DrawKnob
import com.simplesys.SmartClient.System.{IscArray, Point}
import com.simplesys.System.Types.ConnectorOrientation.ConnectorOrientation
import com.simplesys.System.Types._
import com.simplesys.System._

import scala.scalajs.js

@js.native
trait DrawLinePathSS extends DrawLinePath {
    def setControlPoint(id: ID, left: Int, top: Int, fireMovedAndResized: Boolean = js.native, cx0: Int = js.native, cy0: Int = js.native): void

    def _getSegmentPoints(controlPoint1: JSUndefined[Point], controlPoint2: JSUndefined[Point]): IscArray[Point]
    def getConnectorOrientationState(): ConnectorOrientation
    def getCenter(p1: JSUndefined[Point], p2: JSUndefined[Point]): Point
    def updateStartPointKnob():void
    def updateEndPointKnob():void
    def updateControlPoint1Knob():void
    def updateControlPoint2Knob():void
    var _segmentPoints: IscArray[Point]

    var _c1Knob: JSUndefined[DrawKnob]
    var _c2Knob: JSUndefined[DrawKnob]

    var _cKnobs: IscArray[DrawKnob]
    var controlPoints: IscArray[Point]
}

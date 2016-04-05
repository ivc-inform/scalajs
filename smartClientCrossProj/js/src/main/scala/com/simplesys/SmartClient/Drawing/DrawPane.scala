package com.simplesys.SmartClient.Drawing

import com.simplesys.SmartClient.DataBinding.Callbacks.DataURLCallback
import com.simplesys.SmartClient.Drawing.radient.{Gradient, LinearGradient, SimpleGradient}
import com.simplesys.SmartClient.Foundation.{AbstractCanvasCompanion, Canvas}
import com.simplesys.System.JSArray
import com.simplesys.System.Types.{ID, void}
import org.scalajs.dom.svg.RadialGradient

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait DrawPane extends Canvas {
    def addDrawItem(item: DrawItem, autoDraw: Boolean): void
    def addGradient(gradient: Gradient): ID
    def createLinearGradient(id: ID, linearGradient: LinearGradient): ID
    def createRadialGradient(id: ID, radialGradient: RadialGradient): ID
    def createSimpleGradient(id: ID, simple: SimpleGradient): ID
    def destroyItems(): void
    val drawingHeight: Int
    val drawingWidth: Int
    val drawItems: js.Array[DrawItem]
    def erase(): void
    def getDataURL(callback: DataURLCallback = js.native): String
    def getDrawingPoint(): Point
    def getDrawingX(): Int
    def getDrawingY(): Int
    def getGradient(gradientID: ID): Gradient
    def getSvgString(): String
    val gradients: js.Array[Gradient]
    def refreshNow(): void
    def removeGradient(gradientID: ID): void
    def rotate(degrees: Int): void
    var rotation: Double
    def setRotation(degrees: Int): void
    def setZoomLevel(zoomLevel: Double): void
    var translate: js.Array[Int]
    def zoom(zoomLevel: Double): void
    var zoomLevel: Double
    var `type`: String
}

@js.native
abstract trait AbstractDrawPaneCompanion extends AbstractCanvasCompanion {
    def bezier(p1: Double, cp1: Double, cp2: Double, p2: Double, t: Double): Double = js.native
    def bezierExtrema(p1: Double, cp1: Double, cp2: Double, p2: Double): JSArray[Double] = js.native
    def getBezierBoundingBox(p1: Double, cp1: Double, cp2: Double, p2: Double): JSArray[Double] = js.native
    def getPolygonPoints(width: Int, height: Int, xc: Int, yc: Int, angles: JSArray[Double]): JSArray[Point] = js.native
    def getRegularPolygonPoints(n: Int, width: Int, height: Int, xc: Int, yc: Int, startAngle: Double): JSArray[Point] = js.native
    def scaleAndCenter(width: Int, height: Int, xc: Int, yc: Int, points: JSArray[Point]): void = js.native
    def scaleAndCenterBezier(width: Int, height: Int, xc: Int, yc: Int, startPoint: Point, endPoint: Point, controlPoint1: Point, controlPoint2: Point): void = js.native
}

@js.native
@JSName("DrawPane")
object DrawPaneSatic extends AbstractDrawPaneCompanion

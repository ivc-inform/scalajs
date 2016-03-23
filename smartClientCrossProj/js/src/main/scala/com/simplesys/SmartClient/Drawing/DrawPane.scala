package com.simplesys.SmartClient.Drawing

import com.simplesys.SmartClient.DataBinding.Callbacks.DataURLCallback
import com.simplesys.SmartClient.Drawing.Gradients.{Gradient, LinearGradient, SimpleGradient}
import com.simplesys.SmartClient.Foundation.{AbstractCanvasCompanion, Canvas}
import com.simplesys.System.Types.{ID, void}
import org.scalajs.dom.svg.RadialGradient

import scala.scalajs.js

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
}

@js.native
abstract trait AbstractDrawPaneCompanion extends AbstractCanvasCompanion {
}

@js.native
object DrawPane extends AbstractDrawPaneCompanion

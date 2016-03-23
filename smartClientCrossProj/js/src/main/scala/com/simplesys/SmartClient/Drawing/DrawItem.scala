package com.simplesys.SmartClient.Drawing

import com.simplesys.SmartClient.Control.Menu
import com.simplesys.SmartClient.Drawing.Gradients.Gradient
import com.simplesys.SmartClient.Drawing.drawItem.DrawGroup
import com.simplesys.System.Types.ArrowStyle.ArrowStyle
import com.simplesys.System.Types.Cursor.Cursor
import com.simplesys.System.Types.KnobType.KnobType
import com.simplesys.System.Types.LineCap.LineCap
import com.simplesys.System.Types.LinePattern.LinePattern
import com.simplesys.System.Types._
import com.simplesys.System.{JSArray, JSObject}
import com.simplesys.props.AbstractClassProps

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait DrawItem extends JSObject {
    var canDrag: Boolean
    var canHover: Boolean
    var click: js.Function0[Boolean]
    def computeAngle(px1: Double, py1: Double, px2: Double, py2: Double): Double
    var contextMenu: Menu
    var cornerResizeKnob: DrawKnob with MultiAutoChild
    var cursor: Cursor
    def destroy(): void
    val destroyed: Boolean
    val destroying: Boolean
    var dragMove: js.Function0[Boolean]
    var dragResizeMove: js.Function5[String, Int, Int, Int, Int, _]
    var dragStart: js.Function0[Boolean]
    var dragStartDistance: Int
    var dragStop: js.Function0[Boolean]
    def draw(): void
    val drawGroup: DrawGroup
    var drawPane: DrawPane
    val editProxyConstructor: SCClassName
    var endArrow: ArrowStyle
    val endKnob: DrawKnob
    def erase(): void
    var fillColor: CSSColor
    var fillGradient: String | Gradient
    var fillOpacity: Double
    def getBoundingBox(): JSArray[Double]
    def getCenter(): Point
    def getHoverHTML(): HTMLString
    def getPageLeft(): Double
    def getPageTop(): Double
    def getResizeBoundingBox(): JSArray[Int]
    def getShapeData(): JSObject
    def getSvgString(): String
    def hide(): void
    def hideAllKnobs(): void
    def hideKnobs(knobType: KnobType | JSArray[KnobType])
    def hover(): Boolean
    def isInBounds(x: Int, y: Int): Boolean
    def isPointInPath(x: Int, y: Int): Boolean
    var keepInParentRect: Boolean | JSArray[Double]
    val knobs: JSArray[KnobType]
    var lineCap: LineCap
    var lineColor: CSSColor
    var lineOpacity: Double
    var linePattern: LinePattern
    var lineWidth: Int
    var mouseDown: js.Function0[Boolean]
    var mouseMove: js.Function0[Boolean]
    var mouseOut: js.Function0[Boolean]
    var mouseOver: js.Function0[Boolean]
    var mouseUp: js.Function0[Boolean]
    def moveBy(dX: Int, dY: Int): void
    var moved: js.Function2[Int, Int, _]
    val moveKnob: DrawKnob with AutoChild
    var moveKnobOffset: JSArray[Int]
}

@js.native
abstract trait AbstractDrawItemCompanion extends AbstractClassProps {
    def computeAngle(px1: Double, py1: Double, px2: Double, py2: Double): Double = js.native
}

@js.native
object DrawItem extends AbstractDrawItemCompanion

package com.simplesys.SmartClient.Drawing

import com.simplesys.SmartClient.Control.MenuSS
import com.simplesys.SmartClient.Drawing.drawItem.{DrawGroup, DrawLabel, DrawRect}
import com.simplesys.SmartClient.Drawing.gradient.Gradient
import com.simplesys.SmartClient.System.{AbstractClassCompanion, Class, IscArray, Point}
import com.simplesys.SmartClient.Tools.EditProxy
import com.simplesys.System.Types.ArrowStyle.ArrowStyle
import com.simplesys.System.Types.Cursor.Cursor
import com.simplesys.System.Types.KnobType.KnobType
import com.simplesys.System.Types.LineCap.LineCap
import com.simplesys.System.Types.LinePattern.LinePattern
import com.simplesys.System.Types.MoveKnobPoint.MoveKnobPoint
import com.simplesys.System.Types.ProportionalResizeMode.ProportionalResizeMode
import com.simplesys.System.Types.ResizeKnobPoint.ResizeKnobPoint
import com.simplesys.System.Types.TitleRotationMode.TitleRotationMode
import com.simplesys.System.Types._
import com.simplesys.System._
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}
import scala.scalajs.js.{Function2, ThisFunction2, |}

@ScalaJSDefined
trait RotationCenter extends JSObject {
    val cx: Int
    val cy: Int
}

@js.native
trait DrawItem extends Class {

    def _adjustBoundingBox(forStroke: Boolean, forHitTolerance: Boolean, bbox: IscArray[Int]): IscArray[Int]
    def _getRotationCenter(): RotationCenter
    def _movePointToPoint(left: Int, top: Int, startLeft: Int, startTop: Int): void
    def _updateRotationCenter(cx: Int, cy: Int, centerCx: Int, centerCy: Int): void
    var canDrag: Boolean
    var ID: JSUndefined[String]
    var canHover: Boolean
    var click: js.ThisFunction0[classHandler, Boolean]
    def computeAngle(px1: Double, py1: Double, px2: Double, py2: Double): Double
    var _constructor: JSUndefined[String]
    var contextMenu: JSUndefined[MenuSS]
    var cornerResizeKnob: DrawKnob with MultiAutoChild
    var cursor: Cursor
    val defaults: Defaults
    val destroyed: Boolean
    val destroying: Boolean
    var dragMove: js.ThisFunction0[classHandler, Boolean]
    var dragResizeMove: js.Function5[String, Int, Int, Int, Int, _]
    var dragStart: js.Function0[Boolean]
    var dragStartDistance: Int
    var dragStop: js.Function0[Boolean]
    def draw(): void
    val drawGroup: DrawGroup
    var drawPane: DrawPane
    val editProxyConstructor: SCClassName
    val editProxyProperties: EditProxy
    val editProxy: EditProxy
    var endArrow: ArrowStyle
    val endKnob: DrawKnob
    def erase(): void
    var fillColor: CSSColor
    var fillGradient: String | Gradient
    var fillOpacity: Double
    def getBoundingBox(): IscArray[Double]
    def getCenter(): Point
    def getHoverHTML(): HTMLString
    def getPageLeft(): Double
    def getPageTop(): Double
    def getResizeBoundingBox(): IscArray[Int]
    def getShapeData(): JSObject
    def getSvgString(): String
    def hide(): void
    def hideAllKnobs(): void
    def hideKnobs(knobType: KnobType | IscArray[KnobType])
    def hover(): Boolean
    def isInBounds(x: Int, y: Int): Boolean
    def isPointInPath(x: Int, y: Int): Boolean
    var keepInParentRect: Boolean | IscArray[Double]
    val knobs: IscArray[KnobType]
    var lineCap: LineCap
    var lineColor: CSSColor
    var lineOpacity: Double
    //var linePattern: LinePattern //!!!!! Не убирать
    var lineWidth: Int
    var mouseDown: js.Function0[Boolean]
    var mouseMove: js.Function0[Boolean]
    var mouseOut: js.Function0[Boolean]
    var mouseOver: js.Function0[Boolean]
    var mouseUp: js.Function0[Boolean]
    def moveBy(dX: Int, dY: Int): void
    var moved: js.Function2[Int, Int, _]
    val moveKnob: DrawKnob with AutoChild
    var moveKnobOffset: IscArray[Int]
    val moveKnobPoint: MoveKnobPoint
    def moveTo(left: Int, top: Int): void
    def _normalize(x: Int, y: Int, inputCoordinateSystem: String = js.native, outputCoordinateSystem: String = js.native): Point
    var prompt: HTMLString
    val proportionalResizeModifiers: IscArray[KeyName]
    val proportionalResizing: ProportionalResizeMode
    def resizeBy(dX: Int, dY: Int): void
    var resized: js.Function0[_]
    val resizeKnobPoints: IscArray[ResizeKnobPoint]
    val resizeOutline: DrawRect with AutoChild
    def resizeTo(width: Int, height: Int): void
    val resizeViaLocalTransformOnly: Boolean
    def rotateBy(degrees: Double): void
    def rotateTo(degrees: Double): void
    val rotation: Double
    val scale: IscArray[Double]
    def scaleBy(x: Double, y: Double): void
    def scaleTo(x: Double, y: Double): void
    def setCanDrag(canDrag: Boolean): void
    def setCenterPoint(left: Int, top: Int): void
    def setCursor(newCursor: Cursor): void
    def setDrawPane(drawPane: DrawPane): void
    def setEndArrow(arrowStyle: ArrowStyle): void
    def setFillColor(color: Color): void
    def setFillGradient(gradient: Gradient): void
    def setFillOpacity(opacity: Double): void
    def setLineCap(cap: LineCap): void
    def setLineColor(color: CSSColor): void
    def setLineOpacity(opacity: Double): void
    def setLinePattern(pattern: LinePattern): void
    def setLineWidth(width: Int): void
    def setMoveKnobOffset(newMoveKnobOffset: IscArray[Int] = js.native): void
    def setPropertyValue(propertyName: String, newValue: JSAny): void
    def setShadow(shadow: Shadow): void
    def setStartArrow(arrowStyle: ArrowStyle): void
    def setTitle(newTitle: String = js.native): void
    var shadow: Shadow
    val shapeData: JSObject
    def show(): void
    def showAllKnobs(): void
    def showContextMenu(): void
    var showHover: Boolean
    def showKnobs(knobType: KnobType | IscArray[KnobType]): void
    var showResizeOutline: Boolean
    val showTitleLabelBackground: Boolean
    val sideResizeKnob: DrawKnob with MultiAutoChild
    var startArrow: ArrowStyle
    val _startKnob: JSUndefined[DrawKnob]
    def supportsEndArrow(): Boolean
    def supportsStartArrow(): Boolean
    var title: String
    val titleLabel: DrawLabel with AutoChild
    val titleLabelBackground: DrawLabel with AutoChild
    val titleLabelPadding: Int
    val titleRotationMode: TitleRotationMode
    val translate: IscArray[Double]
    val xShearFactor: Double
    val yShearFactor: Double
    val `type`: JSUndefined[String]
}

@js.native
abstract trait AbstractDrawItemCompanion extends AbstractClassCompanion {
    def computeAngle(px1: Double, py1: Double, px2: Double, py2: Double): Double = js.native
    def _makeCoordinate(x: Double): Int = js.native
}

@js.native
@JSName("DrawItem")
object DrawItemStatic extends AbstractDrawItemCompanion

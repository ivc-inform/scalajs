package com.simplesys.SmartClient.Foundation.inst

import com.simplesys.SmartClient.Control.inst.Menu
import com.simplesys.SmartClient.DataBinding.AnimationCallback
import com.simplesys.SmartClient.Forms.FormsItems.inst.CanvasItem
import com.simplesys.SmartClient.Foundation.props.CanvasProps
import com.simplesys.SmartClient.System
import com.simplesys.SmartClient.System.Number._
import com.simplesys.SmartClient.System.Types
import com.simplesys.SmartClient.System.Types.ValueMap
import com.simplesys.SmartClient.System.inst.Class
import com.simplesys.SmartClient.Tools.inst.EditNode
import com.simplesys.isc.System.Types.BackgroundRepeat.BackgroundRepeat
import com.simplesys.isc.System.Types.Cursor.Cursor
import com.simplesys.isc.System.Types.DragAppearance.DragAppearance
import com.simplesys.isc.System.Types.DragIntersectStyle.DragIntersectStyle
import com.simplesys.isc.System.Types.DragMaskType.DragMaskType
import com.simplesys.isc.System.Types._
import com.simplesys.isc.System.Types.AnimationAcceleration.AnimationAcceleration
import com.simplesys.SmartClient.Foundation.AnimateShowEffect._
import org.scalajs.dom.raw.{HTMLElement, DocumentEvent}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait Canvas extends Class {
    type canvasHandler <: this.type

    var accessKey: String
    def addChild(newChild: Canvas, name: String = js.native, autoDraw: Boolean = js.native): Canvas
    def addPeer(newChild: Canvas, name: String = js.native, autoDraw: Boolean = js.native, preDraw: Boolean = js.native): Canvas
    def addSnapAlignCandidate(newCandidate: Canvas): Unit
    def adjustForContent(immediate: Boolean): Unit
    val alwaysShowScrollbars: Boolean
    var animateAcceleration: AnimationAcceleration
    def animateFade(opacity: Int, callback: AnimationCallback = js.native, duration: Int = js.native, acceleration: AnimationAcceleration = js.native): Unit
    var animateFadeTime: Number
    def animateHide(effect: AnimateShowEffectId | AnimateShowEffect = js.native, callback: AnimationCallback = js.native, duration: Int = js.native, acceleration: AnimationAcceleration = js.native): Unit
    var animateHideAcceleration: AnimationAcceleration
    var animateHideEffect: AnimateShowEffectId
    var animateHideTime: Number
    def animateMove(left: Int, top: Int, callback: AnimationCallback = js.native, duration: Int = js.native, acceleration: AnimationAcceleration = js.native): Unit
    var animateMoveAcceleration: AnimationAcceleration
    var animateMoveTime: Number
    def animateRect(left: Int, top: Int, width: Int, height: Int, callback: AnimationCallback = js.native, duration: Int = js.native, acceleration: AnimationAcceleration = js.native): Unit
    var animateRectAcceleration: AnimationAcceleration
    var animateRectTime: Number
    def animateResize(width: Int, height: Int, callback: AnimationCallback = js.native, duration: Int = js.native, acceleration: AnimationAcceleration = js.native): Unit
    var animateResizeAcceleration: AnimationAcceleration
    var animateResizeTime: Number
    def animateScroll(scrollLeft: Int, scrollTop: Int, callback: AnimationCallback = js.native, duration: Int = js.native, acceleration: AnimationAcceleration = js.native): Unit
    var animateScrollAcceleration: AnimationAcceleration
    var animateScrollTime: Number
    def animateShow(effect: AnimateShowEffectId | AnimateShowEffect = js.native, callback: AnimationCallback = js.native, duration: Int = js.native, acceleration: AnimationAcceleration = js.native): Unit
    var animateShowAcceleration: AnimationAcceleration
    var animateShowEffect: AnimateShowEffectId
    var animateShowTime: Number
    var animateTime: Number
    var appImgDir: URL
    val ariaRole: String
    val ariaState: String
    val autoDraw: Boolean
    var autoShowParent: Boolean
    var backgroundColor: CSSColor
    var backgroundImage: SCImgURL
    val backgroundPosition: String
    val backgroundRepeat: BackgroundRepeat
    def blur(): Unit
    var border: String
    def bringToFront(): Unit
    var canAcceptDrop: Boolean
    var canDrag: Boolean
    var canDragReposition: Boolean
    var canDragResize: Boolean
    var canDragScroll: Boolean
    var canDrop: Boolean
    var canDropBefore: Boolean
    var canFocus: Boolean
    var canHover: Boolean
    var canSelectText: Boolean
    val canvasItem: CanvasItem
    val children: js.Array[Canvas]
    var childrenResizeSnapAlign: Boolean
    var childrenSnapAlign: Boolean
    var childrenSnapCenterAlign: Boolean
    var childrenSnapEdgeAlign: Boolean
    var childrenSnapResizeToGrid: Boolean
    var childrenSnapToGrid: Boolean
    def clear(): Unit
    var click: js.ThisFunction0[canvasHandler, Boolean]
    def clickMaskUp(ID: String = js.native): Boolean
    val componentMask: Canvas with AutoChild
    val componentMaskDefaults: CanvasProps
    def contains(canvas: Canvas, testSelf: Boolean = js.native): Boolean
    def containsEvent(): Boolean
    def containsFocus(): Boolean
    def containsPoint(x: Int, y: Int, withinViewport: Boolean = js.native): Boolean
    var contents: HTMLString
    var contextMenu: Menu
    var cursor = Cursor
    val customEdges: js.Array[String]
    var dataPath: DataPath
    var defaultHeight: Int
    var defaultWidth: Int
    def deparent(): Unit
    def depeer(): Unit
    val destroyed: Boolean
    val destroying: Boolean
    def disable(): Unit
    var disabled: Boolean
    var disabledCursor: Cursor
    val disableTouchScrollingForDrag: Boolean
    var doubleClick: js.ThisFunction0[canvasHandler, Boolean]
    var doubleClickDelay: Int
    var dragAppearance: DragAppearance
    var dragIntersectStyle: DragIntersectStyle
    var dragMaskType: DragMaskType
    var dragMove: js.ThisFunction0[canvasHandler, Boolean]
    var dragOpacity: Int
    var dragRepositionAppearance: DragAppearance
    var dragRepositionCursor: Cursor
    var dragRepositionMove: js.ThisFunction0[canvasHandler, Boolean]
    var dragRepositionStart: js.ThisFunction0[canvasHandler, Boolean]
    var dragRepositionStop: js.ThisFunction0[canvasHandler, Boolean]
    var dragResizeAppearance: DragAppearance
    var dragResizeMove: js.ThisFunction0[canvasHandler, Boolean]
    var dragResizeStart: js.ThisFunction0[canvasHandler, Boolean]
    var dragResizeStop: js.ThisFunction0[canvasHandler, Boolean]
    var dragScrollDelay: Number
    var dragStart: js.ThisFunction0[canvasHandler, Boolean]
    var dragStartDistance: Number
    var dragStop: js.ThisFunction0[canvasHandler, Boolean]
    var dragTarget: Canvas
    var dragType: String
    def draw(): Canvas
    var drop: js.ThisFunction0[canvasHandler, Boolean]
    var dropMove: js.ThisFunction0[canvasHandler, Boolean]
    var dropOut: js.ThisFunction0[canvasHandler, Boolean]
    var dropOver: js.ThisFunction0[canvasHandler, Boolean]
    var dropTypes: js.Array[String] | String
    var dynamicContents: Boolean
    var dynamicContentsVars: ValueMap
    val edgeBackgroundColor: Color
    val edgeCenterBackgroundColor: Color
    var edgeCursorMap: Types.Object
    val edgeImage: SCImgURL
    var edgeMarginSize: Number
    val edgeOffset: Number
    val edgeOpacity: Number
    val edgeShowCenter: Boolean
    val edgeSize: Number
    val editNode: EditNode
    var editProxy: EditNode with AutoChild
    val editProxyConstructor: SCClassName
    def enable(): Unit
    def encloses(other: Canvas): Boolean
    def enclosesRect(left: Number | js.Array[Number], top: Number, width: Number, height: Number): Boolean
    val extraSpace: Int
    def focus(): Unit
    var focusChanged: js.ThisFunction1[canvasHandler, Boolean, Unit]
    def focusInNextTabElement(): Unit
    def focusInPreviousTabElement(): Unit
    def getBottom(): Number
    def getByLocalId(localId: String): Canvas
    def getContentElement(): DocumentEvent
    def getContents(): HTMLElement
    def getFullDataPath(): DataPath
    def getHeight(): Number
    def getHoverComponent(): Canvas
}

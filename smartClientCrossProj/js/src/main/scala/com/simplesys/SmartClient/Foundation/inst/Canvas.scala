package com.simplesys.SmartClient.Foundation.inst

import com.simplesys.SmartClient.DataBinding.AnimationCallback
import com.simplesys.SmartClient.Forms.FormsItems.inst.CanvasItem
import com.simplesys.SmartClient.Foundation.props.CanvasProps
import com.simplesys.SmartClient.System
import com.simplesys.SmartClient.System.Number._
import com.simplesys.SmartClient.System.inst.Class
import com.simplesys.isc.System.Types.BackgroundRepeat.BackgroundRepeat
import com.simplesys.isc.System.Types._
import com.simplesys.isc.System.Types.AnimationAcceleration.AnimationAcceleration
import com.simplesys.SmartClient.Foundation.AnimateShowEffect._

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
    var contents:HTMLString

}

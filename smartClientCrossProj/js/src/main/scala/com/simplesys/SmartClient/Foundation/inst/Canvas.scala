package com.simplesys.SmartClient.Foundation.inst

import com.simplesys.SmartClient.DataBinding.AnimationCallback
import com.simplesys.SmartClient.System
import com.simplesys.SmartClient.System.inst.Class
import com.simplesys.isc.System.Types.AnimationAcceleration.AnimationAcceleration

import scala.scalajs.js

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
    def animateFade(opacity: Int, callback: AnimationCallback[canvasHandler] = js.native, duration: Int = js.native, acceleration: AnimationAcceleration = js.native): Unit
    var click: js.ThisFunction0[canvasHandler, Boolean]
}

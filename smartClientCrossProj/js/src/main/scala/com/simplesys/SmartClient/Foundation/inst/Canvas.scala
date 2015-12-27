package com.simplesys.SmartClient.Foundation.inst

import com.simplesys.SmartClient.System
import com.simplesys.SmartClient.System.inst.Class

import scala.scalajs.js

@js.native
trait Canvas extends Class {
    type clickHandler <: this.type

    var accessKey: String
    def addChild(newChild: Canvas, name: String = js.native, autoDraw: Boolean = js.native): Canvas
    def addPeer(newChild: Canvas, name: String = js.native, autoDraw: Boolean = js.native, preDraw:Boolean): Canvas
    var click: js.ThisFunction0[clickHandler, Boolean]
}

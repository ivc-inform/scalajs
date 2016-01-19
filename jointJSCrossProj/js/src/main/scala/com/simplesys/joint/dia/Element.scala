package com.simplesys.joint.dia

import com.simplesys.joint.dia.Direction.Direction

import scala.scalajs.js

@js.native
class Element extends js.Object {
    def translate(tx: Int, ty: Int = js.native, opt: TranslateOption = js.native): Unit = js.native
    def position(x: Int, y: Int = js.native, opt: PositionOption = js.native): Unit = js.native
    def resize(width: Int, height: Int, opt: ResizeOption = js.native): Unit = js.native
}

trait Area {
    val x: Int
    val y: Int
    val width: Int
    val height: Int
}

class TranslateOption extends AbstractOption {
    val restrictedArea: Option[Area] = None
}

class PositionOption extends AbstractOption {
    val parentRelative: Option[Boolean] = None
}

class ResizeOption extends AbstractOption {
    val direction: Option[Direction] = None
}


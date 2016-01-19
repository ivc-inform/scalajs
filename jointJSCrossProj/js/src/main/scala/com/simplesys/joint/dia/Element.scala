package com.simplesys.joint.dia

import scala.scalajs.js

@js.native
class Element extends js.Object {
    def translate(tx: Int, ty: Int = js.native, opt: ElementOption = js.native): Unit = js.native
    def position(x: Int, y: Int = js.native, opt: ElementOption = js.native): Unit = js.native
}

trait Area {
    val x: Int
    val y: Int
    val width: Int
    val height: Int
}

class ElementOption extends AbstractOption {
    val restrictedArea: Option[Area] = None
    val parentRelative: Option[Boolean] = None
}

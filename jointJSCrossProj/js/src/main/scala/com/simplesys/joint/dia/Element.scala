package com.simplesys.joint.dia

import scala.scalajs.js

@js.native
class Element extends js.Object {
    def translate(tx: Int, ty: Int = js.native, opt: ElementOption = js.native): Unit = js.native
    def position(x: Int, y: Int = js.native, opt: ElementOption = js.native): Unit = js.native
}

class ElementOption extends AbstractOption {
}

package com.simplesys.joint.dia

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, JSExport}

@js.native
@JSName("joint.dia.Element")
class Element extends Cell {
    def translate(tx: Int, ty: Int = js.native, opt: js.Dictionary[js.Any] = js.native): Unit = js.native
    def position(x: Int, y: Int = js.native, opt: js.Dictionary[js.Any] = js.native): Unit = js.native
    def resize(width: Int, height: Int, opt: js.Dictionary[js.Any] = js.native): Unit = js.native
    var defaults: js.Dictionary[Any] = js.native
    var id: String = js.native
}



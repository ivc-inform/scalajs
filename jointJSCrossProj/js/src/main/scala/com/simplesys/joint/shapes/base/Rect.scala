package com.simplesys.joint.shapes.base

import com.simplesys.joint.dia.Element
import com.simplesys.joint.{Size, Position}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, JSExport}

@js.native
@JSName("joint.shapes.basic.Rect")
class Rect (props: js.Dictionary[js.Any]) extends Element {
    override def clone(): Rect = js.native
}

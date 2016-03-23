package com.simplesys.SmartClient.Drawing

import com.simplesys.SmartClient.Control.Menu
import com.simplesys.System.JSObject
import com.simplesys.System.Types.MultiAutoChild
import com.simplesys.props.AbstractClassProps

import scala.scalajs.js

@js.native
trait DrawItem extends JSObject {
    var canDrag: Boolean
    var canHover: Boolean
    var click: js.Function0[Boolean]
    def computeAngle(px1: Double, py1: Double, px2: Double, py2: Double): Double
    var contextMenu: Menu
    var cornerResizeKnob: DrawKnob with MultiAutoChild
}

@js.native
abstract trait AbstractDrawItemCompanion extends AbstractClassProps {
}

@js.native
object DrawItem extends AbstractDrawItemCompanion

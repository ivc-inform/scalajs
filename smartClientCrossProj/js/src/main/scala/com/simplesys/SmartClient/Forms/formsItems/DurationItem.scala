package com.simplesys.SmartClient.Forms.formsItems

import com.simplesys.System.Types.HTMLString
import com.simplesys.System._

import scala.scalajs.js


@js.native
trait DurationValue extends JSObject {
    val days: JSUndefined[Int]
    val hours: JSUndefined[Int]
    val mins: JSUndefined[Int]
    val secs: JSUndefined[Int]
}

@js.native
trait DurationItem extends CanvasItem {

    var days: JSUndefined[Int]
    var hours: JSUndefined[Int]
    var mins: JSUndefined[Int]
    var secs: JSUndefined[Int]
    var groupTitle: JSUndefined[HTMLString]
}

@js.native
abstract trait AbstractDurationItemCompanion extends AbstractCanvasItemCompanion {
}


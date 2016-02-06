package com.simplesys.SmartClient.Layout

import com.simplesys.SmartClient.Foundation.{Canvas, AbstractCanvasCompanion, StretchImg}
import com.simplesys.System.Types2.Cursor.Cursor
import com.simplesys.System.Types2.SCImgURL

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait Splitbar extends StretchImg {
    var canCollapse: Boolean
    var canCollapseOnTap: Boolean
    var capSize: Int
    val hResizeCursor: Cursor
    var invertClosedGripIfTargetAfter: Boolean
    val showClosedGrip: Boolean
    val target: Canvas
    var targetAfter:Boolean
    val vResizeCursor: Cursor
}




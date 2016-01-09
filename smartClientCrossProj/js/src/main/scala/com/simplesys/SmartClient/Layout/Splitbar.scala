package com.simplesys.SmartClient.Layout

import com.simplesys.SmartClient.Foundation.{Canvas, AbstractCanvasCompanion, StretchImg}
import com.simplesys.isc.System.Types.Cursor.Cursor
import com.simplesys.isc.System.Types.SCImgURL

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

@js.native
abstract trait AbstractSplitbarCompanion extends AbstractCanvasCompanion {
}

@js.native
object Splitbar extends AbstractSplitbarCompanion        

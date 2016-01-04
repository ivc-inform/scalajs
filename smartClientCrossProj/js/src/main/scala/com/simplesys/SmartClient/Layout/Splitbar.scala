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
    val gripImgSuffix: String
    val hResizeCursor: Cursor
    val hSrc: SCImgURL
    var invertClosedGripIfTargetAfter: Boolean
    val showClosedGrip: Boolean
    val showDownGrip: Boolean
    val showGrip: Boolean
    val showRollOverGrip: Boolean
    val src: SCImgURL
    val target: Canvas
    var targetAfter:Boolean
    val vertical:Boolean
    val vResizeCursor: Cursor
    val vSrc: SCImgURL
}

@js.native
abstract trait AbstractSplitbarCompanion extends AbstractCanvasCompanion {
}

@js.native
object Splitbar extends AbstractSplitbarCompanion        

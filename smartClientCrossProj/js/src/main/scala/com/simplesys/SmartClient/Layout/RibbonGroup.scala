package com.simplesys.SmartClient.Layout

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.System.Class
import com.simplesys.isc.System.Types.AutoChild

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait RibbonGroup extends ToolStripGroup {
    def createControl(properties: Canvas, position: Int = js.native): Unit
    val newControlConstructor: Class
    val newControlDefaults: IconButton with AutoChild
}

@js.native
abstract trait AbstractRibbonGroupCompanion extends AbstractToolStripGroupCompanion {
}

@js.native
object RibbonGroup extends AbstractRibbonGroupCompanion        

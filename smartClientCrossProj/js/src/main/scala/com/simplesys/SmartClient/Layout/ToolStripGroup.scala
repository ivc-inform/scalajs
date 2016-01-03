package com.simplesys.SmartClient.Layout

import com.simplesys.SmartClient.Foundation.{Label, Canvas, AbstractCanvasCompanion}
import com.simplesys.isc.System.Types.Alignment.Alignment
import com.simplesys.isc.System.Types.{SCClassName, AutoChild}
import com.simplesys.isc.System.Types.VerticalAlignment.VerticalAlignment

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait ToolStripGroup extends VLayout {
    def addControl(control: Canvas, index: Int = js.native): Unit
    def addControls(controls: js.Array[Canvas], index: Int = js.native): Unit
    val autoSizeToTitle: Boolean
    val body: HLayout with AutoChild
    val bodyConstructor: String
    val controls: js.Array[Canvas]
    val label: HLayout with AutoChild
    val labelConstructor: String
    var numRows: Int
    def removeControl(control: Canvas): Unit
    var rowHeight: Int
    def setControlColumn(control: Canvas): Unit
    def setControls(controls: js.Array[Canvas]): Unit
    def setShowTitle(showTitle: Boolean): Unit
    def setTitle(title: String): Unit
    def setTitleAlign(align: Alignment): Unit
    def setTitleOrientation(orientation: VerticalAlignment): Unit
    val titleAlign: Alignment
    val titleHeight: Int
    val titleOrientation: VerticalAlignment
    val titleProperties: Label with AutoChild
    var titleStyle: SCClassName
}


@js.native
abstract trait AbstractToolStripGroupCompanion extends AbstractCanvasCompanion {
}

@js.native
object ToolStripGroup extends AbstractToolStripGroupCompanion        

package com.simplesys.SmartClient.Layout

import com.simplesys.SmartClient.Foundation.{Canvas, AbstractCanvasCompanion}
import com.simplesys.SmartClient.Layout.portalLayout.PortalPosition.PortalPosition
import com.simplesys.SmartClient.Layout.portalLayout.Portlet
import com.simplesys.isc.System.Types.MultiAutoChild
import com.simplesys.isc.System.Types.Overflow.Overflow

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait PortalLayout extends Layout {
    def addColumn(index: Int): Unit
    def addPortlet(portlet: Portlet, colNum: Int = js.native, rowWithinCol: Int = js.native, positionInExistingRow: Int = js.native): Unit
    var canResizeColumns: Boolean
    var canResizePortlets: Boolean
    var canShrinkColumnWidths: Boolean
    var canStretchColumnWidths: Boolean
    var column: Layout | MultiAutoChild
    var columnBorder: String
    var columnOverflow: Overflow
    def getColumnWidth(colNumber: Int): Int
    def getDropPortlet(dragTarget: Canvas, colNum: Int, rowNum: Int, dropPosition: Int = js.native): Canvas
    def getNumColumns(): Int
    def getPortalPosition(portlet: Portlet): PortalPosition
    def getPortletArray(): js.Array[js.Array[js.Array[Portlet]]]
    def getPortlets(): js.Array[Portlet]
    val numColumns: Int
    var portletDropTypes: js.Array[String]
    def portletMaximized(portlet: Portlet): Unit
    def portletMinimized(portlet: Portlet): Unit
    def portletRestored(portlet: Portlet): Unit
    val portlets: js.Array[Portlet]
    var portletsChanged: js.ThisFunction0[callbackHandler, Unit]
    var portletsResized: js.ThisFunction0[callbackHandler, Unit]
    var preventColumnUnderflow: Boolean
    var preventRowUnderflow: Boolean
    var preventUnderflow: Boolean
    def removeColumn(index: Int): Unit
    def removePortlet(portlet: Portlet): Unit
    val row: Layout with MultiAutoChild
    val rowLayout: Layout with MultiAutoChild
    def setCanResizeColumns(canResize: Boolean): Unit
    def setCanResizePortlets(canResize: Boolean): Unit
    def setCanShrinkColumnWidths(canShrink: Boolean): Unit
    def setCanStretchColumnWidths(canStretch: Boolean): Unit
    def setColumnBorder(columnBorder: String): Unit
    def setColumnOverflow(overflow: Overflow): Unit
    def setColumnWidth(colNumber: Int, width: String | Int): Unit
    def setPortletDropTypes(portletDropTypes: js.Array[String]): Unit
    def setPreventRowUnderflow(preventRowUnderflow: Boolean): Unit
    def setPreventUnderflow(preventUnderflow: Boolean): Unit
    def setShowColumnMenus(showMenus: Boolean): Unit
    def setStretchColumnWidthsProportionally(stretchProportionally: Boolean): Unit
    var showColumnMenus: Boolean
    var stretchColumnWidthsProportionally: Boolean
    def willAcceptPortletDrop(dragTarget: Int, colNum: Int, rowNum: Int, dropPosition: Int = js.native): Boolean
    var willMaximizePortlet: js.ThisFunction1[callbackHandler, Portlet, Boolean]
    var willMinimizePortlet: js.ThisFunction1[callbackHandler, Portlet, Boolean]
    var willRestorePortlet: js.ThisFunction1[callbackHandler, Portlet, Boolean]
}

@js.native
abstract trait AbstractPortalLayoutCompanion extends AbstractCanvasCompanion {
}

@js.native
object PortalLayout extends AbstractPortalLayoutCompanion        

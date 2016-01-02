package com.simplesys.SmartClient.Control.inst

import com.simplesys.SmartClient.Foundation.inst.StatefulCanvas
import com.simplesys.isc.System.Types.Cursor.Cursor
import com.simplesys.isc.System.Types.HTMLString

import scala.scalajs.js

@js.native
trait Button extends StatefulCanvas {
    type buttonHandler <: this.type
    var action: js.ThisFunction0[buttonHandler, Unit]
    val disabledIconCursor: Cursor
    var hiliteAccessKey: Boolean
    val iconAlign: String
    var iconClick: js.ThisFunction0[buttonHandler, Boolean]
    val iconCursor: Cursor
    def setAlign(): Unit
    def setSelected(): Unit
    def setVAlign(): Unit
    def setWrap(newWrap: Boolean): Unit
    var showClippedTitleOnHover: Boolean
    var showDisabledIcon: Boolean
    var titleClipped: js.ThisFunction0[buttonHandler, Boolean]
    var titleHover: js.ThisFunction0[buttonHandler, Boolean]
    def titleHoverHTML(defaultHTML: HTMLString): HTMLString
    var wrap: Boolean
}


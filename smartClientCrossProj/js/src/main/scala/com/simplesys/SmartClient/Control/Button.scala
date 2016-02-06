package com.simplesys.SmartClient.Control

import com.simplesys.SmartClient.Foundation.StatefulCanvas
import com.simplesys.System.Types.Cursor.Cursor
import com.simplesys.System.Types.{HTMLString, void}

import scala.scalajs.js

@js.native
trait Button extends StatefulCanvas {
    type buttonHandler <: this.type
    var action: js.ThisFunction0[buttonHandler, void]
    val disabledIconCursor: Cursor
    var hiliteAccessKey: Boolean
    val iconAlign: String
    var iconClick: js.ThisFunction0[buttonHandler, Boolean]
    val iconCursor: Cursor
    def setAlign(): void
    def setSelected(): void
    def setVAlign(): void
    def setWrap(newWrap: Boolean): void
    var showClippedTitleOnHover: Boolean
    var showDisabledIcon: Boolean
    var titleClipped: js.ThisFunction0[buttonHandler, Boolean]
    var titleHover: js.ThisFunction0[buttonHandler, Boolean]
    def titleHoverHTML(defaultHTML: HTMLString): HTMLString
    var wrap: Boolean
}






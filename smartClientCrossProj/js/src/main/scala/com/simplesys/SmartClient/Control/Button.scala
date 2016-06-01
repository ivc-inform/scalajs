package com.simplesys.SmartClient.Control

import com.simplesys.SmartClient.Foundation.StatefulCanvas
import com.simplesys.System.Types.Cursor.Cursor
import com.simplesys.System.Types.{HTMLString, void}

import scala.scalajs.js

@js.native
trait Button extends StatefulCanvas {
    var action: js.ThisFunction0[callbackHandler, void]
    val disabledIconCursor: Cursor
    var hiliteAccessKey: Boolean
    val iconAlign: String
    var iconClick: js.ThisFunction0[callbackHandler, Boolean]
    val iconCursor: Cursor
    def setAlign(): void
    def setSelected(): void
    def setVAlign(): void
    def setWrap(newWrap: Boolean): void
    var showClippedTitleOnHover: Boolean
    var showDisabledIcon: Boolean
    var titleClipped: js.ThisFunction0[callbackHandler, Boolean]
    var titleHover: js.ThisFunction0[callbackHandler, Boolean]
    def titleHoverHTML(defaultHTML: HTMLString): HTMLString
    var wrap: Boolean
}






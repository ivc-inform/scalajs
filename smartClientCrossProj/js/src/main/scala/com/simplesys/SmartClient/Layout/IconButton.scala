package com.simplesys.SmartClient.Layout

import com.simplesys.SmartClient.Control.Button
import com.simplesys.SmartClient.Foundation.AbstractCanvasCompanion
import com.simplesys.isc.System.Types.SCImgURL
import com.simplesys.isc.System.Types.VerticalAlignment.VerticalAlignment

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait IconButton extends Button {
    var largeIcon: SCImgURL
    var largeIconSize: Int
    var menuIconClick: js.ThisFunction0[callbackHandler, Boolean]
    var menuIconHeight: Int
    var menuIconSrc: SCImgURL
    var menuIconWidth: Int
    var orientation: String
    var rowSpan: Int
    def setLargeIcon(icon: SCImgURL): Unit
    var showButtonTitle: Boolean
    var showIcon: Boolean
    var showMenuIcon: Boolean
    var showMenuIconDisabled: Boolean
    var showMenuIconOver: Boolean
    var showMenuOnClick: Boolean
    var showTitle: Boolean
}

@js.native
abstract trait AbstractIconButtonCompanion extends AbstractCanvasCompanion {
}

@js.native
object IconButton extends AbstractIconButtonCompanion        
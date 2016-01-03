package com.simplesys.SmartClient.Layout

import com.simplesys.SmartClient.Control.Menu

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait IconMenuButton extends IconButton {
    var menu: Menu
    var menuAnimationEffect: String
    var showMenu: js.ThisFunction0[callbackHandler, Boolean]
}

@js.native
abstract trait AbstractIconMenuButtonCompanion extends AbstractIconButtonCompanion {
}

@js.native
object IconMenuButton extends AbstractIconMenuButtonCompanion        

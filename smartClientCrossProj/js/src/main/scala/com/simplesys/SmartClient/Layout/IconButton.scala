package com.simplesys.SmartClient.Layout

import com.simplesys.SmartClient.Control.Button
import com.simplesys.SmartClient.Foundation.AbstractCanvasCompanion

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait IconButton extends Button {
}

@js.native
abstract trait AbstractIconButtonCompanion extends AbstractCanvasCompanion {
}

@js.native
object IconButton extends AbstractIconButtonCompanion        

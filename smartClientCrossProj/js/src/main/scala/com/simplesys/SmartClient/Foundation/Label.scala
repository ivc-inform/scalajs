package com.simplesys.SmartClient.Foundation

import com.simplesys.SmartClient.Control.Button
import com.simplesys.isc.System.Types.{CSSStyleName, URL}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait Label extends Button {
}

@js.native
abstract trait AbstractLabelCompanion extends AbstractCanvasCompanion {
}

@js.native
object Label extends AbstractLabelCompanion        

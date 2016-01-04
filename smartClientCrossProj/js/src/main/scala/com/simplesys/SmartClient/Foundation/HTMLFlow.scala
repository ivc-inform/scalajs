package com.simplesys.SmartClient.Foundation

import com.simplesys.SmartClient.DataBinding.DataBoundComponent

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait HTMLFlow extends Canvas with DataBoundComponent{
}

@js.native
abstract trait AbstractHTMLFlowCompanion extends AbstractCanvasCompanion {
}

@js.native
object HTMLFlow extends AbstractHTMLFlowCompanion        

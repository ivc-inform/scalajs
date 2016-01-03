package com.simplesys.SmartClient.Layout

import com.simplesys.SmartClient.Foundation.{AbstractCanvasCompanion, Canvas}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait LayoutSpacer extends Canvas {
}

@js.native
abstract trait AbstractLayoutSpacerCompanion extends AbstractCanvasCompanion {
}

@js.native
object LayoutSpacer extends AbstractLayoutSpacerCompanion        

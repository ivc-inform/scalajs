package com.simplesys.SmartClient.Drawing

import com.simplesys.SmartClient.Foundation.{AbstractCanvasCompanion, Canvas}

import scala.scalajs.js

@js.native
trait DrawKnob extends Canvas {
}

@js.native
abstract trait AbstractDrawKnobCompanion extends AbstractCanvasCompanion {
}

@js.native
object DrawKnob extends AbstractDrawKnobCompanion

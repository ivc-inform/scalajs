package com.simplesys.SmartClient.Control.button

import com.simplesys.SmartClient.Control.Button
import com.simplesys.SmartClient.Foundation.AbstractCanvasCompanion

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait AutoFitButton extends Button {
}

@js.native
abstract trait AbstractAutoFitButtonCompanion extends AbstractCanvasCompanion {
}

@js.native
@JSName ("AutoFitButton")
object AutoFitButtonStatic extends AbstractAutoFitButtonCompanion



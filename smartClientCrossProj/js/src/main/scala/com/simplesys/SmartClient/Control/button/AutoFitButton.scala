package com.simplesys.SmartClient.Control.button

import com.simplesys.SmartClient.Control.Button
import com.simplesys.SmartClient.Foundation.AbstractCanvasCompanion

import scala.scalajs.js

@js.native
trait AutoFitButton extends Button {
}

@js.native
abstract trait AbstractAutoFitButtonCompanion extends AbstractCanvasCompanion {
}

package companion {

import scala.scalajs.js

@js.native
object AutoFitButton extends AbstractAutoFitButtonCompanion
}


package com.simplesys.SmartClient.Control

import com.simplesys.SmartClient.Control.props.IButtonProps
import com.simplesys.SmartClient.System.SCApply
import com.simplesys.macros.PropsToDictionary

import scala.scalajs.js

@js.native
trait IButton extends Button

@js.native
abstract class AbstractIButtonCompanion extends AbstractButtonCompanion {
}

object IButton extends SCApply[IButton, IButtonProps]

package companion {
   @js.native
   object IButton extends AbstractIButtonCompanion
}

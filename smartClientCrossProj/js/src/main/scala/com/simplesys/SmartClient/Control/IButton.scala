package com.simplesys.SmartClient.Control

import scala.scalajs.js

@js.native
trait IButton extends Button

@js.native
abstract class AbstractIButtonCompanion extends AbstractButtonCompanion {
}

package companion {
@js.native
object IButton extends AbstractIButtonCompanion
}

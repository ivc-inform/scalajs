package com.simplesys.SmartClient.System

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait Timer extends Class {
}

@js.native
abstract trait AbstractTimerCompanion extends AbstractClassCompanion {
    def clear(timerEvent: Types.Object): Unit = js.native
    def setTimeout(action: js.Function0[Unit] | String, delay: Int): Types.Object = js.native
}

@js.native
object Timer extends AbstractTimerCompanion        

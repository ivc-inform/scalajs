package com.simplesys.SmartClient.System

import com.simplesys.System.Types.void

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait Timer extends Class {
}

@js.native
abstract trait AbstractTimerCompanion extends AbstractClassCompanion {
    def clear(timerEvent: Types.Object): void = js.native
    def setTimeout(action: js.Function0[void] | String, delay: Int): Types.Object = js.native
}

package companion {

import scala.scalajs.js

@js.native
   object Timer extends AbstractTimerCompanion
}


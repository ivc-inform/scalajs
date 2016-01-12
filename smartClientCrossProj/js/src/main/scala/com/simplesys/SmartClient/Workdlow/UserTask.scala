package com.simplesys.SmartClient.Workdlow

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait UserTask extends Task {
}

@js.native
abstract trait AbstractUserTaskCompanion extends AbstractTaskCompanion {
}

package companion {

import scala.scalajs.js

@js.native
   object UserTask extends AbstractUserTaskCompanion
}


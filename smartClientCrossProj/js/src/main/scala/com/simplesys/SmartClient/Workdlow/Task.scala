package com.simplesys.SmartClient.Workdlow

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait Task extends ProcessElement {
}

@js.native
abstract trait AbstractTaskCompanion extends AbstractProcessElementCompanion {
}

package companion {

import scala.scalajs.js

@js.native
   object Task extends AbstractTaskCompanion
}


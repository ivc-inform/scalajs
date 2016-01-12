package com.simplesys.SmartClient.Layout

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait Snapbar extends Splitbar {
}

@js.native
abstract trait AbstractSnapbarCompanion extends AbstractSplitbarCompanion {
}

package companion {

import scala.scalajs.js

@js.native
   object Snapbar extends AbstractSnapbarCompanion
}


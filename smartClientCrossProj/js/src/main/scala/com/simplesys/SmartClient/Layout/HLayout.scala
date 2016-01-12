package com.simplesys.SmartClient.Layout

import com.simplesys.SmartClient.Foundation.AbstractCanvasCompanion

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait HLayout extends Layout {
}

@js.native
abstract trait AbstractHLayoutCompanion extends AbstractCanvasCompanion {
}

package companion {

import scala.scalajs.js

@js.native
   object HLayout extends AbstractHLayoutCompanion
}


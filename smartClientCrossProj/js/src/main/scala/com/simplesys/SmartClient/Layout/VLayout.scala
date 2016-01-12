package com.simplesys.SmartClient.Layout

import com.simplesys.SmartClient.Foundation.AbstractCanvasCompanion

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait VLayout extends Layout {
}

@js.native
abstract trait AbstractVLayoutCompanion extends AbstractCanvasCompanion {
}

package companion {

import scala.scalajs.js

@js.native
   object VLayout extends AbstractVLayoutCompanion
}


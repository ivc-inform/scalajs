package com.simplesys.SmartClient.Foundation

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait DrawPane extends Canvas {
}

@js.native
abstract trait AbstractDrawPaneCompanion extends AbstractCanvasCompanion {
}

package companion {

import scala.scalajs.js

@js.native
   object DrawPane extends AbstractDrawPaneCompanion
}


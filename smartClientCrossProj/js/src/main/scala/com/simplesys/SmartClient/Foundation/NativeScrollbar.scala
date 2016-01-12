package com.simplesys.SmartClient.Foundation

import com.simplesys.System.Types.void

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait NativeScrollbar extends Canvas {
    def setScrollTarget(newTarget: Canvas = js.native): void
}

@js.native
abstract trait AbstractNativeScrollbarCompanion extends AbstractCanvasCompanion {
}

package companion {

import scala.scalajs.js

@js.native
   object NativeScrollbar extends AbstractNativeScrollbarCompanion
}


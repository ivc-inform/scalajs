package com.simplesys.SmartClient.Foundation

import com.simplesys.SmartClient.Control.Button

import scala.scalajs.js

@js.native
trait Label extends Button {
}

@js.native
abstract trait AbstractLabelCompanion extends AbstractCanvasCompanion {
}

package companion {
    @js.native
    object Label extends AbstractLabelCompanion
}

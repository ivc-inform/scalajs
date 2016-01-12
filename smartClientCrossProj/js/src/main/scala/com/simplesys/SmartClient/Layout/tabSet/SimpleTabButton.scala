package com.simplesys.SmartClient.Layout.tabSet

import com.simplesys.SmartClient.Control.Button
import com.simplesys.SmartClient.Foundation.AbstractCanvasCompanion

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait SimpleTabButton extends Button {
}

@js.native
abstract trait AbstractSimpleTabButtonCompanion extends AbstractCanvasCompanion {
}

package companion {

import scala.scalajs.js

@js.native
   object SimpleTabButton extends AbstractSimpleTabButtonCompanion
}


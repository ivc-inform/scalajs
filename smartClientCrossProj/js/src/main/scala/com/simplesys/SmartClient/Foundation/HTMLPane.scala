package com.simplesys.SmartClient.Foundation

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait HTMLPane extends HTMLFlow {
}

@js.native
abstract trait AbstractHTMLPaneCompanion extends AbstractHTMLFlowCompanion {
}

package companion {

import scala.scalajs.js

@js.native
   object HTMLPane extends AbstractHTMLPaneCompanion
}


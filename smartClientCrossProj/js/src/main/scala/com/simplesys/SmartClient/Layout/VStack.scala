package com.simplesys.SmartClient.Layout

import com.simplesys.SmartClient.Foundation.AbstractCanvasCompanion

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait VStack extends Layout {
}

@js.native
abstract trait AbstractVStackCompanion extends AbstractCanvasCompanion {
}

package companion {

import scala.scalajs.js

@js.native
   object VStack extends AbstractVStackCompanion
}


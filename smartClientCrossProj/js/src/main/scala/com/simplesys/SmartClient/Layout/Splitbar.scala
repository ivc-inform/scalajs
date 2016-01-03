package com.simplesys.SmartClient.Layout

import com.simplesys.SmartClient.Foundation.{AbstractCanvasCompanion, StretchImg}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait Splitbar extends StretchImg {
}

@js.native
abstract trait AbstractSplitbarCompanion extends AbstractCanvasCompanion {
}

@js.native
object Splitbar extends AbstractSplitbarCompanion        

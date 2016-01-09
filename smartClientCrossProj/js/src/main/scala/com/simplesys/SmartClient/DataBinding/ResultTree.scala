package com.simplesys.SmartClient.DataBinding

import com.simplesys.SmartClient.System.{AbstractTreeCompanion, Tree}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait ResultTree extends Tree {
}

@js.native
abstract trait AbstractResultTreeCompanion extends AbstractTreeCompanion {
}

@js.native
object ResultTree extends AbstractResultTreeCompanion        

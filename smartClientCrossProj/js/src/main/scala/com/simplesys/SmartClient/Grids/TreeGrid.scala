package com.simplesys.SmartClient.Grids

import com.simplesys.SmartClient.Foundation.AbstractCanvasCompanion

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait TreeGrid extends ListGrid {
}

@js.native
abstract trait AbstractTreeGridCompanion extends AbstractCanvasCompanion {
}

@js.native
object TreeGrid extends AbstractTreeGridCompanion        

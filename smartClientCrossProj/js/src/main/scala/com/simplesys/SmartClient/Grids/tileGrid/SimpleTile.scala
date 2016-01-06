package com.simplesys.SmartClient.Grids.tileGrid

import com.simplesys.SmartClient.Foundation.{AbstractCanvasCompanion, StatefulCanvas}
import com.simplesys.SmartClient.Grids.TileGrid
import com.simplesys.isc.System.Types.{HTMLString, CSSClassName}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait SimpleTile extends StatefulCanvas {
    val creator: TileGrid
    def getRecord(): TileRecord
    val tileGrid: TileGrid
}

@js.native
abstract trait AbstractSimpleTileCompanion extends AbstractCanvasCompanion {
}

@js.native
object SimpleTile extends AbstractSimpleTileCompanion        

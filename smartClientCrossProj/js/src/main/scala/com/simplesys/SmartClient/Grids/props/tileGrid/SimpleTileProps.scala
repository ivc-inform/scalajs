package com.simplesys.SmartClient.Grids.props.tileGrid

import com.simplesys.SmartClient.Foundation.props.StatefulCanvasProps
import com.simplesys.SmartClient.Grids.TileGrid
import com.simplesys.option.{ScOption, ScNone}

import scala.scalajs.js._

class SimpleTileProps extends StatefulCanvasProps {
    var creator: ScOption[TileGrid] = ScNone
    var tileGrid: ScOption[TileGrid] = ScNone
}

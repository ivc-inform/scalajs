package com.simplesys.SmartClient.Tools.palette.props

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Grids.props.TileGridProps
import com.simplesys.SmartClient.Tools.palette.TilePalette
import com.simplesys.SmartClient.Tools.props.PaletteProps

import scala.scalajs.js._
import com.simplesys.option.{ScNone, ScOption}

class TilePaletteProps extends TileGridProps with PaletteProps{
    type callbackHandler <: TilePalette
}

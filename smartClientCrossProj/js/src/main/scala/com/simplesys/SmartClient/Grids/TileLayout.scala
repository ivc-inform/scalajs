package com.simplesys.SmartClient.Grids

import javax.swing.tree.FixedHeightLayoutCache

import com.simplesys.SmartClient.DataBinding.DataBoundComponent
import com.simplesys.SmartClient.Foundation.{AbstractCanvasCompanion, Canvas}
import com.simplesys.SmartClient.System.Types
import com.simplesys.SmartClient.System.Types.{Object, Record}
import com.simplesys.isc.System.Types.{void, AutoChild}
import com.simplesys.isc.System.Types.DragDataAction.DragDataAction
import com.simplesys.isc.System.Types.Orientation.Orientation
import com.simplesys.isc.System.Types.Overflow.Overflow
import com.simplesys.isc.System.Types.TileLayoutPolicy.TileLayoutPolicy

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait TileLayout extends Canvas {
    def addTile(tile: Canvas, index: Int = js.native): void
    var animateTileChange: Boolean
    var autoWrapLines: Boolean
    var dragDataAction: DragDataAction
    val dragLine: Canvas with AutoChild
    val expandMargins: Boolean
    var getDragData: js.Function1[DataBoundComponent, js.Array[Record]]
    def getTile(index: Int): Canvas
    val layoutMargin: Int
    val layoutPolicy: TileLayoutPolicy
    val orientation: Orientation
    var paddingAsLayoutMargin: Boolean
    def removeTile(tileID: String | Canvas): Boolean
    def setTileHeight(height: Int): void
    def setTileHMargin(margin: Int): void
    def setTileMargin(margin: Int): void
    def setTileSize(size: Int): void
    def setTilesPerLine(tilesPerLine: Int): void
    def setTileVMargin(margin: Int): void
    def setTileWidth(width: Int): void
    val tileHeight: Int
    val tileHMargin: Int
    val tileMargin: Int
    val tiles: js.Array[Canvas]
    val tileSize: Int
    val tilesPerLine: Int
    val tileVMargin: Int
    val tileWidth: Int
    def transferDragData(): js.Array[Object]
}

@js.native
abstract trait AbstractTileLayoutCompanion extends AbstractCanvasCompanion {
}

@js.native
object TileLayout extends AbstractTileLayoutCompanion        

package com.simplesys.SmartClient.Grids

import javax.swing.tree.FixedHeightLayoutCache

import com.simplesys.SmartClient.DataBinding.DataBoundComponent
import com.simplesys.SmartClient.Foundation.{AbstractCanvasCompanion, Canvas}
import com.simplesys.SmartClient.System.Types
import com.simplesys.SmartClient.System.Types.{Object, Record}
import com.simplesys.System.Types2.{void, AutoChild}
import com.simplesys.System.Types2.DragDataAction.DragDataAction
import com.simplesys.System.Types2.Orientation.Orientation
import com.simplesys.System.Types2.Overflow.Overflow
import com.simplesys.System.Types2.TileLayoutPolicy.TileLayoutPolicy
import com.simplesys.Types1.JSArray

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
    var getDragData: js.Function1[DataBoundComponent, JSArray[Record]]
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
    val tiles: JSArray[Canvas]
    val tileSize: Int
    val tilesPerLine: Int
    val tileVMargin: Int
    val tileWidth: Int
    def transferDragData(): JSArray[Object]
}





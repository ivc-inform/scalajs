package com.simplesys.SmartClient.Grids

import com.simplesys.SmartClient.DataBinding.{DSRequest, DataBoundComponent}
import com.simplesys.SmartClient.DataBinding.dataSource.DSCallback
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Grids.detailViewer.DetailViewerField
import com.simplesys.SmartClient.Grids.tileGrid.TileRecord
import com.simplesys.SmartClient.System.Types.Criteria
import com.simplesys.isc.System.Types.DragDataAction.DragDataAction
import com.simplesys.isc.System.Types.{CSSStyleName, HTMLString}
import com.simplesys.isc.System.Types.TextMatchStyle.TextMatchStyle

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait TileGrid extends TileLayout with DataBoundComponent {
    def addData(newRecord: TileRecord, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): Unit
    def addTile(): Unit
    val autoFetchTextMatchStyle: TextMatchStyle
    var canAcceptDroppedRecords: Boolean
    var canDragTilesOut: Boolean
    var canReorderTiles: Boolean
    def createTile(record: TileRecord, tileIndex: Int): Canvas
    var data: Array[TileRecord]
    var dataArrived: js.Function2[Int, Int, Unit]
    val detailViewer: DetailViewer
    val detailViewerProperties: js.Dictionary[js.Any]
    var drawAllMaxTiles: Int
    var emptyMessage: HTMLString
    var emptyMessageStyle: CSSStyleName
    def fetchData(criteria: Criteria = js.native, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): Unit
    val fields: Array[DetailViewerField]
}

@js.native
abstract trait AbstractTileGridCompanion extends AbstractTileLayoutCompanion {
}

@js.native
object TileGrid extends AbstractTileGridCompanion        

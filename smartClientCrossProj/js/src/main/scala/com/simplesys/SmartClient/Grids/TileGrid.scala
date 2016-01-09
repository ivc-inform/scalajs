package com.simplesys.SmartClient.Grids

import com.simplesys.SmartClient.DataBinding.{DSRequest, DataBoundComponent}
import com.simplesys.SmartClient.DataBinding.dataSource.DSCallback
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Grids.detailViewer.DetailViewerField
import com.simplesys.SmartClient.Grids.listGrid.ListGridRecord
import com.simplesys.SmartClient.Grids.tileGrid.{SimpleTile, TileRecord}
import com.simplesys.SmartClient.System.Types.{Callback, ListGridFieldState, Criteria}
import com.simplesys.isc.System.Types.DragAppearance.DragAppearance
import com.simplesys.isc.System.Types.DragDataAction.DragDataAction
import com.simplesys.isc.System.Types.SelectionType.SelectionType
import com.simplesys.isc.System.Types._
import com.simplesys.isc.System.Types.TextMatchStyle.TextMatchStyle

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait TileGrid extends TileLayout with DataBoundComponent {
    def addData(newRecord: TileRecord, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): void
    def addTile(): void
    val autoFetchTextMatchStyle: TextMatchStyle
    var canAcceptDroppedRecords: Boolean
    var canDragTilesOut: Boolean
    var canReorderTiles: Boolean
    def createTile(record: TileRecord, tileIndex: Int): Canvas
    var data: Array[TileRecord]
    var dataArrived: js.Function2[Int, Int, void]
    val detailViewer: DetailViewer
    val detailViewerProperties: js.Dictionary[js.Any]
    var drawAllMaxTiles: Int
    var emptyMessage: HTMLString
    var emptyMessageStyle: CSSStyleName
    def fetchData(criteria: Criteria = js.native, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): void
    val fields: Array[DetailViewerField]
    def filterData(criteria: Criteria = js.native, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): void
    def getCurrentTile(): SimpleTile
    def getDragTrackerTitle(record: ListGridRecord, rowNum: Int): String
    def getFieldState(): ListGridFieldState
    def getSelectedRecord(): TileRecord
    def getSelection(excludePartialSelections: Boolean = js.native): Array[ListGridRecord]
    def getTile(tile: TileRecord | Int): Canvas
    def getTileHTML(tileRecord: TileRecord): HTMLString
    def getTileIndex(tile: Canvas): Int
    def getTileRecord(tile: Canvas): TileRecord
    def invalidateCache(): void
    val loadingMessage: HTMLString
    val printTilesPerLine: Int
    var recordClick: js.Function3[TileGrid, Canvas, TileRecord, void]
    var recordContextClick: js.Function3[TileGrid, Canvas, TileRecord, Boolean]
    var recordDoubleClick: js.Function3[TileGrid, Canvas, TileRecord, void]
    val recycleTiles: Boolean
    def removeData(data: TileRecord, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): void
    def removeSelectedData(callback: DSCallback = js.native, requestProperties: DSRequest = js.native): void
    def removeTile(): void
    var selectionChanged: js.Function2[TileRecord, Boolean, void]
    var selectionType: SelectionType
    def selectRecord(record: TileRecord | Int, newState: Boolean = js.native): void
    def selectRecords(record: js.Array[TileRecord] | js.Array[Int], newState: Boolean = js.native): void
    def setCanAcceptDroppedRecords(): void
    def setCanDragTilesOut(): void
    def setCanReorderTiles(): void
    def setFieldState(fieldState: ListGridFieldState): void
    val showAllRecords: Boolean
    val showEmptyMessage: Boolean
    val tile: SimpleTile with MultiAutoChild
    var tileConstructor: SCClassName
    var tileDragAppearance: DragAppearance
    var tileProperties: Canvas
    val tileValueAlign: String
    val tileValueStyle: CSSClassName
    def updateTile(record: TileRecord, tileIndex: Int, reclaimedTile: Canvas): void
    val wrapValues: Boolean
}

@js.native
abstract trait AbstractTileGridCompanion extends AbstractTileLayoutCompanion {
}

@js.native
object TileGrid extends AbstractTileGridCompanion        

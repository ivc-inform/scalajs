package com.simplesys.SmartClient.Grids


import com.simplesys.SmartClient.Control.IButton
import com.simplesys.SmartClient.DataBinding.{DSCallback, DSRequest, DataBoundComponent}
import com.simplesys.SmartClient.Grids.listGrid.{ListGridRecord, ListGridField}
import com.simplesys.SmartClient.Grids.treeGrid.{Tree, TreeNode}
import com.simplesys.SmartClient.Layout.{Layout, AbstractLayoutCompanion}
import com.simplesys.SmartClient.System.Types.Criteria
import com.simplesys.System.Types._
import com.simplesys.System.Types.TextMatchStyle.TextMatchStyle
import com.simplesys.types.JSAny

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait ColumnTree extends Layout with DataBoundComponent {
    def anySelected(colNum: Int = js.native): Boolean
    val autoFetchTextMatchStyle: TextMatchStyle
    var backButton: IButton with AutoChild
    var backButtonTitle: String
    var closedIconSuffix: String
    val column: Grid[ListGridField, ListGridRecord] with MultiAutoChild
    val columnProperties: js.Dictionary[JSAny]
    var customIconOpenProperty: String
    var customIconProperty: String
    var data: Tree
    var dataProperties: Tree
    def fetchData(criteria: Criteria = js.native, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): void
    var fields: Array[ListGridField]
    def filterData(criteria: Criteria = js.native, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): void
    val firstColumnTitle: String
    var folderIcon: SCImgURL
    def getColumn(column: TreeNode): Grid[ListGridField, ListGridRecord]
    def getColumnProperties(node: TreeNode, colNum: Int): Grid[ListGridField, ListGridRecord]
    def getColumnTitle(node: TreeNode, colNum: Int): void
    def getData(): Tree
    def getIcon(node: TreeNode): URL
    def getNodeTitle(node: TreeNode, recordNum: Int, field: String): HTMLString
    def getRecord(index: Int, colNum: Int): TreeNode
    def getSelectedRecord(): ListGridRecord
    val loadDataOnDemand: Boolean
    def navigateBack(): void
    var nodeIcon: SCImgURL
    var nodeSelected: js.Function2[Grid[ListGridField, ListGridRecord], TreeNode, Boolean]
    var openIconSuffix: String
    def selectRecord(record: ListGridRecord | Int, newState: Boolean = js.native, colNum: Int = js.native): void
    def selectRecords(records: js.Array[ListGridRecord] | js.Array[Int], newState: Boolean = js.native, colNum: Int = js.native): void
    def setData(newData: Tree): void
    def shouldShowHeader(node: TreeNode, colNum: Int): void
    var showCustomIconOpen:Boolean
    var showHeaders:Boolean
    var showMultipleColumns:Boolean
    var showNodeCount:Boolean
    var showOpenIcons:Boolean
}

@js.native
abstract trait AbstractColumnTreeCompanion extends AbstractLayoutCompanion {
}

@js.native
   object ColumnTree extends AbstractColumnTreeCompanion



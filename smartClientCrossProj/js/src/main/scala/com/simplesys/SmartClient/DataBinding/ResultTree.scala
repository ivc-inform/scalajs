package com.simplesys.SmartClient.DataBinding

import com.simplesys.SmartClient.Grids.treeGrid.{Tree, TreeNode}
import com.simplesys.SmartClient.System.Types.{Criteria, TreeGridOpenState}
import com.simplesys.System.Types2.FetchMode.FetchMode
import com.simplesys.System.Types2.PreserveOpenState.PreserveOpenState
import com.simplesys.System.Types2.TreeFilterMode.TreeFilterMode
import com.simplesys.System.Types2.void
import com.simplesys.Types1.{JSArray, JSAny}

import scala.scalajs.js


@js.native
trait ResultTree extends Tree {
    def applyFilter(tree: Tree, criteria: Criteria, filterMode: TreeFilterMode, dataSource: DataSource, requestProperties: DSRequest = js.native): Tree
    val autoPreserveOpenState: PreserveOpenState
    val canReturnOpenFolders: Boolean
    val canReturnOpenSubfoldersProperty: String
    val childCountProperty: String
    def compareCriteria(newCriteria: Criteria, oldCriteria: Criteria, requestProperties: DSRequest = js.native): Int
    var dataArrived: js.Function1[TreeNode, _]
    val dataSource: DataSource
    val defaultNewNodesToRoot: Boolean
    val disableCacheSync: Boolean
    val fetchMode: FetchMode
    def get(pos: Int): TreeNode
    def getOpenState(): TreeGridOpenState
    def getRange(start: Int, end: Int): JSArray[TreeNode]
    def invalidateCache(): void
    val keepParentsOnFilter: Boolean
    val loadDataOnDemand: Boolean
    val progressiveLoading: Boolean
    val resultSize: Int
    val rootNode: JSAny
    val serverFilterFields: JSArray[String]
    def setChildren(parent: TreeNode, newChildren: JSArray[TreeNode], totalChildren: Int = js.native): void
    def setCriteria(newCriteria: Criteria): void
    def setOpenState(openState: TreeGridOpenState): void
    val updateCacheFromRequest: Boolean
    def willFetchData(newCriteria: Criteria): Boolean
}



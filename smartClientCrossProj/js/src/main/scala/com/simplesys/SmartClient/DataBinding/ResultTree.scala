package com.simplesys.SmartClient.DataBinding

import com.simplesys.SmartClient.DataBinding.dataSource.DSCallback
import com.simplesys.SmartClient.Grids.treeGrid.TreeNode
import com.simplesys.SmartClient.System.Types.{TreeGridOpenState, Criteria}
import com.simplesys.SmartClient.System.{AbstractTreeCompanion, Tree}
import com.simplesys.System.Types.FetchMode.FetchMode
import com.simplesys.System.Types.PreserveOpenState.PreserveOpenState
import com.simplesys.System.Types.TreeFilterMode.TreeFilterMode
import com.simplesys.System.Types.TreeModelType.TreeModelType
import com.simplesys.System.Types.void

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

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
    def getRange(start: Int, end: Int): Array[TreeNode]
    def invalidateCache(): void
    val keepParentsOnFilter: Boolean
    val loadDataOnDemand: Boolean
    val progressiveLoading: Boolean
    val resultSize: Int
    val rootNode: js.Any
    val serverFilterFields: Array[String]
    def setChildren(parent: TreeNode, newChildren: Array[TreeNode], totalChildren: Int = js.native): void
    def setCriteria(newCriteria: Criteria): void
    def setOpenState(openState: TreeGridOpenState): void
    val updateCacheFromRequest: Boolean
    def willFetchData(newCriteria: Criteria): Boolean
}

@js.native
abstract trait AbstractResultTreeCompanion extends AbstractTreeCompanion {
}

package companion {

import scala.scalajs.js

@js.native
   object ResultTree extends AbstractResultTreeCompanion
}


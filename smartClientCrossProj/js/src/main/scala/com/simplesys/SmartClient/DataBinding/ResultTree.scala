package com.simplesys.SmartClient.DataBinding

import com.simplesys.SmartClient.System.Types.Criteria
import com.simplesys.SmartClient.System.{AbstractTreeCompanion, Tree}
import com.simplesys.isc.System.Types.PreserveOpenState.PreserveOpenState
import com.simplesys.isc.System.Types.TreeFilterMode.TreeFilterMode

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait ResultTree extends Tree {
    def applyFilter (tree: Tree, criteria: Criteria, filterMode: TreeFilterMode, dataSource: DataSource, requestProperties:DSRequest = js.native): Tree
    val autoPreserveOpenState : PreserveOpenState
}

@js.native
abstract trait AbstractResultTreeCompanion extends AbstractTreeCompanion {
}

@js.native
object ResultTree extends AbstractResultTreeCompanion        

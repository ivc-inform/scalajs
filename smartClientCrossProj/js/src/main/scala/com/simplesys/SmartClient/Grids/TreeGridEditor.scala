package com.simplesys.SmartClient.Grids

import com.simplesys.SmartClient.DataBinding.Callbacks.DSCallback
import com.simplesys.SmartClient.Grids.listGrid.ListGridRecord
import com.simplesys.SmartClient.Grids.treeGrid.{Tree, TreeGridField, TreeNode}
import com.simplesys.SmartClient.Layout.VLayoutSS
import com.simplesys.System.{JSArray, JSDictionaryAny}
import com.simplesys.System.Types._

import scala.scalajs.js

@js.native
trait TreeGridEditor extends VLayoutSS with GridEditor[TreeGridField, TreeNode, TreeGridSelectedState] {
    var folderIcon: SCImgURL
    var dataProperties: Tree
    var nodeIcon: SCImgURL
    var canReparentNodes: Boolean
    def startEditingNew(): void
    def startEditing(): void
    var showOpenIcons: Boolean
    var grid: TreeGrid
    def setSelectedRecordsAsFolders(): JSArray[TreeNode]
    def setRecordsAsFolders(records: ListGridRecord): JSArray[TreeNode]
}



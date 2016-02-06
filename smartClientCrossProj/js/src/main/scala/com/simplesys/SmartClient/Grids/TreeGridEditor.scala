package com.simplesys.SmartClient.Grids

import com.simplesys.SmartClient.Grids.listGrid.ListGridRecord
import com.simplesys.SmartClient.Grids.treeGrid.{TreeGridField, TreeNode}
import com.simplesys.SmartClient.Layout.VLayoutSS
import com.simplesys.System.Types._
import com.simplesys.Types1.JSArray

import scala.scalajs.js

@js.native
trait TreeGridEditor extends VLayoutSS with GridEditor[TreeGridField, ListGridRecord, ListGridSelectedState] {
    var folderIcon: SCImgURL
    var nodeIcon: SCImgURL
    var canReparentNodes: Boolean
    def startEditingNew(): void
    def startEditing(): void
    var showOpenIcons: Boolean
    var grid: TreeGrid
    def setSelectedRecordsAsFolders(): JSArray[TreeNode]
    def setRecordsAsFolders(records: ListGridRecord): JSArray[TreeNode]
}



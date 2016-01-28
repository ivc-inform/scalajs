package com.simplesys.SmartClient.Grids

import com.simplesys.SmartClient.Grids.listGrid.ListGridRecord
import com.simplesys.SmartClient.Grids.treeGrid.TreeGridField
import com.simplesys.SmartClient.Layout.VLayoutSS
import com.simplesys.SmartClient.System.Types
import com.simplesys.SmartClient.System.Types.ListGridSelectedState
import com.simplesys.System.Types._

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait TreeGridEditor extends VLayoutSS with GridEditor[TreeGridField, ListGridRecord, ListGridSelectedState] {
    var folderIcon: SCImgURL
    var nodeIcon: SCImgURL
    var canReparentNodes: Boolean
    def startEditingNew(): void
    def startEditing(): void
    var showOpenIcons: Boolean
}



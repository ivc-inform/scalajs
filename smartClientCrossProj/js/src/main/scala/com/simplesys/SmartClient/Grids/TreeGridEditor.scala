package com.simplesys.SmartClient.Grids

import com.simplesys.SmartClient.Grids.listGrid.ListGridRecord
import com.simplesys.SmartClient.Grids.treeGrid.TreeGridField
import com.simplesys.SmartClient.Layout.VLayoutSS
import com.simplesys.SmartClient.System.Types.ListGridSelectedState
import com.simplesys.System.Types.SCImgURL

import scala.scalajs.js

@js.native
trait TreeGridEditor extends VLayoutSS with GridEditor[TreeGridField, ListGridRecord, ListGridSelectedState] {
    var folderIcon: SCImgURL
    var nodeIcon: SCImgURL
    var canReparentNodes: Boolean
}



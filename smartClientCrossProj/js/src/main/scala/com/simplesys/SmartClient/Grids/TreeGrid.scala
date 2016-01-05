package com.simplesys.SmartClient.Grids


import com.simplesys.SmartClient.Foundation.{Canvas, AbstractCanvasCompanion}
import com.simplesys.SmartClient.Grids.treeGrid.{TreeNode, TreeGridField}
import com.simplesys.SmartClient.System.{Types, Tree}
import com.simplesys.SmartClient.System.Types._
import com.simplesys.isc.System.Types.Alignment.Alignment
import com.simplesys.isc.System.Types.AnimationAcceleration.AnimationAcceleration
import com.simplesys.isc.System.Types.DisplayNodeType.DisplayNodeType
import com.simplesys.isc.System.Types.PreserveOpenState.PreserveOpenState
import com.simplesys.isc.System.Types.RecordDropAppearance.RecordDropAppearance
import com.simplesys.isc.System.Types.{HTMLString, URL, SCImgURL}

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait TreeGrid extends ListGrid[TreeGridField] {
    var alwaysShowOpener: Boolean
    var autoPreserveOpenState: PreserveOpenState
    var canDropOnLeaves: Boolean
    def canEditCell(): Boolean
    var canReparentNodes: Boolean
    var cantDragIntoChildMessage: String
    val cantDragIntoSelfMessage: String
    val cascadeSelection: Boolean
    val closedIconSuffix: String
    def closeFolder(node: TreeNode): Unit
    val connectorImage: SCImgURL
    val createDefaultTreeField: Boolean
    var customIconDropProperty: String
    var customIconOpenProperty: String
    var customIconProperty: String
    var displayNodeType: DisplayNodeType
    val dropIconSuffix: String
    val extraIconGap: Int
    var fields: Array[TreeGridField]
    var fileImage: SCImgURL
    var folderClick: js.Function3[TreeGrid, TreeNode, Int, Unit]
    var folderClosed: js.Function1[TreeNode, Boolean]
    var folderContextClick: js.Function3[TreeGrid, TreeNode, Int, Boolean]
    def folderDrop(nodes: Array[TreeNode], folder: TreeNode, index: Int, sourceWidget: Canvas, callback: Callback): Unit
    var folderIcon: SCImgURL
    var folderOpened: js.Function1[TreeNode, Boolean]
    def getAnimateFolderMaxRows(): Int
    def getDropFolder(): TreeNode
    def getExtraIcon(node: TreeNode): URL
    def getIcon(node: TreeNode): URL
    def getNodeTitle(node: TreeNode, recordNum: Int, field: TreeGridField): HTMLString
    def getOpenIcon(node: TreeNode): URL
    def getOpenState(): TreeGridOpenState
    def getSelectedPaths(): ListGridSelectedState
    def getViewState(): TreeGridViewState
    var iconSize: Int
    var indentRecordComponents: Boolean
    var indentSize: Int
    val initialData: Array[TreeNode]
    def isOverExtraIcon(): Boolean
    def isOverOpenArea(): Boolean
    val keepParentsOnFilter: Boolean
    var leafClick: js.Function3[TreeGrid, TreeNode, Int, Unit]
    var leafContextClick: js.Function3[TreeGrid, TreeNode, Int, Boolean]
    val leaveSelectionCheckboxGap: Boolean
    var loadDataOnDemand: Boolean
    var loadingIcon: SCImgURL
    var manyItemsImage: SCImgURL
    var nodeClick: js.Function3[TreeGrid, TreeNode, Int, Unit]
    var nodeContextClick: js.Function3[TreeGrid, TreeNode, Int, Boolean]
    var nodeIcon: SCImgURL
    var offlineNodeMessage: String
    var openerIconHeight: Int
    var openerIconSize: Int
    var openerIconWidth: Int
    val openerImage: SCImgURL
    def openFolder(node: TreeNode): Unit
    val openIconSuffix: String
    def openLeaf(node: TreeNode): Unit
    val parentAlreadyContainsChildMessage: String
    def recordDrop(): Unit
    val separateFolders: Boolean
    val serverFilterFields: Array[String]
    def setData(newData: Tree): Unit
    def setNodeIcon(node: TreeNode, icon: SCImgURL): Unit
    def setOpenState(openState: TreeGridOpenState): Unit
    def setSelectedPaths(selectedPaths: ListGridSelectedState): Unit
    def setViewState(viewState: TreeGridViewState): Unit
    def houldAnimateFolder(folder: TreeNode): Unit
    var showConnectors: Boolean
    var showCustomIconDrop: Boolean
    var showCustomIconOpen: Boolean
    val showDisabledSelectionCheckbox: Boolean
    var showDropIcons: Boolean
    var showFullConnectors: Boolean
    var showLoadingIcons: Boolean
    var showOpener: Boolean
    var showOpenIcons: Boolean
    var showRoot: Boolean
    var sortFoldersBeforeLeaves: Boolean
    def toggleFolder(node: TreeNode): Unit
    def transferNodes(nodes: Array[TreeNode], folder: TreeNode, index: Int, sourceWidget: Canvas, callback: Callback = js.native): Unit
    val treeFieldTitle:String
    val treeRootValue:js.Any
}

@js.native
abstract trait AbstractTreeGridCompanion extends AbstractCanvasCompanion {
}

@js.native
object TreeGrid extends AbstractTreeGridCompanion        

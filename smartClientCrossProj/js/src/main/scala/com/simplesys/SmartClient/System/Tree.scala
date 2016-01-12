package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.DataBinding.{AdvancedCriteria, DSRequest, DataSource, ResultSet}
import com.simplesys.SmartClient.Grids.treeGrid.TreeNode
import com.simplesys.SmartClient.System.Types._
import com.simplesys.SmartClient.System._
import com.simplesys.System.Types.LoadState.LoadState
import com.simplesys.System.Types.TreeFilterMode.TreeFilterMode
import com.simplesys.System.Types.TreeModelType.TreeModelType
import com.simplesys.System.Types.void

import scala.scalajs.js
import scala.scalajs.js.{ThisFunction0, |}

@js.native
trait Tree extends Class {
    def add(node: TreeNode, parent: TreeNode, position: Int = js.native): TreeNode
    def addList(node: js.Array[TreeNode], parent: TreeNode, position: Int = js.native): js.Array[TreeNode]
    def allChildrenLoaded(node: TreeNode): Boolean
    var autoOpenRoot: Boolean
    var childrenProperty: String
    def closeAll(node: TreeNode = js.native): void
    def closeFolder(node: TreeNode): void
    def closeFolders(nodeList: js.Array[TreeNode]): void
    val data: js.Array[TreeNode]
    var dataChanged: ThisFunction0[void, void]
    val defaultIsFolder: Boolean
    var defaultNodeTitle: String
    val discardParentlessNodes: Boolean
    def find(fieldNameOrPath: String, value: js.Any = js.native): Types.Object
    def findById(id: String): Types.Object
    def getAllNodes(node: TreeNode = js.native): js.Array[TreeNode]
    def getChildren(node: TreeNode): js.Array[TreeNode]
    def getChildrenResultSet(node: TreeNode): ResultSet
    def getDescendantFolders(node: TreeNode = js.native): js.Array[TreeNode]
    def getDescendantLeaves(node: TreeNode = js.native): js.Array[TreeNode]
    def getDescendants(node: TreeNode = js.native): js.Array[TreeNode]
    def getFilteredTree(criteria: Criteria | AdvancedCriteria, filterMode: TreeFilterMode = js.native, dataSource: DataSource = js.native, requestProperties: DSRequest = js.native): Tree
    def getFolders(node: TreeNode): js.Array[TreeNode]
    def getLeaves(node: TreeNode): js.Array[TreeNode]
    def getLength(): Int
    def getLevel(node: TreeNode): Int
    def getLoadState(node: TreeNode): LoadState
    def getName(node: TreeNode): String
    def getOpenList(node: TreeNode = js.native): js.Array[TreeNode]
    def getParent(node: TreeNode): TreeNode
    def getParentPath(node: TreeNode): String
    def getParents(node: TreeNode): js.Array[TreeNode]
    def getPath(node: TreeNode): String
    def getRoot(): TreeNode
    def getTitle(node: TreeNode): String
    def hasChildren(node: TreeNode): Boolean
    def hasFolders(node: TreeNode): Boolean
    def hasLeaves(node: TreeNode): Boolean
    val idField: String
    def indexOf(obj: Types.Object, pos: Int = js.native, endPos: Int = js.native): Int
    def isDescendantOf(child: TreeNode, parent: TreeNode): Boolean
    def isFolder(node: TreeNode): Boolean
    var isFolderProperty: String
    def isLeaf(node: TreeNode): Boolean
    def isLoaded(node: TreeNode): Boolean
    def isOpen(node: TreeNode): Boolean
    def isRoot(node: TreeNode): Boolean
    def lastIndexOf(obj: Types.Object, pos: Int = js.native, endPos: Int = js.native): Int
    def linkNodes(nodes: js.Array[TreeNode]): void
    def loadChildren(node: TreeNode, callback: Callback = js.native): void
    var modelType: TreeModelType
    def move(node: TreeNode, newParent: TreeNode, position: Int = js.native): void
    var nameProperty: String
    def openAll(node: TreeNode): void
    def openFolders(nodeList: js.Array[TreeNode]): void
    var openProperty: String
    val parentIdField: String
    var pathDelim: String
    def reloadChildren(node: TreeNode): void
    def remove(node: TreeNode): Boolean
    def removeChildren(node: TreeNode): void
    def removeList(nodeList: js.Array[TreeNode]): Boolean
    val reportCollisions: Boolean
    var root: TreeNode
    val rootValue: String | Int
    var separateFolders: Boolean
    def setChildren(parent: TreeNode, newChildren: js.Array[TreeNode]): void
    def setRoot(newRoot: TreeNode, autoOpen: Boolean): void
    def setSeparateFolders(separateFolders: Boolean): void
    def setShowRoot(showRoot: Boolean): void
    def setSortFoldersBeforeLeaves(sortFoldersBeforeLeaves: Boolean): void
    var showRoot: Boolean
    var sortFoldersBeforeLeaves: Boolean
    var titleProperty: String
}

@js.native
abstract trait AbstractTreeCompanion extends AbstractClassCompanion {
}

@js.native
object Tree extends AbstractTreeCompanion        

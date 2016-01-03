package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.DataBinding.{DSRequest, DataSource, ResultSet}
import com.simplesys.SmartClient.System.Types.AdvancedCriteria.AdvancedCriteria
import com.simplesys.SmartClient.System.Types.{Callback, Criteria}
import com.simplesys.SmartClient.System.tree.TreeNode.TreeNode
import com.simplesys.SmartClient.System.{Types, AbstractClassCompanion, Class}
import com.simplesys.isc.System.Types.LoadState.LoadState
import com.simplesys.isc.System.Types.TreeFilterMode.TreeFilterMode
import com.simplesys.isc.System.Types.TreeModelType.TreeModelType

import scala.scalajs.js
import scala.scalajs.js.{ThisFunction0, |}

@js.native
trait Tree extends Class {
    def add(node: TreeNode, parent: TreeNode, position: Int = js.native): TreeNode
    def addList(node: js.Array[TreeNode], parent: TreeNode, position: Int = js.native): js.Array[TreeNode]
    def allChildrenLoaded(node: TreeNode): Boolean
    var autoOpenRoot: Boolean
    var childrenProperty: String
    def closeAll(node: TreeNode = js.native): Unit
    def closeFolder(node: TreeNode): Unit
    def closeFolders(nodeList: js.Array[TreeNode]): Unit
    val data: js.Array[TreeNode]
    var dataChanged: ThisFunction0[Unit, Unit]
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
    def linkNodes(nodes: js.Array[TreeNode]): Unit
    def loadChildren(node: TreeNode, callback: Callback = js.native): Unit
    var modelType: TreeModelType
    def move(node: TreeNode, newParent: TreeNode, position: Int = js.native): Unit
    var nameProperty: String
    def openAll(node: TreeNode): Unit
    def openFolders(nodeList: js.Array[TreeNode]): Unit
    var openProperty: String
    val parentIdField: String
    var pathDelim: String
    def reloadChildren(node: TreeNode): Unit
    def remove(node: TreeNode): Boolean
    def removeChildren(node: TreeNode): Unit
    def removeList(nodeList: js.Array[TreeNode]): Boolean
    val reportCollisions: Boolean
    var root: TreeNode
    val rootValue: String | Int
    var separateFolders: Boolean
    def setChildren(parent: TreeNode, newChildren: js.Array[TreeNode]): Unit
    def setRoot(newRoot: TreeNode, autoOpen: Boolean): Unit
    def setSeparateFolders(separateFolders: Boolean): Unit
    def setShowRoot(showRoot: Boolean): Unit
    def setSortFoldersBeforeLeaves(sortFoldersBeforeLeaves: Boolean): Unit
    var showRoot: Boolean
    var sortFoldersBeforeLeaves: Boolean
    var titleProperty: String
}

@js.native
abstract trait AbstractTreeCompanion extends AbstractClassCompanion {
}

@js.native
object Tree extends AbstractTreeCompanion        

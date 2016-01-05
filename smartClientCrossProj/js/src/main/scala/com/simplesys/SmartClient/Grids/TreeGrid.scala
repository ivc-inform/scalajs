package com.simplesys.SmartClient.Grids

import com.simplesys.SmartClient.Foundation.AbstractCanvasCompanion
import com.simplesys.SmartClient.Grids.treeGrid.TreeGridField
import com.simplesys.SmartClient.System.Tree
import com.simplesys.SmartClient.System.tree.TreeNode
import com.simplesys.isc.System.Types.AnimationAcceleration.AnimationAcceleration
import com.simplesys.isc.System.Types.DisplayNodeType.DisplayNodeType
import com.simplesys.isc.System.Types.PreserveOpenState.PreserveOpenState
import com.simplesys.isc.System.Types.SCImgURL

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait TreeGrid extends ListGrid[TreeGridField] {
    var alwaysShowOpener:Boolean
    var autoPreserveOpenState : PreserveOpenState
    var canDropOnLeaves:Boolean
    def canEditCell ():Boolean
    var  canReparentNodes:Boolean
    var cantDragIntoChildMessage:String
    val cantDragIntoSelfMessage:String
    val cascadeSelection:Boolean
    val closedIconSuffix:String
    def closeFolder (node:TreeNode):Unit
    val connectorImage:SCImgURL
    val createDefaultTreeField:Boolean
    var customIconDropProperty:String
    var customIconOpenProperty:String
    var customIconProperty:String
    var displayNodeType:DisplayNodeType
    val dropIconSuffix:String
    val extraIconGap:Int
    var fields: Array[TreeGridField]
}

@js.native
abstract trait AbstractTreeGridCompanion extends AbstractCanvasCompanion {
}

@js.native
object TreeGrid extends AbstractTreeGridCompanion        

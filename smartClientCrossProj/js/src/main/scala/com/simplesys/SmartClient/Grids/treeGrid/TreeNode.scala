package com.simplesys.SmartClient.Grids.treeGrid

import com.simplesys.System.Types.{HTMLString, SCImgURL}
import com.simplesys.Types1.JSArray

import scala.scalajs.js

@js.native
trait TreeNode extends js.Object {

    var canAcceptDrop: Boolean
    var canDrag: Boolean
    var children: JSArray[TreeNode]
    var enabled: Boolean
    var icon: SCImgURL
    var id: String
    var isFolder: Boolean
    var name: String
    var parentId: String
    var showDropIcon: Boolean
    var showOpenIcon: Boolean
    var title: HTMLString
}

package com.simplesys.SmartClient.System.Tree

import com.simplesys.SmartClient.System.Types
import com.simplesys.isc.System.Types.{HTMLString, SCImgURL}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
object TreeNode extends Types.Object {
    type TreeNode = TreeNode.type

    var canAcceptDrop: Boolean = js.native
    var canDrag: Boolean = js.native
    var children: js.Array[TreeNode] = js.native
    var enabled: Boolean = js.native
    var icon: SCImgURL = js.native
    var id: String | Int = js.native
    var isFolder: Boolean = js.native
    var name: String = js.native
    var parentId: String | Int = js.native
    var showDropIcon: Boolean = js.native
    var showOpenIcon: Boolean = js.native
    var title: HTMLString = js.native
}

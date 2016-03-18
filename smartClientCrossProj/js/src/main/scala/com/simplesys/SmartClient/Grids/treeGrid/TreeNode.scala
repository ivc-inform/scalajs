package com.simplesys.SmartClient.Grids.treeGrid

import com.simplesys.System.Types.{HTMLString, SCImgURL}
import com.simplesys.System.{JSObject, JSArray}

import scala.scalajs.js

@js.native
trait TreeNode extends JSObject {

    var canAcceptDrop: Boolean
    var canDrag: Boolean
    var children: Option[JSArray[TreeNode]]
    var enabled: Boolean
    var icon: SCImgURL
    var id: String
    var isFolder: Option[Boolean]
    var name: String
    var parentId: String
    var showDropIcon: Boolean
    var showOpenIcon: Boolean
    var title: HTMLString
}

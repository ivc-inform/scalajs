package com.simplesys.SmartClient.Grids.treeGrid

import com.simplesys.System.Types.{HTMLString, SCImgURL}
import com.simplesys.System.{JSArray, JSDynamic, JSObject}

import scala.language.dynamics
import scala.scalajs.js
import scala.scalajs.js.UndefOr

@js.native
trait TreeNode extends JSObject{

    var canAcceptDrop: js.UndefOr[Boolean]
    var canDrag: UndefOr[Boolean]
    var children: UndefOr[JSArray[TreeNode]]
    var enabled: UndefOr[Boolean]
    var icon: UndefOr[SCImgURL]
    var id: js.UndefOr[String]
    var isFolder: js.UndefOr[Boolean]
    var name: UndefOr[String]
    var parentId: js.UndefOr[String]
    var showDropIcon: UndefOr[Boolean]
    var showOpenIcon: UndefOr[Boolean]
    var title: UndefOr[HTMLString]
}

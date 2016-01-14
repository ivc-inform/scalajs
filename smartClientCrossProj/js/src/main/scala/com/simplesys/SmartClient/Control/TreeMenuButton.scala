package com.simplesys.SmartClient.Control

import com.simplesys.SmartClient.System.Tree
import com.simplesys.System.Types.{SCClassName, AutoChild, CSSStyleName, HTMLString}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait TreeMenuButton extends MenuButton {
    var dataProperties: Tree
    var emptyMenuMessage: HTMLString
    var pathSeparatorString: HTMLString
    var selectedBaseStyle: CSSStyleName
    var showPath: Boolean
    var treeMenu: Menu with AutoChild
    val treeMenuConstructor: SCClassName
    var unselectedTitle: HTMLString
}

@js.native
abstract trait AbstractTreeMenuButtonCompanion extends AbstractMenuButtonCompanion {
}

@js.native
   object TreeMenuButton extends AbstractTreeMenuButtonCompanion


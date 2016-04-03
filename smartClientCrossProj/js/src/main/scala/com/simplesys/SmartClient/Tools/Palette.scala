package com.simplesys.SmartClient.Tools

import com.simplesys.SmartClient.System.Class
import com.simplesys.SmartClient.Tools.editContext.{EditPane, EditTree}
import com.simplesys.System.Types.void

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait Palette extends Class {
    var defaultEditContext: EditContext | EditTree | EditPane
    val generateNames: Boolean
    def makeEditNode (paletteNode: PaletteNode): EditNode
    def  setDefaultEditContext (defaultEditContext: EditContext | EditTree | EditPane):void
}



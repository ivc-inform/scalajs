package com.simplesys.SmartClient.App

import com.simplesys.SmartClient.Control.menu.MenuSSItem
import com.simplesys.SmartClient.Grids.TreeGridEditor
import com.simplesys.System.JSUndefined
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait CommonTreeGridEditorComponent extends TreeGridEditor {
    var customMenu: JSUndefined[Seq[MenuSSItem]]
}

//@js.native
//abstract trait AbstractCommonTreeGridEditorComponentCompanion extends AbstractTreeGridEditorCompanion {
//}



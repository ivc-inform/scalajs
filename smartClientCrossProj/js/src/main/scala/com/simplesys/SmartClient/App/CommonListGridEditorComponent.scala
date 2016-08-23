package com.simplesys.SmartClient.App

import com.simplesys.SmartClient.Control.menu.MenuSSItem
import com.simplesys.SmartClient.Grids.ListGridEditor
import com.simplesys.System.JSUndefined
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js

@js.native
trait CommonListGridEditorComponent extends ListGridEditor {
    var customMenu: JSUndefined[Seq[MenuSSItem]]

}

//@js.native
//abstract trait AbstractCommonListGridEditorComponentCompanion extends AbstractListGridEditorCompanion {
//}



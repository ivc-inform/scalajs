package com.simplesys.SmartClient.App.formItems

import com.simplesys.SmartClient.Forms.formsItems.{CanvasItem, TextItem}
import com.simplesys.SmartClient.Grids.{ListGrid, ListGridEditor}
import com.simplesys.System.Types._
import com.simplesys.System._

import scala.scalajs.js

@js.native
trait LookupListGridEditorItem extends CanvasItem{
    val buttonIcon: JSUndefined[SCImgURL]
    var textItem: TextItem

}

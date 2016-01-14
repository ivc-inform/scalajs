package com.simplesys.SmartClient.Grids.listGrid

import com.simplesys.SmartClient.Control.Button
import com.simplesys.SmartClient.Grids.ListGrid
import com.simplesys.System.Types.{void, _}

import scala.scalajs.js

@js.native
trait RecordEditor extends ListGrid[ListGridField, ListGridRecord] {
    val actionButton: Button with AutoChild
    val actionButtonProperties: js.Dictionary[js.Any]
    val actionButtonStyle: CSSStyleName
    val filterImg: SCImgURL
    var performAction: js.ThisFunction0[void, void]
    val skinImgDir: URL
}




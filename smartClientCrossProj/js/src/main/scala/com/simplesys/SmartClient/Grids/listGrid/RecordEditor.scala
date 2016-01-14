package com.simplesys.SmartClient.Grids.listGrid

import com.simplesys.SmartClient.Control.Button
import com.simplesys.SmartClient.Grids.{AbstractListGridCompanion, ListGrid}
import com.simplesys.System.Types._
import com.simplesys.System.Types.void

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait RecordEditor extends ListGrid[ListGridField, ListGridRecord] {
    val actionButton: Button with AutoChild
    val actionButtonProperties: js.Dictionary[js.Any]
    val actionButtonStyle: CSSStyleName
    val filterImg: SCImgURL
    var performAction: js.ThisFunction0[void, void]
    val skinImgDir: URL
}

@js.native
abstract trait AbstractRecordEditorCompanion extends AbstractListGridCompanion {
}

@js.native
object RecordEditor extends AbstractRecordEditorCompanion


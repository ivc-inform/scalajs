package com.simplesys.SmartClient.Grids.listGrid

import com.simplesys.SmartClient.Grids.{AbstractListGridCompanion, ListGrid}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait RecordEditor extends ListGrid[ListGridField] {
}

@js.native
abstract trait AbstractRecordEditorCompanion extends AbstractListGridCompanion {
}

@js.native
object RecordEditor extends AbstractRecordEditorCompanion        

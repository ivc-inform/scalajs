package com.simplesys.SmartClient.Forms

import com.simplesys.SmartClient.Grids.listGrid.ListGridField
import com.simplesys.SmartClient.Grids.{AbstractListGridCompanion, ListGrid}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait DateGrid extends ListGrid[ListGridField] {
}

@js.native
abstract trait AbstractDateGridCompanion extends AbstractListGridCompanion {
}

@js.native
object DateGrid extends AbstractDateGridCompanion        
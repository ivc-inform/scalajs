package com.simplesys.SmartClient.Forms

import com.simplesys.SmartClient.Grids.listGrid.{ListGridRecord, ListGridField}
import com.simplesys.SmartClient.Grids.{AbstractListGridCompanion, ListGrid}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait DateGrid extends ListGrid[ListGridField, ListGridRecord] {
}

@js.native
abstract trait AbstractDateGridCompanion extends AbstractListGridCompanion {
}

package companion {

import scala.scalajs.js

@js.native
   object DateGrid extends AbstractDateGridCompanion
}


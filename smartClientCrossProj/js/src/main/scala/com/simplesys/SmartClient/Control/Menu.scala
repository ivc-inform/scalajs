package com.simplesys.SmartClient.Control

import com.simplesys.SmartClient.Control.menu.MenuItem
import com.simplesys.SmartClient.Foundation.Img
import com.simplesys.SmartClient.Grids.listGrid.{ListGridRecord, ListGridField}
import com.simplesys.SmartClient.Grids.{AbstractListGridCompanion, ListGrid}
import com.simplesys.isc.System.Types.HTMLString

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait Menu extends ListGrid[ListGridField, MenuItem] {
    var autoDismiss:Boolean
    var autoDismissOnBlur:Boolean
    var cancelButtonTitle:HTMLString
    var canSelectParentItems:Boolean
    var cascadeAutoDismiss:Boolean
    var checkmarkDisabledImage:Img
    var checkmarkImage:Img
    var data: js.Array[MenuItem]
}

@js.native
abstract trait AbstractMenuCompanion extends AbstractListGridCompanion {
}

@js.native
object Menu extends AbstractMenuCompanion        

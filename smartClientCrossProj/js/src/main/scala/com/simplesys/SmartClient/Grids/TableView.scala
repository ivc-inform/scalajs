package com.simplesys.SmartClient.Grids

import com.simplesys.SmartClient.Grids.listGrid.{ListGridRecord, ListGridField}
import com.simplesys.isc.System.Types.NavigationMode.NavigationMode
import com.simplesys.isc.System.Types.RecordLayout.RecordLayout
import com.simplesys.isc.System.Types.TableMode.TableMode
import com.simplesys.isc.System.Types.{CSSStyleName, SCImgURL, HTMLString}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait TableView extends ListGrid[ListGridField, ListGridRecord] {
    var formatRecord: js.Function1[ListGridRecord, HTMLString]
    var imageClick: js.Function1[ListGridRecord, HTMLString]
    var navIcon: SCImgURL
    var navigationMode: NavigationMode
    var recordDataStyle: CSSStyleName
    var recordDescriptionStyle: CSSStyleName
    var recordInfoStyle: CSSStyleName
    var recordLayout: RecordLayout
    var recordNavigationClick: js.Function1[ListGridRecord, HTMLString]
    var recordNavigationProperty: String
    var recordTitleStyle: CSSStyleName
    var showIconField: Boolean
    var showNavigation: Boolean
    var tableMode: TableMode
    var wholeRecordNavIcon: SCImgURL
}

@js.native
abstract trait AbstractTableViewCompanion extends AbstractListGridCompanion {
}

@js.native
object TableView extends AbstractTableViewCompanion        

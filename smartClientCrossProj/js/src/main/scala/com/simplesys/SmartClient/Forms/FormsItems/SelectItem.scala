package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.SmartClient.DataBinding.DSRequest
import com.simplesys.SmartClient.DataBinding.dataSource.DSCallback
import com.simplesys.SmartClient.Grids.listGrid.ListGridRecord
import com.simplesys.isc.System.Types.SCClassName

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait SelectItem extends FormItem with PickList {
    var addUnknownValues: Boolean
    var allowEmptyValue: Boolean
    var autoFetchData: Boolean
    var defaultToFirstOption: Boolean
    var editProxyConstructor: SCClassName
    var escapeHTML: Boolean
    def getSelectedRecords(): Array[ListGridRecord]
    var hiliteColor: String
}

@js.native
abstract trait AbstractSelectItemCompanion extends AbstractFormItemCompanion {
}

@js.native
object SelectItem extends AbstractSelectItemCompanion        

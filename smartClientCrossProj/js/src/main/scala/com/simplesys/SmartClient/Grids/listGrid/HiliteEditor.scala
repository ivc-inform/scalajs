package com.simplesys.SmartClient.Grids.listGrid

import com.simplesys.SmartClient.Foundation.StatefulCanvas
import com.simplesys.SmartClient.Grids.Grid
import com.simplesys.SmartClient.Layout.VLayout
import com.simplesys.SmartClient.System.Types.Callback
import com.simplesys.System.Types.{AutoChild, SCImgURL, void}
import com.simplesys.Types1.JSArray

import scala.scalajs.js

@js.native
trait HiliteEditor extends VLayout {
    val addAdvancedRuleButton: StatefulCanvas with AutoChild
    val addAdvancedRuleButtonTitle: String
    val availableFieldsColumnTitle: String
    val callback: Callback
    val cancelButton: StatefulCanvas with AutoChild
    val cancelButtonTitle: String
    def clearHilites(): void
    val fieldList: Grid[ListGridField, ListGridRecord]
    val hiliteIcons: JSArray[SCImgURL]
    val hiliteRule: HiliteRule with AutoChild
    def removeRule(hiliteRule: HiliteRule): void
    val saveButton: StatefulCanvas with AutoChild
    val saveButtonTitle: String
    def saveHilites(callback: Callback): void
    def setHilites(hilites: JSArray[Hilite]): void
}



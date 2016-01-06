package com.simplesys.SmartClient.Grids.listGrid

import com.simplesys.SmartClient.Foundation.StatefulCanvas
import com.simplesys.SmartClient.Grids.ListGrid
import com.simplesys.SmartClient.Grids.listGrid.Hilite.Hilite
import com.simplesys.SmartClient.Layout.{AbstractVLayoutCompanion, VLayout}
import com.simplesys.SmartClient.System.Types.Callback
import com.simplesys.isc.System.Types.{SCImgURL, AutoChild}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait HiliteEditor extends VLayout {
    val addAdvancedRuleButton: StatefulCanvas with AutoChild
    val addAdvancedRuleButtonTitle: String
    val availableFieldsColumnTitle: String
    val callback: Callback
    val cancelButton: StatefulCanvas with AutoChild
    val cancelButtonTitle: String
    def clearHilites(): Unit
    val fieldList: ListGrid[ListGridField]
    val hiliteIcons: js.Array[SCImgURL]
    val hiliteRule: HiliteRule with AutoChild
    def removeRule(hiliteRule: HiliteRule): Unit
    val saveButton: StatefulCanvas with AutoChild
    val saveButtonTitle: String
    def saveHilites(callback: Callback): Unit
    def setHilites(hilites: js.Array[Hilite]): Unit

}

@js.native
abstract trait AbstractHiliteEditorCompanion extends AbstractVLayoutCompanion {
}

@js.native
object HiliteEditor extends AbstractHiliteEditorCompanion        

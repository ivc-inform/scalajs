package com.simplesys.SmartClient.Grids.listGrid

import com.simplesys.SmartClient.DataBinding.AdvancedCriteria
import com.simplesys.SmartClient.System.Types
import com.simplesys.SmartClient.System.Types.Criteria
import com.simplesys.isc.System.Types.{SCImgURL, HTMLString}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
object Hilite extends Types.Object {
    type Hilite = Hilite.type
    var backgroundColor: String = js.native
    val canEdit: Boolean = js.native
    val criteria: Criteria | AdvancedCriteria = js.native
    val cssText: String = js.native
    var disabled: Boolean = js.native
    var fieldName: String = js.native
    var htmlAfter: HTMLString = js.native
    var htmlBefore: HTMLString = js.native
    val icon: SCImgURL = js.native
    val id: String = js.native
    val replacementValue: HTMLString = js.native
    var textColor: String = js.native
    var title:String = js.native
}

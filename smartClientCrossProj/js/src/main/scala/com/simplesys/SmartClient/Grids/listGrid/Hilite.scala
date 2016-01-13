package com.simplesys.SmartClient.Grids.listGrid

import com.simplesys.SmartClient.DataBinding.AdvancedCriteria
import com.simplesys.SmartClient.System.Types
import com.simplesys.SmartClient.System.Types.Criteria
import com.simplesys.System.Types.{SCImgURL, HTMLString}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait Hilite extends Types.Object {
    var backgroundColor: String
    val canEdit: Boolean
    val criteria: Criteria | AdvancedCriteria
    val cssText: String
    var disabled: Boolean
    var fieldName: String
    var htmlAfter: HTMLString
    var htmlBefore: HTMLString
    val icon: SCImgURL
    val id: String
    val replacementValue: HTMLString
    var textColor: String
    var title:String
}

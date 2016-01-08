package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.SmartClient.System.{Types, Criterion}
import com.simplesys.SmartClient.System.Types.AdvancedCriteria.AdvancedCriteria
import com.simplesys.SmartClient.System.Types.Callback

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait PresetCriteriaItem extends SelectItem {
    val customOptionTitle: String
    def getCriterion(): Criterion | AdvancedCriteria
    def getCustomCriteria(callback: Callback): Unit
    val options: Types.Object
    val showCustomOption: Boolean
}

@js.native
abstract trait AbstractPresetCriteriaItemCompanion extends AbstractSelectItemCompanion {
}

@js.native
object PresetCriteriaItem extends AbstractPresetCriteriaItemCompanion        

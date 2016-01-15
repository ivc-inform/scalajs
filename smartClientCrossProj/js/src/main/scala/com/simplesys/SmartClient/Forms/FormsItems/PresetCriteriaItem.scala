package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.SmartClient.DataBinding.{AdvancedCriteria, Criterion}
import com.simplesys.SmartClient.System.Types
import com.simplesys.SmartClient.System.Types.Callback
import com.simplesys.System.Types.void

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait PresetCriteriaItem extends SelectItem {
    val customOptionTitle: String
    def getCriterion(): Criterion | AdvancedCriteria
    def getCustomCriteria(callback: Callback): void
    val options: Types.Object
    val showCustomOption: Boolean
}



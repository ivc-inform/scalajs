package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.SmartClient.DataBinding.{AdvancedCriteria, Criterion}
import com.simplesys.System.Types.{Callback, void}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait PresetCriteriaItem extends SelectItem {
    val customOptionTitle: String
    def getCriterion(): Criterion | AdvancedCriteria
    def getCustomCriteria(callback: Callback): void
    val options: js.Object
    val showCustomOption: Boolean
}



package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.SmartClient.System.Types
import com.simplesys.System.Types.HTMLString

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait SelectOtherItem extends SelectItem {
    var dialogWidth: Int
    var otherTitle: String
    var otherValue: String
    var selectOtherPrompt: HTMLString
    var separatorTitle: String
    var separatorValue: String
}

@js.native
abstract trait AbstractSelectOtherItemCompanion extends AbstractFormItemCompanion {
}

@js.native
object SelectOtherItem extends AbstractSelectItemCompanion




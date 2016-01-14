package com.simplesys.SmartClient.Forms.FormsItems

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait AutoFitTextAreaItem extends TextAreaItem {
    var maxHeight: Int
}

@js.native
abstract trait AbstractAutoFitTextAreaItemCompanion extends AbstractTextAreaItemCompanion {
}

@js.native
@JSName("AutoFitTextAreaItem")
object AutoFitTextAreaItemStatic extends AbstractAutoFitTextAreaItemCompanion



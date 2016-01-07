package com.simplesys.SmartClient.Forms.FormsItems

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait AutoFitTextAreaItem extends TextAreaItem {
    var maxHeight:Int
}

@js.native
abstract trait AbstractAutoFitTextAreaItemCompanion extends AbstractTextAreaItemCompanion {
}

@js.native
object AutoFitTextAreaItem extends AbstractAutoFitTextAreaItemCompanion        

package com.simplesys.SmartClient.Forms.FormsItems

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait HiddenItem extends FormItem {
    var fetchMissingValues:Boolean
}

@js.native
abstract trait AbstractHiddenItemCompanion extends AbstractFormItemCompanion {
}

@js.native
object HiddenItem extends AbstractHiddenItemCompanion


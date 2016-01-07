package com.simplesys.SmartClient.Forms.FormsItems

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait NativeCheckboxItem extends FormItem {
    var showLabel:Boolean
}

@js.native
abstract trait AbstractNativeCheckboxItemCompanion extends AbstractFormItemCompanion {
}

@js.native
object NativeCheckboxItem extends AbstractNativeCheckboxItemCompanion        

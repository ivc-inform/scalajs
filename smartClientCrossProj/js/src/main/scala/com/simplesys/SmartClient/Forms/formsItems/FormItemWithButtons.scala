package com.simplesys.SmartClient.Forms.formsItems

import com.simplesys.SmartClient.Control.Button
import com.simplesys.SmartClient.Forms.{DynamicForm, DynamicFormSS}
import com.simplesys.SmartClient.System.IscArray
import com.simplesys.System.JSUndefined

import scala.scalajs.js

@js.native
trait FormItemWithButtons extends CanvasItem {
    var buttons: JSUndefined[IscArray[Button]]
    var testInnerForm: JSUndefined[DynamicFormSS]
    var buttonsVertical: Boolean
}

@js.native
abstract class AbstractFormItemWithButtonsCompanion extends AbstractCanvasItemCompanion


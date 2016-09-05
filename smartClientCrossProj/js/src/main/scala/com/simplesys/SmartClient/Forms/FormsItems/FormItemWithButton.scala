package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.SmartClient.Control.IButtonSS
import com.simplesys.System.JSUndefined
import com.simplesys.System.Types.SCImgURL
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js
import scala.scalajs.js.ThisFunction0

@js.native
trait FormItemWithButton extends ComboboxItemWithButtons {
    var button: JSUndefined[IButtonSS]
    var iconButton: JSUndefined[SCImgURL]
    var clickButton: JSUndefined[ThisFunction0[FormItemWithButton, Boolean]]
    var editingItem: FormItem
}

@js.native
abstract class AbstractFormItemWithButtonCompanion extends AbstractComboboxItemWithButtonsCompanion


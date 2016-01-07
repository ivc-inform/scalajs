package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.SmartClient.Forms.FormsItems.radioGroupItem.RadioItem
import com.simplesys.isc.System.Types.{FormItemBaseStyle, SCClassName}

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait RadioGroupItem extends FormItem {
    val disabledValues: Array[String]
    val editProxyConstructor:SCClassName
    var fillHorizontalSpace:Boolean
    val itemProperties:RadioItem
    def  setTextBoxStyle (newTextBoxStyle:FormItemBaseStyle):Unit
    def setValueDisabled (value:js.Any, disabled:Boolean):Unit
    var vertical:Boolean
    var wrap:Boolean
}

@js.native
abstract trait AbstractRadioGroupItemCompanion extends AbstractFormItemCompanion {
}

@js.native
object RadioGroupItem extends AbstractRadioGroupItemCompanion        

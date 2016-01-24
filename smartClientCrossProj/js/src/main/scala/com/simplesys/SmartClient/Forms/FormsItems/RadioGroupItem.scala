package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.SmartClient.Forms.FormsItems.radioGroupItem.RadioItem
import com.simplesys.System.Types.{void, FormItemBaseStyle, SCClassName}
import com.simplesys.types.JSAny

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait RadioGroupItem extends FormItem {
    val disabledValues: Array[String]
    val editProxyConstructor:SCClassName
    var fillHorizontalSpace:Boolean
    val itemProperties:RadioItem
    def  setTextBoxStyle (newTextBoxStyle:FormItemBaseStyle):void
    def setValueDisabled (value:JSAny, disabled:Boolean):void
    var vertical:Boolean
    var wrap:Boolean
}



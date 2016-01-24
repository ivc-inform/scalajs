package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.SmartClient.Forms.FormsItems.formItem.FormItemIcon
import com.simplesys.System.Types.{FormItemBaseStyle, AutoChild}
import com.simplesys.types.JSAny

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait SpinnerItem extends TextItem {
    val decreaseIcon: FormItemIcon with AutoChild
    val decreaseIconProperties: js.Dictionary[JSAny]
    var getNextValue: js.Function2[Int, Int, Int]
    var getPreviousValue: js.Function2[Int, Int, Int]
    val increaseIcon: FormItemIcon with AutoChild
    val increaseIconProperties: js.Dictionary[JSAny]
    var max: Double
    var min: Double
    var step: Double
    val unstackedDecreaseIcon: FormItemIcon with AutoChild
    val unstackedIncreaseIcon: FormItemIcon with AutoChild
    val unstackedPrintTextBoxStyle: FormItemBaseStyle
    val unstackedReadOnlyTextBoxStyle: FormItemBaseStyle
    val unstackedTextBoxStyle: FormItemBaseStyle
    val writeStackedIcons: Boolean
}



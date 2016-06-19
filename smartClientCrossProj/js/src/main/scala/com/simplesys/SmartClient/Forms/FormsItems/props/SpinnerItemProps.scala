package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.SmartClient.Forms.FormsItems.formItem.FormItemIcon
import com.simplesys.SmartClient.System.Types.FormItemComponentType
import com.simplesys.System.Types.FormItemBaseStyle
import com.simplesys.System.{JSAny, JSDictionaryAny}
import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.option.ScOption._

import scala.scalajs.js

class SpinnerItemProps extends TextItemProps {
    var decreaseIcon: ScOption[FormItemIcon ] = ScNone
    var decreaseIconProperties: ScOption[JSDictionaryAny] = ScNone
    var getNextValue: ScOption[js.Function2[Int, Int, Int]] = ScNone
    var getPreviousValue: ScOption[js.Function2[Int, Int, Int]] = ScNone
    var increaseIcon: ScOption[FormItemIcon ] = ScNone
    var increaseIconProperties: ScOption[JSDictionaryAny] = ScNone
    var max: ScOption[JSAny] = ScNone
    var min: ScOption[JSAny] = ScNone
    var step: ScOption[JSAny] = ScNone
    var unstackedDecreaseIcon: ScOption[FormItemIcon ] = ScNone
    var unstackedIncreaseIcon: ScOption[FormItemIcon ] = ScNone
    var unstackedPrintTextBoxStyle: ScOption[FormItemBaseStyle] = ScNone
    var unstackedReadOnlyTextBoxStyle: ScOption[FormItemBaseStyle] = ScNone
    var unstackedTextBoxStyle: ScOption[FormItemBaseStyle] = ScNone
    var writeStackedIcons: ScOption[Boolean] = ScNone
    `type` = FormItemComponentType.SpinnerItem .opt
}

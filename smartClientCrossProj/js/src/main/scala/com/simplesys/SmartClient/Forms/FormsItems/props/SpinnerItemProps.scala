package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.SmartClient.Forms.FormsItems.formItem.FormItemIcon
import com.simplesys.System.Types.FormItemBaseStyle
import com.simplesys.option.{ScOption, ScNone}

import scala.scalajs.js
import scala.scalajs.js._

class SpinnerItemProps extends TextItemProps {
    var decreaseIcon: ScOption[FormItemIcon ] = ScNone
    var decreaseIconProperties: ScOption[js.Dictionary[js.Any]] = ScNone
    var getNextValue: ScOption[js.Function2[Int, Int, Int]] = ScNone
    var getPreviousValue: ScOption[js.Function2[Int, Int, Int]] = ScNone
    var increaseIcon: ScOption[FormItemIcon ] = ScNone
    var increaseIconProperties: ScOption[js.Dictionary[js.Any]] = ScNone
    var max: ScOption[Double] = ScNone
    var min: ScOption[Double] = ScNone
    var step: ScOption[Double] = ScNone
    var unstackedDecreaseIcon: ScOption[FormItemIcon ] = ScNone
    var unstackedIncreaseIcon: ScOption[FormItemIcon ] = ScNone
    var unstackedPrintTextBoxStyle: ScOption[FormItemBaseStyle] = ScNone
    var unstackedReadOnlyTextBoxStyle: ScOption[FormItemBaseStyle] = ScNone
    var unstackedTextBoxStyle: ScOption[FormItemBaseStyle] = ScNone
    var writeStackedIcons: ScOption[Boolean] = ScNone
}

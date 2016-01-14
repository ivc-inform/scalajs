package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.SmartClient.Forms.FormsItems.radioGroupItem.RadioItem
import com.simplesys.System.Types.SCClassName
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js._

class RadioGroupItemProps extends FormItemProps {
    var disabledValues: ScOption[Array[String]] = ScNone
    var editProxyConstructor: ScOption[SCClassName] = ScNone
    var fillHorizontalSpace: ScOption[Boolean] = ScNone
    var itemProperties: ScOption[RadioItem] = ScNone
    var vertical: ScOption[Boolean] = ScNone
    var wrap: ScOption[Boolean] = ScNone
}
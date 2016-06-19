package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.SmartClient.Forms.FormsItems.radioGroupItem.RadioItem
import com.simplesys.SmartClient.System.IscArray
import com.simplesys.SmartClient.System.Types.FormItemComponentType
import com.simplesys.System.Types.SCClassName
import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.option.ScOption._

class RadioGroupItemProps extends FormItemProps {
    var disabledValues: ScOption[IscArray[String]] = ScNone
    var editProxyConstructor: ScOption[SCClassName] = ScNone
    var fillHorizontalSpace: ScOption[Boolean] = ScNone
    var itemProperties: ScOption[RadioItem] = ScNone
    var vertical: ScOption[Boolean] = ScNone
    var wrap: ScOption[Boolean] = ScNone
    `type` = FormItemComponentType.RadioGroupItem.opt
}

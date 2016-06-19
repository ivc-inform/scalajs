package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.SmartClient.System.Types.FormItemComponentType
import com.simplesys.System.Types.HTMLString
import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.option.ScOption._

class SelectOtherItemProps extends SelectItemProps {
    var dialogWidth: ScOption[Int] = ScNone
    var otherTitle: ScOption[String] = ScNone
    var otherValue: ScOption[String] = ScNone
    var selectOtherPrompt: ScOption[HTMLString] = ScNone
    var separatorTitle: ScOption[String] = ScNone
    var separatorValue: ScOption[String] = ScNone
    `type` = FormItemComponentType.SelectOtherItem.opt
}

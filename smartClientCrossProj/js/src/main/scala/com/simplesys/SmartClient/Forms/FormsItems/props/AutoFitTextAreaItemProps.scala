package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.SmartClient.System.Types.FormItemComponentType
import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.option.ScOption._

class AutoFitTextAreaItemProps extends TextAreaItemProps {
    var maxHeight: ScOption[Int] = ScNone
    `type` = FormItemComponentType.AutoFitTextAreaItem.opt
}

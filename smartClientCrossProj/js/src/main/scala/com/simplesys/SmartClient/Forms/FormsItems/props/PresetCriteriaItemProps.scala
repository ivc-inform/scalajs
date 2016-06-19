package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.SmartClient.System.Types.FormItemComponentType
import com.simplesys.System.JSObject
import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.option.ScOption._

class PresetCriteriaItemProps extends SelectItemProps {
    var customOptionTitle: ScOption[String] = ScNone
    var options: ScOption[JSObject] = ScNone
    var showCustomOption: ScOption[Boolean] = ScNone
    `type` = FormItemComponentType.PresetCriteriaItem.opt
}

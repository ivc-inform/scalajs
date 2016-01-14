package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.SmartClient.System.Types
import com.simplesys.option.{ScNone, ScOption}

class PresetCriteriaItemProps extends SelectItemProps {
    var customOptionTitle: ScOption[String] = ScNone
    var options: ScOption[Types.Object] = ScNone
    var showCustomOption: ScOption[Boolean] = ScNone
}

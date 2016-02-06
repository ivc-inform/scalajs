package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js

class PresetCriteriaItemProps extends SelectItemProps {
    var customOptionTitle: ScOption[String] = ScNone
    var options: ScOption[js.Object] = ScNone
    var showCustomOption: ScOption[Boolean] = ScNone
}

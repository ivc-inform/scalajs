package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.SmartClient.System.Types.FormItemComponentType
import com.simplesys.System.Types.SCClassName
import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.option.ScOption._

class StaticTextItemProps extends FormItemProps {
    var clipValue: ScOption[Boolean] = ScNone
    var editProxyConstructor: ScOption[SCClassName] = ScNone
    var escapeHTML: ScOption[Boolean] = ScNone
    var wrap: ScOption[Boolean] = ScNone
    `type` = FormItemComponentType.StaticTextItem.opt
}

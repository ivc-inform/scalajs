package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.SmartClient.System.Types.FormItemComponentType
import com.simplesys.System.Types.SCClassName
import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.option.ScOption._

class BlurbItemProps extends FormItemProps {
    var clipValue: ScOption[Boolean] = ScNone
    var editProxyConstructor: ScOption[SCClassName] = ScNone
    var wrap: ScOption[Boolean] = ScNone
    `type` = FormItemComponentType.BlurbItem.opt
}

package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.SmartClient.Forms.FormsItems.SkinBoxItem
import com.simplesys.SmartClient.System.Types.FormItemComponentType
import com.simplesys.option.ScOption._

class SkinBoxItemProps extends SelectItemProps {
    type classHandler <: SkinBoxItem

    `type` = FormItemComponentType.SkinBoxItem.opt
}

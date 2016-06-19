package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.SmartClient.Forms.FormsItems.TimerItem
import com.simplesys.SmartClient.System.Types.FormItemComponentType
import com.simplesys.option.ScOption._

class TimerItemProps extends TextItemProps {
    type classHandler <: TimerItem
    `type` = FormItemComponentType.TimerItem.opt
}

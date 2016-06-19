package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.SmartClient.Control.IButtonSS
import com.simplesys.SmartClient.Forms.FormsItems.ComboboxItemWithButtons
import com.simplesys.SmartClient.System.IscArray
import com.simplesys.System.Types.FormItemComponentType
import com.simplesys.option.{ScNone, ScOption}

class ComboboxItemWithButtonsProps extends CanvasItemProps {
    type classHandler <: ComboboxItemWithButtons

    var buttonsProperties: ScOption[IscArray[IButtonSS]] = ScNone

    `type` = FormItemComponentType.ComboboxItemWithButtons
}

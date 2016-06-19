package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.SmartClient.System.Types.FormItemComponentType
import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.option.ScOption._

class UploadItemProps extends TextItemProps {
    var accept: ScOption[String] = ScNone
    var multiple: ScOption[Boolean] = ScNone
    `type` = FormItemComponentType.UploadItem.opt
}

package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.SmartClient.System.IscArray
import com.simplesys.SmartClient.System.Types.FormItemComponentType
import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.option.ScOption._

class SectionItemProps extends CanvasItemProps {
    var canCollapse: ScOption[Boolean] = ScNone
    var canTabToHeader: ScOption[Boolean] = ScNone
    var itemIds: ScOption[IscArray[String]] = ScNone
    var sectionExpanded: ScOption[Boolean] = ScNone
    var sectionHeaderClass: ScOption[String] = ScNone
    `type` = FormItemComponentType.SectionItem.opt
}

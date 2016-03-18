package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.System.JSArray
import com.simplesys.System.Types.FormItemComponentType

import scala.scalajs.js._

class SectionItemProps extends CanvasItemProps {
    var canCollapse: ScOption[Boolean] = ScNone
    var canTabToHeader: ScOption[Boolean] = ScNone
    var itemIds: ScOption[JSArray[String]] = ScNone
    var sectionExpanded: ScOption[Boolean] = ScNone
    var sectionHeaderClass: ScOption[String] = ScNone
    `type` = FormItemComponentType.SectionItem
}

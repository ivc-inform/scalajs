package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.option.{ScOption, ScNone}
import com.simplesys.Types1.JSArray

import scala.scalajs.js._

class SectionItemProps extends CanvasItemProps {
    var canCollapse: ScOption[Boolean] = ScNone
    var canTabToHeader: ScOption[Boolean] = ScNone
    var itemIds: ScOption[JSArray[String]] = ScNone
    var sectionExpanded: ScOption[Boolean] = ScNone
    var sectionHeaderClass: ScOption[String] = ScNone
}

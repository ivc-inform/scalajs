package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.System.Types2.SCClassName
import com.simplesys.option.{ScOption, ScNone}

import scala.scalajs.js._

class StaticTextItemProps extends FormItemProps {
    var clipValue: ScOption[Boolean] = ScNone
    var editProxyConstructor: ScOption[SCClassName] = ScNone
    var escapeHTML: ScOption[Boolean] = ScNone
    var wrap: ScOption[Boolean] = ScNone
}

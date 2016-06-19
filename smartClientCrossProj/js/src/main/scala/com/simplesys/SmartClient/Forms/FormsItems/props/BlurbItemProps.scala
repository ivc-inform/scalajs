package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.System.Types.{FormItemComponentType, SCClassName}
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js._

class BlurbItemProps extends FormItemProps {
    var clipValue: ScOption[Boolean] = ScNone
    var editProxyConstructor: ScOption[SCClassName] = ScNone
    var wrap: ScOption[Boolean] = ScNone
    `type` = FormItemComponentType.BlurbItem
}

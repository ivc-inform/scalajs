package com.simplesys.SmartClient.Layout.props

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Layout.OkPanel
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js

class OkPanelProps extends HPanelSSProps {
    type classHandler <: OkPanel
    var okFunction: ScOption[js.Function1[classHandler, _]] = ScNone
    var okCaption: ScOption[String] = ScNone
    var ownerDestroy: ScOption[Boolean] = ScNone
    var ownerHide: ScOption[Boolean] = ScNone
    var timeoutClose: ScOption[Int] = ScNone
}

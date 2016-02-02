package com.simplesys.SmartClient.Layout.props

import com.simplesys.SmartClient.Layout.OkCancelPanel
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js

class OkCancelPanelProps extends HPanelSSProps {
    type callbackHandler <: OkCancelPanel
    var okFunction: ScOption[js.Function1[callbackHandler, _]] = ScNone
    var cancelFunction: ScOption[js.Function1[callbackHandler, _]] = ScNone
    var okCaption: ScOption[String] = ScNone
    var cancelCaption: ScOption[String] = ScNone
    var ownerDestroy: ScOption[Boolean] = ScNone
    var ownerHide: ScOption[Boolean] = ScNone
    var timeoutClose: ScOption[Int] = ScNone
}

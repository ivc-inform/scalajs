package com.simplesys.SmartClient.Layout.props

import com.simplesys.SmartClient.Layout.{OkCancelPanel, HLayout}
import com.simplesys.option.{ScOption, ScNone}

import scala.scalajs.js

class OkCancelPanelProps extends HPanelSSProps {
    type callbackHandler <: OkCancelPanel
    var okFunction: ScOption[js.Function1[callbackHandler, _]] = ScNone
    var cancelFunction: ScOption[js.Function1[callbackHandler, _]] = ScNone
}

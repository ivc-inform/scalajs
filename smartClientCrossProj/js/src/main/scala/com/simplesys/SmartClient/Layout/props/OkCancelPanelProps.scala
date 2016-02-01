package com.simplesys.SmartClient.Layout.props

import com.simplesys.option.{ScOption, ScNone}

import scala.scalajs.js

class OkCancelPanelProps extends HPanelSSProps {
    var okFunction: ScOption[js.Function0[_]] = ScNone
    var cancelFunction: ScOption[js.Function0[_]] = ScNone
}

package com.simplesys.SmartClient.Layout

import com.simplesys.SmartClient.Control.IButton

import scala.scalajs.js

@js.native
trait OkCancelPanel extends HPanelSS {
    var okFunction: js.Function1[callbackHandler, _]
    var cancelFunction: js.Function1[callbackHandler, _]
    var okBtn: IButton
    var cancelButton: IButton
}



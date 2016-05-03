package com.simplesys.js.com.simplesys.SmartClient.Layout

import com.simplesys.SmartClient.Control.IButton
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Layout.HPanelSS

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait OkPanel extends HPanelSS {
    var okFunction: js.Function1[callbackHandler, _]
    var okBtn: IButton
    def setDisabledOk(value: Boolean): this.type
    def setOwner(owner: Canvas): this.type
    var okCaption: String
    var ownerDestroy: Boolean
    var ownerHide: Boolean
    var timeoutClose: Int
    var owner: Canvas
}


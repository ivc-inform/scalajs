package com.simplesys.SmartClient.Control

import com.simplesys.SmartClient.Foundation.{AbstractCanvasCompanion, Img}
import com.simplesys.System.Types2.State.State
import com.simplesys.System.Types2.VerticalAlignment.VerticalAlignment
import com.simplesys.System.Types2.{SCImgURL, URL, CSSStyleName, void}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait ImgButton extends Img {
    var action: js.Function1[void, _]
    var hiliteAccessKey: Boolean
    var iconAlign: String
    var labelHPad: Int
    var labelVPad: Int
    def setSelected(): void
    var showClippedTitleOnHover: Boolean
    var showDisabledIcon: Boolean
    var showTitle: Boolean
    var titleClipped: js.Function1[void, Boolean]
    var titleHover: js.Function1[void, Boolean]
}




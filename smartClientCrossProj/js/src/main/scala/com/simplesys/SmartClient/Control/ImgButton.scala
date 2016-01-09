package com.simplesys.SmartClient.Control

import com.simplesys.SmartClient.Foundation.{AbstractCanvasCompanion, Img}
import com.simplesys.isc.System.Types.State.State
import com.simplesys.isc.System.Types.VerticalAlignment.VerticalAlignment
import com.simplesys.isc.System.Types.{SCImgURL, URL, CSSStyleName, void}

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
    var src: SCImgURL
    var titleClipped: js.Function1[void, Boolean]
    var titleHover: js.Function1[void, Boolean]
}

@js.native
abstract trait AbstractImgButtonCompanion extends AbstractCanvasCompanion {
}

@js.native
object ImgButton extends AbstractImgButtonCompanion        

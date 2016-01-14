package com.simplesys.SmartClient.Control

import com.simplesys.SmartClient.Foundation.{AbstractStretchImgCompanion, StretchImg}
import com.simplesys.System.Types.State.State
import com.simplesys.System.Types._

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait StretchImgButton extends StretchImg {
    var action: js.Function1[void, _]
    var capSize: Int
    var hiliteAccessKey: Boolean
    var iconAlign: String
    var iconClick: js.Function1[void, Boolean]
    var labelBreadthPad: Int
    var labelHPad: Int
    var labelLengthPad: Int
    var labelSkinImgDir: URL
    var labelVPad: Int
    def setLabelSkinImgDir(orientation: URL): void
    def setSelected(): void
    def setTitleStyle(style: CSSStyleName): void
    var showClippedTitleOnHover: Boolean
    var showDisabledIcon: Boolean
    var titleClipped: js.Function1[void, Boolean]
    var titleHover: js.Function1[void, Boolean]
    def titleHoverHTML (defaultHTML:HTMLString):HTMLString
    var titleStyle:CSSStyleName
    var wrap:Boolean
}

@js.native
abstract trait AbstractStretchImgButtonCompanion extends AbstractStretchImgCompanion {
}

@js.native
object StretchImgButton extends AbstractStretchImgButtonCompanion


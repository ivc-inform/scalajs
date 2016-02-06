package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.System.{Class, Types}
import com.simplesys.System.Types2.{CSSStyleName, SCImgURL}
import com.simplesys.option._

class ButtonItemProps extends CanvasItemProps {
    var autoFit: ScOption[Boolean] = ScNone
    var baseStyle: ScOption[CSSStyleName] = ScNone
    var button: ScOption[Canvas] = ScNone
    var buttonConstructor: ScOption[Class] = ScNone
    var buttonProperties: ScOption[Types.Object] = ScNone
    var icon: ScOption[SCImgURL] = ScNone
    var showFocusedAsOver: ScOption[Boolean] = ScNone
    `type` = "ButtonItem"
}

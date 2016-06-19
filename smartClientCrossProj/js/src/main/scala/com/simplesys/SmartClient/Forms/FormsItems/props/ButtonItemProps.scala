package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.System.Class
import com.simplesys.SmartClient.System.Types.FormItemComponentType
import com.simplesys.System.JSObject
import com.simplesys.System.Types.{CSSStyleName, SCImgURL}
import com.simplesys.option._
import com.simplesys.option.ScOption._

class ButtonItemProps extends CanvasItemProps {
    var autoFit: ScOption[Boolean] = ScNone
    var baseStyle: ScOption[CSSStyleName] = ScNone
    var button: ScOption[Canvas] = ScNone
    var buttonConstructor: ScOption[Class] = ScNone
    var buttonProperties: ScOption[JSObject] = ScNone
    var icon: ScOption[SCImgURL] = ScNone
    var showFocusedAsOver: ScOption[Boolean] = ScNone
    `type` = FormItemComponentType.ButtonItem.opt
}

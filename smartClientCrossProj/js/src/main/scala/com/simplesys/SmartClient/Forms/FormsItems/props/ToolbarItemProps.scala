package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.SmartClient.Control.Button
import com.simplesys.SmartClient.System.Class
import com.simplesys.SmartClient.Foundation.StatefulCanvas
import com.simplesys.System.Types.CSSStyleName
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js._

class ToolbarItemProps extends CanvasItemProps {
    var buttonBaseStyle: ScOption[CSSStyleName] = ScNone
    var buttonConstructor: ScOption[Class] = ScNone
    var buttonProperties: ScOption[Button] = ScNone
    var buttons: ScOption[Array[StatefulCanvas]] = ScNone
    var vertical: ScOption[Boolean] = ScNone
}

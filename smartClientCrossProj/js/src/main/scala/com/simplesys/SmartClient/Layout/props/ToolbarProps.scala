package com.simplesys.SmartClient.Layout.props

import com.simplesys.SmartClient.System.Class
import com.simplesys.SmartClient.Control.Button
import com.simplesys.SmartClient.System.Types
import com.simplesys.System.Types.void
import com.simplesys.option.{ScOption, ScNone}

import scala.scalajs.js
import scala.scalajs.js._

class ToolbarProps extends LayoutProps {
    var buttonConstructor: ScOption[Class] = ScNone
    var buttonDefaults: ScOption[Types.Object] = ScNone
    var buttons: ScOption[js.Array[Button]] = ScNone
    var canReorderItems: ScOption[Boolean] = ScNone
    var canResizeItems: ScOption[Boolean] = ScNone
    var itemClick: ScOption[js.ThisFunction2[callbackHandler, Button, Int, void]] = ScNone
    var itemDoubleClick: ScOption[js.ThisFunction2[callbackHandler, Button, Int, void]] = ScNone
    var itemDragResized: ScOption[js.ThisFunction2[callbackHandler, Int, Int, void]] = ScNone
}

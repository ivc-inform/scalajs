package com.simplesys.SmartClient.Layout.props

import com.simplesys.SmartClient.Control.Button
import com.simplesys.SmartClient.System.Class
import com.simplesys.System.Types.void
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js

class ToolbarProps extends LayoutProps {
    var buttonConstructor: ScOption[Class] = ScNone
    var buttonDefaults: ScOption[js.Object] = ScNone
    var buttons: ScOption[Seq[Button]] = ScNone
    var canReorderItems: ScOption[Boolean] = ScNone
    var canResizeItems: ScOption[Boolean] = ScNone
    var itemClick: ScOption[js.ThisFunction2[callbackHandler, Button, Int, void]] = ScNone
    var itemDoubleClick: ScOption[js.ThisFunction2[callbackHandler, Button, Int, void]] = ScNone
    var itemDragResized: ScOption[js.ThisFunction2[callbackHandler, Int, Int, void]] = ScNone
}

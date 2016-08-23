package com.simplesys.SmartClient.Layout.props

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Layout.WindowSS
import com.simplesys.System.JSUndefined
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js.ThisFunction1

class WindowSSProps extends WindowProps {
    type classHandler <: WindowSS
    var headerIconPath: ScOption[String] = ScNone
    var autoPosition: ScOption[Boolean] = ScNone
    var onDestroy: ScOption[ThisFunction1[classHandler, JSUndefined[Canvas], _]] = ScNone
}

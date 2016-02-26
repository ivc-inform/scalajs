package com.simplesys.SmartClient.Foundation.props

import com.simplesys.option.{Function1CanvasClick_String, ScNone, ScOption}

import scala.scalajs.js

class JoinJSCanvasProps extends CanvasProps {
    var suffix: ScOption[String] = ScNone
    var joinJSFunc: ScOption[Function1CanvasClick_String[js.ThisFunction0[_, _], String]] = ScNone
}

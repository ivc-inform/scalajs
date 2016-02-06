package com.simplesys.SmartClient.Foundation.props

import com.simplesys.option.{ScNone, ScOption}

class JoinJSCanvasProps extends CanvasProps {
    var suffix: ScOption[String] = ScNone
    var joinJSFunc: ScOption[String] = ScNone
}

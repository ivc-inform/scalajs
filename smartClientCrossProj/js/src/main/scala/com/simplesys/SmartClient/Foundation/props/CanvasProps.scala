package com.simplesys.SmartClient.Foundation.props

import com.simplesys.SmartClient.Foundation.inst.Canvas
import com.simplesys.SmartClient.System.props.ClassProps
import com.simplesys.SmartClient.option.{ScNone, ScOption}

class CanvasProps extends ClassProps {
    val click : ScOption[Function1[Canvas#clickHandler, Boolean]] = ScNone
}

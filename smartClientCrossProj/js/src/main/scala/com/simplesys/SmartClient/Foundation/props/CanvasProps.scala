package com.simplesys.SmartClient.Foundation.props

import com.simplesys.SmartClient.System.props.ClassProps
import com.simplesys.SmartClient.option.{ScNone, ScOption}

class CanvasProps extends ClassProps {
    type clickHandler <: this.type
    val click : ScOption[Function1[clickHandler, Boolean]] = ScNone
}

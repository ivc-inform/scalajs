package com.simplesys.SmartClient.Foundation.props

import com.simplesys.SmartClient.System.Types.HTMLString
import com.simplesys.SmartClient.System.props.ClassProps
import com.simplesys.SmartClient.option.{ScNone, ScOption}

class CanvasProps extends ClassProps {
    val title: ScOption[HTMLString] = ScNone
}

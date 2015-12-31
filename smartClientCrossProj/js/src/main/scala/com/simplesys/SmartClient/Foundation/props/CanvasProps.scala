package com.simplesys.SmartClient.Foundation.props

import com.simplesys.SmartClient.System.props.ClassProps
import com.simplesys.SmartClient.option.{ScNone, ScOption}
import com.simplesys.isc.System.Types.HTMLString

class CanvasProps extends ClassProps {
    var title: ScOption[HTMLString] = ScNone
}

package com.simplesys.SmartClient.Foundation.props

import com.simplesys.SmartClient.System.Types.{SCImgURL, HTMLString}
import com.simplesys.SmartClient.System.props.ClassProps
import com.simplesys.SmartClient.option.{ScNone, ScOption}

class CanvasProps extends ClassProps {
    var title: ScOption[HTMLString] = ScNone
}

package com.simplesys.SmartClient.Foundation.props

import com.simplesys.SmartClient.System.Types.IconOrientation.IconOrientation
import com.simplesys.SmartClient.System.Types.SCImgURL
import com.simplesys.SmartClient.option.{ScNone, ScOption}

class StatefulCanvasProps extends CanvasProps {
    var icon: ScOption[SCImgURL] = ScNone
    var iconOrientation: ScOption[IconOrientation] = ScNone
}

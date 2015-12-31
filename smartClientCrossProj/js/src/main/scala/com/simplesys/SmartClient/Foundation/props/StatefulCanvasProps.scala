package com.simplesys.SmartClient.Foundation.props

import com.simplesys.isc.System.Types.{SCImgURL, IconOrientation}
import IconOrientation.IconOrientation
import com.simplesys.SmartClient.option.{ScNone, ScOption}

class StatefulCanvasProps extends CanvasProps {
    var icon: ScOption[SCImgURL] = ScNone
    var iconOrientation: ScOption[IconOrientation] = ScNone
}

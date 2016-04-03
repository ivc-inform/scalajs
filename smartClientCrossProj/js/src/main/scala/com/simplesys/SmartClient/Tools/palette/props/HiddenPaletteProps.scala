package com.simplesys.SmartClient.Tools.palette.props

import com.simplesys.SmartClient.Tools.PaletteNode
import com.simplesys.SmartClient.Tools.props.PaletteProps
import com.simplesys.System._
import com.simplesys.option.{ScNone, ScOption}

class HiddenPaletteProps extends PaletteProps {
    val data: ScOption[JSArray[PaletteNode]] = ScNone
}

package com.simplesys.SmartClient.Tools.props

import com.simplesys.SmartClient.System.props.ClassProps
import com.simplesys.SmartClient.Tools.EditContext
import com.simplesys.option.{ScNone, ScOption}

trait PaletteProps extends ClassProps {
    var defaultEditContext: ScOption[EditContext] = ScNone
    val generateNames: ScOption[Boolean] = ScNone
}

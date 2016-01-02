package com.simplesys.SmartClient.Control.props

import com.simplesys.SmartClient.Foundation.props.StatefulCanvasProps
import com.simplesys.SmartClient.option.{ScNone, ScOption}
import com.simplesys.isc.System.Types.Cursor.Cursor

class ButtonProps extends StatefulCanvasProps {
    type buttonHandler <: this.type
    var action: ScOption[Function1[buttonHandler, Unit]] = ScNone
    val disabledIconCursor: ScOption[Cursor] = ScNone
    var hiliteAccessKey: ScOption[Boolean] = ScNone
    val iconAlign: ScOption[String] = ScNone
    var iconClick: ScOption[Function1[buttonHandler, Boolean]] = ScNone
    val iconCursor: ScOption[Cursor] = ScNone
    var showClippedTitleOnHover: ScOption[Boolean] = ScNone
    var showDisabledIcon: ScOption[Boolean] = ScNone
    var titleClipped: ScOption[Function1[buttonHandler, Boolean]] = ScNone
    var titleHover: ScOption[Function1[buttonHandler, Boolean]] = ScNone
    var wrap: ScOption[Boolean] = ScNone
}

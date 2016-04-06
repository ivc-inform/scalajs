package com.simplesys.SmartClient.Drawing.drawItem.props

import com.simplesys.SmartClient.Drawing.drawItem.props.drawShape.DrawShapeCommandProps
import com.simplesys.SmartClient.Drawing.props.DrawItemProps
import com.simplesys.option.{ScNone, ScOption}

class DrawShapeProps extends DrawItemProps {
    var commands: ScOption[Seq[DrawShapeCommandProps]] = ScNone
    override val `type`: ScOption[String]  = "DrawShape"
}

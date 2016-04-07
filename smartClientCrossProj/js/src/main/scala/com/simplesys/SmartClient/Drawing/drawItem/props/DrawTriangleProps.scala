package com.simplesys.SmartClient.Drawing.drawItem.props

import com.simplesys.SmartClient.Drawing.props.DrawTriangleDefaultsProps
import com.simplesys.option.{ScNone, ScOption}

class DrawTriangleProps extends DrawPolygonProps {
    var defaults: ScOption[DrawTriangleDefaultsProps] = ScNone
    override val `type`: ScOption[String] = "DrawTriangle"
}

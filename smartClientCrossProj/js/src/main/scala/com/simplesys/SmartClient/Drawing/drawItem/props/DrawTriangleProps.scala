package com.simplesys.SmartClient.Drawing.drawItem.props

import com.simplesys.SmartClient.Drawing.DrawTriangleDefaults
import com.simplesys.option.{ScNone, ScOption}

class DrawTriangleProps extends DrawPolygonProps {
    var defaults: ScOption[DrawTriangleDefaults] = ScNone
    override val `type`: ScOption[String] = "DrawTriangle"
}

package com.simplesys.SmartClient.Drawing.drawItem.props

import com.simplesys.SmartClient.Drawing.DrawLinePathDefaults
import com.simplesys.SmartClient.Drawing.props.DrawItemProps
import com.simplesys.SmartClient.System.Point
import com.simplesys.System.Types.ConnectorOrientation.ConnectorOrientation
import com.simplesys.System.Types.ConnectorStyle.ConnectorStyle
import com.simplesys.option.{ScNone, ScOption}

class DrawLinePathProps extends DrawItemProps {
    var connectorOrientation: ScOption[ConnectorOrientation] = ScNone
    var connectorStyle: ScOption[ConnectorStyle] = ScNone
    var controlPoint1: ScOption[Point] = ScNone
    var controlPoint2: ScOption[Point] = ScNone
    var endLeft: ScOption[Int] = ScNone
    var endPoint: ScOption[Point] = ScNone
    var endTop: ScOption[Int] = ScNone
    var startLeft: ScOption[Int] = ScNone
    var startPoint: ScOption[Point] = ScNone
    var startTop: ScOption[Int] = ScNone
    var tailSize: ScOption[Int] = ScNone
    var defaults: ScOption[DrawLinePathDefaults] = ScNone
    override val `type`: ScOption[String]  = "DrawLinePath"
}

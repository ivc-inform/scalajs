package com.simplesys.SmartClient.Drawing.props

import com.simplesys.SmartClient.Drawing.drawItem.props.DrawLabelProps
import com.simplesys.SmartClient.Drawing.gradient.props.SimpleGradientProps
import com.simplesys.SmartClient.System._
import com.simplesys.System.Types.Alignment.Alignment
import com.simplesys.System.Types.ArrowStyle._
import com.simplesys.System._
import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.props.AbstractClassProps

class DefaultsDrawItem extends AbstractClassProps {
    var title: ScOption[String] = ScNone
    var keepInParentRect: ScOption[Boolean] = ScNone
    var lineWidth: ScOption[Int] = ScNone
    var titleLabelProperties: ScOption[DrawLabelProps] = ScNone
}

class DrawRectDefaultsProps extends DefaultsDrawItem {
    var top: ScOption[Int] = ScNone
    var left: ScOption[Int] = ScNone
    var width: ScOption[Int] = ScNone
    var height: ScOption[Int] = ScNone
    var rounding: ScOption[Double] = ScNone
    var fillGradient: ScOption[SimpleGradientProps] = ScNone
    var shadow: ScOption[ShadowProps] = ScNone
}

class DrawLineDefaultsProps extends DefaultsDrawItem {
    var startPoint: ScOption[Point] = ScNone
    var endPoint: ScOption[Point] = ScNone
    var endArrow: ScOption[ArrowStyle] = ScNone
    var startArrow: ScOption[ArrowStyle] = ScNone
}

class DrawCurveDefaultsProps extends DefaultsDrawItem {
    var endPoint: ScOption[Point] = ScNone
    var startPoint: ScOption[Point] = ScNone
    var endArrow: ScOption[ArrowStyle] = ScNone
    var startArrow: ScOption[ArrowStyle] = ScNone
    var controlPoint1: ScOption[Point] = ScNone
    var controlPoint2: ScOption[Point] = ScNone
}

class DrawLinePathDefaultsProps extends DefaultsDrawItem {
    var endPoint: ScOption[Point] = ScNone
    var startPoint: ScOption[Point] = ScNone
    var endArrow: ScOption[ArrowStyle] = ScNone
    var startArrow: ScOption[ArrowStyle] = ScNone
    var controlPoint1: ScOption[Point] = ScNone
    var controlPoint2: ScOption[Point] = ScNone
}

class DrawPathDefaultsProps extends DefaultsDrawItem {
    var endPoint: ScOption[Point] = ScNone
    var startPoint: ScOption[Point] = ScNone
    var endArrow: ScOption[ArrowStyle] = ScNone
    var startArrow: ScOption[ArrowStyle] = ScNone
    var controlPoint1: ScOption[Point] = ScNone
    var controlPoint2: ScOption[Point] = ScNone
}

class DrawOvalDefaultsProps extends DefaultsDrawItem {
    var top: ScOption[Int] = ScNone
    var left: ScOption[Int] = ScNone
    var width: ScOption[Int] = ScNone
    var height: ScOption[Int] = ScNone
    var fillGradient: ScOption[SimpleGradientProps] = ScNone
    var shadow: ScOption[ShadowProps] = ScNone
}

class DrawDiamondDefaultsProps extends DefaultsDrawItem {
    var top: ScOption[Int] = ScNone
    var left: ScOption[Int] = ScNone
    var width: ScOption[Int] = ScNone
    var height: ScOption[Int] = ScNone
    var fillGradient: ScOption[SimpleGradientProps] = ScNone
    var shadow: ScOption[ShadowProps] = ScNone
}

class DrawTriangleDefaultsProps extends DefaultsDrawItem {
    var points: ScOption[JSArray[Point]] = ScNone
    var fillGradient: ScOption[SimpleGradientProps] = ScNone
    var shadow: ScOption[ShadowProps] = ScNone
}

class DrawLabelDefaultsProps extends DefaultsDrawItem {
    var top: ScOption[Int] = ScNone
    var left: ScOption[Int] = ScNone
    var contents: ScOption[String] = ScNone
    var alignment: ScOption[Alignment] = ScNone
    var fillGradient: ScOption[SimpleGradientProps] = ScNone
    var shadow: ScOption[ShadowProps] = ScNone
}

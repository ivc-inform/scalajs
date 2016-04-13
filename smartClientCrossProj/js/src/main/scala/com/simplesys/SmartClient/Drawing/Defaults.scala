package com.simplesys.SmartClient.Drawing

import com.simplesys.SmartClient.Control.MenuSS
import com.simplesys.SmartClient.Drawing.drawItem.DrawLabel
import com.simplesys.SmartClient.Drawing.gradient.SimpleGradient
import com.simplesys.SmartClient.System.Point
import com.simplesys.System.Types.ArrowStyle.ArrowStyle
import com.simplesys.System.Types.CSSColor
import com.simplesys.System.Types.Cursor.Cursor
import com.simplesys.System.Types.LineCap.LineCap
import com.simplesys.System.Types.LinePattern.LinePattern
import com.simplesys.System.{JSArray, JSObject, JSUndefined, jSUndefined}

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.|

@js.native
trait Defaults extends JSObject {
    var title: String
    var keepInParentRect: Boolean
    var lineWidth: Int
    var titleLabelProperties: DrawLabel
    var contextMenu: MenuSS
}

@js.native
trait DrawRectDefaults extends Defaults {
    var top: Int
    var left: Int
    var width: Int
    var height: Int
    var rounding: Double
    var fillGradient: SimpleGradient
    var shadow: Shadow
}

@js.native
trait DrawLineDefaults extends Defaults {
    var startPoint: Point
    var endPoint: Point
    var endArrow: ArrowStyle
    var startArrow: ArrowStyle
}

@js.native
trait DrawCurveDefaults extends Defaults {
    var endPoint: Point
    var startPoint: Point
    var endArrow: ArrowStyle
    var startArrow: ArrowStyle
    var controlPoint1: Point
    var controlPoint2: Point
}

@js.native
trait DrawLinePathDefaults extends Defaults {
    var endPoint: Point
    var startPoint: Point
    var endArrow: ArrowStyle
    var startArrow: ArrowStyle
    var controlPoint1: Point
    var controlPoint2: Point
}

@js.native
trait DrawPathDefaults extends Defaults {
    var endPoint: Point
    var startPoint: Point
    var endArrow: ArrowStyle
    var startArrow: ArrowStyle
    var controlPoint1: Point
    var controlPoint2: Point
}

@js.native
trait DrawOvalDefaults extends Defaults {
    var top: Int
    var left: Int
    var width: Int
    var height: Int
    var fillGradient: SimpleGradient
    var shadow: Shadow
}

@js.native
trait DrawDiamondDefaults extends Defaults {
    var top: Int
    var left: Int
    var width: Int
    var height: Int
    var fillGradient: SimpleGradient
    var shadow: Shadow
}

@js.native
trait DrawTriangleDefaults extends Defaults {
    var points: JSArray[Point]
    var fillGradient: SimpleGradient
    var shadow: Shadow
}

@js.native
trait DrawLabelDefaults extends Defaults {
    var top: Int
    var left: Int
    var contents: String
    var alignment: com.simplesys.System.Types.Alignment.Alignment
    var fillGradient: SimpleGradient
    var shadow: Shadow
}

@js.native
trait DrawPaneDefaults extends Defaults {
    var canFocus: Boolean
    var width: Int | String
    var height: Int | String
    var gradients: JSArray[SimpleGradient]
}

@ScalaJSDefined
trait PropEditorLiveObject extends JSObject {
    var canDrag: JSUndefined[Boolean]
    var cursor: JSUndefined[Cursor]
    var endArraw: JSUndefined[ArrowStyle]
    var fillColor: JSUndefined[CSSColor]
    var fillGradient: JSUndefined[SimpleGradient]
    var fillOpacity: JSUndefined[Double]
    val lineCap: JSUndefined[LineCap]
    val lineColor: JSUndefined[CSSColor]
    val lineOpacity: JSUndefined[Double]
    val linePattern: JSUndefined[LinePattern]
    val lineWidth: JSUndefined[Double]
    val shadow: JSUndefined[Shadow]
    val startArraw: JSUndefined[ArrowStyle]
    val title: JSUndefined[String]
    val rounding: JSUndefined[Double]
    val keepInParentRect:JSUndefined[Boolean]
    val multiline:JSUndefined[Boolean]
}

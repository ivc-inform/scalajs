package com.simplesys.SmartClient.Drawing.props

import com.simplesys.SmartClient.Control.MenuSS
import com.simplesys.SmartClient.Drawing.drawItem.{DrawGroup, DrawLabel, DrawRect}
import com.simplesys.SmartClient.Drawing.gradient.Gradient
import com.simplesys.SmartClient.Drawing.{DrawKnob, DrawPane, Shadow}
import com.simplesys.SmartClient.Tools.EditProxy
import com.simplesys.System.Types.ArrowStyle.ArrowStyle
import com.simplesys.System.Types.Cursor.Cursor
import com.simplesys.System.Types.KnobType.KnobType
import com.simplesys.System.Types.LineCap.LineCap
import com.simplesys.System.Types.LinePattern.LinePattern
import com.simplesys.System.Types.MoveKnobPoint.MoveKnobPoint
import com.simplesys.System.Types.ProportionalResizeMode.ProportionalResizeMode
import com.simplesys.System.Types.ResizeKnobPoint.ResizeKnobPoint
import com.simplesys.System.Types.TitleRotationMode.TitleRotationMode
import com.simplesys.System.Types._
import com.simplesys.System._
import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.props.AbstractClassProps
import com.simplesys.option.ScOption._

import scala.scalajs.js

class DrawItemProps extends AbstractClassProps {
    var canDrag: ScOption[Boolean] = ScNone
    var canHover: ScOption[Boolean] = ScNone
    var click: ScOption[js.Function0[Boolean]] = ScNone
    var contextMenu: ScOption[MenuSS] = ScNone
    var cornerResizeKnob: ScOption[DrawKnob with MultiAutoChild] = ScNone
    var cursor: ScOption[Cursor] = ScNone
    //val defaults: ScOption[Defaults] = ScNone
    var destroyed: ScOption[Boolean] = ScNone
    var destroying: ScOption[Boolean] = ScNone
    var dragMove: ScOption[js.Function0[Boolean]] = ScNone
    var dragResizeMove: ScOption[js.Function5[String, Int, Int, Int, Int, _]] = ScNone
    var dragStart: ScOption[js.Function0[Boolean]] = ScNone
    var dragStartDistance: ScOption[Int] = ScNone
    var dragStop: ScOption[js.Function0[Boolean]] = ScNone
    var drawGroup: ScOption[DrawGroup] = ScNone
    var drawPane: ScOption[DrawPane] = ScNone
    var editProxyConstructor: ScOption[SCClassName] = ScNone
    var editProxyProperties: ScOption[EditProxy] = ScNone
    var endArrow: ScOption[ArrowStyle] = ScNone
    var endKnob: ScOption[DrawKnob] = ScNone
    var fillColor: ScOption[CSSColor] = ScNone
    var fillGradient: ScOption[Gradient] = ScNone
    var fillOpacity: ScOption[Double] = ScNone
    var keepInParentRect: ScOption[Boolean] = ScNone
    var knobs: ScOption[Seq[KnobType]] = ScNone
    var lineCap: ScOption[LineCap] = ScNone
    var lineColor: ScOption[CSSColor] = ScNone
    var lineOpacity: ScOption[Double] = ScNone
    var linePattern: ScOption[LinePattern] = ScNone
    var lineWidth: ScOption[Int] = ScNone
    var mouseDown: ScOption[js.Function0[Boolean]] = ScNone
    var mouseMove: ScOption[js.Function0[Boolean]] = ScNone
    var mouseOut: ScOption[js.Function0[Boolean]] = ScNone
    var mouseOver: ScOption[js.Function0[Boolean]] = ScNone
    var mouseUp: ScOption[js.Function0[Boolean]] = ScNone
    var moved: ScOption[js.Function2[Int, Int, _]] = ScNone
    var moveKnob: ScOption[DrawKnob] = ScNone
    var moveKnobOffset: ScOption[Seq[Int]] = ScNone
    var moveKnobPoint: ScOption[MoveKnobPoint] = ScNone
    var prompt: ScOption[HTMLString] = ScNone
    var proportionalResizeModifiers: ScOption[Seq[KeyName]] = ScNone
    var proportionalResizing: ScOption[ProportionalResizeMode] = ScNone
    var resized: ScOption[js.Function0[_]] = ScNone
    var resizeKnobPoints: ScOption[Seq[ResizeKnobPoint]] = ScNone
    var resizeOutline: ScOption[DrawRect] = ScNone
    var resizeViaLocalTransformOnly: ScOption[Boolean] = ScNone
    var rotation: ScOption[Double] = ScNone
    var scale: ScOption[Seq[Double]] = ScNone
    var shadow: ScOption[Shadow] = ScNone
    var shapeData: ScOption[JSObject] = ScNone
    var showHover: ScOption[Boolean] = ScNone
    var showResizeOutline: ScOption[Boolean] = ScNone
    var showTitleLabelBackground: ScOption[Boolean] = ScNone
    var sideResizeKnob: ScOption[DrawKnob with MultiAutoChild] = ScNone
    var startArrow: ScOption[ArrowStyle] = ScNone
    var startKnob: ScOption[DrawKnob] = ScNone
    var title: ScOption[String] = ScNone
    var titleLabel: ScOption[DrawLabel] = ScNone
    var titleLabelBackground: ScOption[DrawLabel] = ScNone
    var titleLabelPadding: ScOption[Int] = ScNone
    var titleRotationMode: ScOption[TitleRotationMode] = ScNone
    var translate: ScOption[Seq[Double]] = ScNone
    var xShearFactor: ScOption[Double] = ScNone
    var yShearFactor: ScOption[Double] = ScNone
    val `type`: ScOption[String] = "DrawItem".opt
}

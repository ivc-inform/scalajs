package com.simplesys.SmartClient.Control.props

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Foundation.props.CanvasProps
import com.simplesys.System.Types2.{void, CSSStyleName}
import com.simplesys.System.Types2.ImageStyle.ImageStyle
import com.simplesys.option.{ScOption, ScNone}

import scala.scalajs.js

class SliderProps extends CanvasProps {
    var animateThumb: ScOption[Boolean] = ScNone
    var animateThumbInit: ScOption[Boolean] = ScNone
    var animateThumbTime: ScOption[Int] = ScNone
    var flipValues: ScOption[Boolean] = ScNone
    var hThumbStyle: ScOption[CSSStyleName] = ScNone
    var hTrackStyle: ScOption[CSSStyleName] = ScNone
    var labelHeight: ScOption[Int] = ScNone
    var labelSpacing: ScOption[Int] = ScNone
    var labelWidth: ScOption[Int] = ScNone
    var length: ScOption[Int] = ScNone
    var maxValue: ScOption[Double] = ScNone
    var maxValueLabel: ScOption[String] = ScNone
    var minValue: ScOption[Double] = ScNone
    var minValueLabel: ScOption[String] = ScNone
    var numValues: ScOption[Int] = ScNone
    var roundPrecision: ScOption[Int] = ScNone
    var roundValues: ScOption[Boolean] = ScNone
    var showRange: ScOption[Boolean] = ScNone
    var showTitle: ScOption[Boolean] = ScNone
    var showValue: ScOption[Boolean] = ScNone
    var sliderTarget: ScOption[Canvas] = ScNone
    var stepPercent: ScOption[Double] = ScNone
    var thumbSrc: ScOption[String] = ScNone
    var thumbThickWidth: ScOption[Int] = ScNone
    var thumbThinWidth: ScOption[Int] = ScNone
    var title: ScOption[String] = ScNone
    var trackCapSize: ScOption[Int] = ScNone
    var trackImageType: ScOption[ImageStyle] = ScNone
    var trackSrc: ScOption[String] = ScNone
    var trackWidth: ScOption[Int] = ScNone
    var value: ScOption[Double] = ScNone
    var valueChanged: ScOption[js.Function1[Double, _]] = ScNone
    var valueIsChanging: ScOption[js.Function1[void, Boolean]] = ScNone
    var vertical: ScOption[Boolean] = ScNone
    var vThumbStyle: ScOption[CSSStyleName] = ScNone
    var vTrackStyle: ScOption[CSSStyleName] = ScNone

}

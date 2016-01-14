package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.System.Class
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js
import scala.scalajs.js._

class SliderItemProps extends CanvasItemProps {
    var changeOnDrag: ScOption[Boolean] = ScNone
    var maxValue: ScOption[Double] = ScNone
    var minValue: ScOption[Double] = ScNone
    var numValues: ScOption[Int] = ScNone
    var roundPrecision: ScOption[Int] = ScNone
    var roundValues: ScOption[Boolean] = ScNone
    var slider: ScOption[Canvas ] = ScNone
    var sliderConstructor: ScOption[Class] = ScNone
    var sliderProperties: ScOption[js.Dictionary[js.Any]] = ScNone
    var vertical: ScOption[Boolean] = ScNone
}

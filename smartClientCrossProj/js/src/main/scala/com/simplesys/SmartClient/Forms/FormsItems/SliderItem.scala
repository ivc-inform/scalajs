package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.System.Class
import com.simplesys.isc.System.Types.AutoChild

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait SliderItem extends CanvasItem {
    var changeOnDrag:Boolean
    var maxValue:Double
    var minValue:Double
    var numValues:Int
    val roundPrecision:Int
    val roundValues:Boolean
    def setMaxValue (newValue:Double):Unit
    def setMinValue (newValue:Double):Unit
    def setNumValues (newNumValues:Double):Unit
    val slider:Canvas with AutoChild
    val sliderConstructor:Class
    val sliderProperties:js.Dictionary[js.Any]
    val vertical:Boolean
}

@js.native
abstract trait AbstractSliderItemCompanion extends AbstractCanvasItemCompanion {
}

@js.native
object SliderItem extends AbstractSliderItemCompanion        
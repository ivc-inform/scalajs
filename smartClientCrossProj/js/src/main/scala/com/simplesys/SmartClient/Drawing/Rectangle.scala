package com.simplesys.js.com.simplesys.SmartClient.Drawing

import com.simplesys.SmartClient.Drawing.Point
import com.simplesys.SmartClient.System.{IscArray, _}
import com.simplesys.System.JSObject

import scala.scalajs.js.annotation.ScalaJSDefined

object Rectangle {
    def apply(left: Double, top: Double, right: Double, bottom: Double): Rectangle = IscArray(Point(left, top), Point(right, top), Point(right, bottom), Point(left, bottom))
    def apply(array: IscArray[Double]): Rectangle = apply(array(0), array(1), array(2), array(3))
}

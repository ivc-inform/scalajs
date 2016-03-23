package com.simplesys.SmartClient.Drawing.Gradients

import scala.scalajs.js

@js.native
trait LinearGradient extends Gradient {
    val x1: String
    val x2: String
    val y1: String
    val y2: String
}


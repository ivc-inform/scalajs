package com.simplesys.SmartClient.Drawing.Gradients

import scala.scalajs.js

@js.native
trait RadialGradient extends Gradient {
    val cx: String
    val cy: String
    val fx: String
    val fy: String
    val r: String
}


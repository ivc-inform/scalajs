package com.simplesys.SmartClient.Foundation

import com.simplesys.System.JSObject

import scala.scalajs.js

@js.native
trait Point extends JSObject {
    val x: Int
    val y: Int
}

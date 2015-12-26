package com.simplesys.SmartClient.Foundation

import com.simplesys.SmartClient.System.Types

import scala.scalajs.js

@js.native
object Point extends Types.Object {
    type Point = Point.type
    var x: Int = js.native
    var y: Int = js.native
}

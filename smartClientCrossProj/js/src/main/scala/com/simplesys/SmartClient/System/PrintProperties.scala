package com.simplesys.SmartClient.System

import scala.scalajs.js

@js.native
trait PrintProperties extends Types.Object {
    val includeControls: js.Array[String]
    val omitControls: js.Array[String]
    val printForExport: Boolean
}

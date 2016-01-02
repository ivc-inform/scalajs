package com.simplesys.SmartClient.Foundation

import com.simplesys.SmartClient.System.Types

import scala.scalajs.js

@js.native
object PrintProperties extends Types.Object {
    type PrintProperties = PrintProperties.type
    val includeControls: js.Array[String] = js.native
    val omitControls: js.Array[String] = js.native
    val printForExport: Boolean = js.native
}

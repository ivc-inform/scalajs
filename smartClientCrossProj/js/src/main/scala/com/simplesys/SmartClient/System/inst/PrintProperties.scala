package com.simplesys.SmartClient.System.inst

import com.simplesys.SmartClient.System.Types

import scala.scalajs.js

@js.native
trait PrintProperties extends Types.Object {
    val includeControls: js.Array[String]
    val omitControls: js.Array[String]
    val printForExport: Boolean
}

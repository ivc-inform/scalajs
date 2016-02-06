package com.simplesys.SmartClient.Foundation

import com.simplesys.SmartClient.System.Types
import com.simplesys.Types1.JSArray

import scala.scalajs.js

@js.native
trait PrintProperties extends Types.Object {
    val includeControls: JSArray[String]
    val omitControls: JSArray[String]
    val printForExport: Boolean
}

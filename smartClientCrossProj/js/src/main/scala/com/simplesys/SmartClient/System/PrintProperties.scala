package com.simplesys.SmartClient.System

import com.simplesys.Types.JSArray

import scala.scalajs.js

@js.native
trait PrintProperties extends Types.Object {
    val includeControls: JSArray[String]
    val omitControls: JSArray[String]
    val printForExport: Boolean
}

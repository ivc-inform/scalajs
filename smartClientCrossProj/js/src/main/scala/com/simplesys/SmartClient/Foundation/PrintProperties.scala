package com.simplesys.SmartClient.Foundation

import com.simplesys.Types1.JSArray

import scala.scalajs.js

@js.native
trait PrintProperties extends js.Object {
    val includeControls: JSArray[String]
    val omitControls: JSArray[String]
    val printForExport: Boolean
}

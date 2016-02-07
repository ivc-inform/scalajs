package com.simplesys.SmartClient.System

import com.simplesys.System.{JSObject, JSArray}

import scala.scalajs.js

@js.native
trait PrintProperties extends JSObject {
    val includeControls: JSArray[String]
    val omitControls: JSArray[String]
    val printForExport: Boolean
}

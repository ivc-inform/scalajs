package com.simplesys.SmartClient.System

import com.simplesys.System.Types2.EscapingMode.EscapingMode
import com.simplesys.Types1.JSArray

import scala.scalajs.js

@js.native
trait TextSettings extends Class {
    var escapingMode: EscapingMode
    var fieldList: JSArray[String]
    var fieldSeparator: String
    var lineSeparator: String
}

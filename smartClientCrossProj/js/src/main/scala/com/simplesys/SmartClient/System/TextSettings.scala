package com.simplesys.SmartClient.System

import com.simplesys.isc.System.Types.EscapingMode.EscapingMode

import scala.scalajs.js

@js.native
trait TextSettings extends Class {
    var escapingMode: EscapingMode
    var fieldList: js.Array[String]
    var fieldSeparator: String
    var lineSeparator: String
}

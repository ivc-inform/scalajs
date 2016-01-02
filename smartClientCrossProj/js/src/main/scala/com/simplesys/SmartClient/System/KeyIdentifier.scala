package com.simplesys.SmartClient.System

import com.simplesys.isc.System.Types.KeyName

import scala.scalajs.js

@js.native
trait KeyIdentifier extends Types.Object {
    val altKey: Boolean
    val ctrlKey: Boolean
    val keyName: KeyName
    val shiftKey: Boolean
}

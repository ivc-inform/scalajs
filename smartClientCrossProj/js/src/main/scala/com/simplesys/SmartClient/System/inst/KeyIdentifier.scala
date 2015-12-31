package com.simplesys.SmartClient.System.inst

import com.simplesys.SmartClient.System.Types
import com.simplesys.isc.System.Types.KeyName

import scala.scalajs.js

@js.native
trait KeyIdentifier extends Types.Object {
    val altKey: Boolean
    val ctrlKey: Boolean
    val keyName: KeyName
    val shiftKey: Boolean
}

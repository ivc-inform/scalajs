package com.simplesys.SmartClient.System

import com.simplesys.System.Types2.KeyName

import scala.scalajs.js

@js.native
trait KeyIdentifier extends Types.Object {
    val altKey: Boolean
    val ctrlKey: Boolean
    val keyName: KeyName
    val shiftKey: Boolean
}

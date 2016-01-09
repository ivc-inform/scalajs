package com.simplesys.SmartClient.DataBinding.dataSource

import com.simplesys.SmartClient.System.Types

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait DSRequestModifier extends Types.Object {
    val end: String
    val fieldName: String
    val operator: String
    val start: String
    val value: String
}



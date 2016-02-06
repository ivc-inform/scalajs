package com.simplesys.SmartClient.DataBinding.dataSource

import scala.scalajs.js

@js.native
trait DSRequestModifier extends js.Object {
    val end: String
    val fieldName: String
    val operator: String
    val start: String
    val value: String
}



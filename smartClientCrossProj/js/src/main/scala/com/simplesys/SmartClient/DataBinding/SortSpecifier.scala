package com.simplesys.SmartClient.DataBinding

import com.simplesys.System.Types.SortDirection.SortDirection

import scala.scalajs.js

@js.native
trait SortSpecifier extends js.Object {
    val context: DataBoundComponent
    val direction: SortDirection
    var normalizer: js.Function
    val property: String
}



package com.simplesys.SmartClient.DataBinding

import com.simplesys.SmartClient.System.Types
import com.simplesys.System.Types2.SortDirection.SortDirection

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait SortSpecifier extends Types.Object {
    val context: DataBoundComponent
    val direction: SortDirection
    var normalizer: js.Function
    val property: String
}



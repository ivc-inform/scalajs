package com.simplesys.SmartClient.DataBinding.dataSource

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait DataSourceSSField extends DataSourceField {
    var foreignField: String
    var lookup: Boolean
    var captionClassLookup: String
}


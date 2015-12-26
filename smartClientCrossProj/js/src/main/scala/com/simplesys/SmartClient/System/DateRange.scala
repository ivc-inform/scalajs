package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.System.RelativeDate.RelativeDate

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
object DateRange extends Types.Object {
  type DateRange = DateRange.type
  var end: RelativeDate | Date = js.native
  var start: RelativeDate | Date = js.native
}

package com.simplesys.SmartClient.System

import com.simplesys.isc.System.Types.RelativeDateRangePosition.RelativeDateRangePosition
import com.simplesys.isc.System.Types.RelativeDateShortcut.RelativeDateShortcut
import com.simplesys.isc.System.Types.RelativeDateString

import scala.scalajs.js

@js.native
object RelativeDate extends Types.Object{
  type RelativeDate = RelativeDate.type

  var rangePosition:RelativeDateRangePosition = js.native
  var value: RelativeDateString | RelativeDateShortcut = js.native
}

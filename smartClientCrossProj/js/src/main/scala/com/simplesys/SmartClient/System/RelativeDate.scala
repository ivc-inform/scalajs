package com.simplesys.SmartClient.System

import com.simplesys.System.Types2.RelativeDateRangePosition.RelativeDateRangePosition
import com.simplesys.System.Types2.RelativeDateShortcut.RelativeDateShortcut
import com.simplesys.System.Types2.RelativeDateString

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
object RelativeDate extends Types.Object{
  type RelativeDate = RelativeDate.type

  var rangePosition:RelativeDateRangePosition = js.native
  var value: RelativeDateString | RelativeDateShortcut = js.native
}

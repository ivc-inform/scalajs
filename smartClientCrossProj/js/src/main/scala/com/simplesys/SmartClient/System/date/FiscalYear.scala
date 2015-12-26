package com.simplesys.SmartClient.System.date

import com.simplesys.SmartClient.System.Types

import scala.scalajs.js

@js.native
object FiscalYear extends Types.Object{
  type FiscalYear = FiscalYear.type

  var date: Int = js.native
  var month: Int = js.native
  var year: Int = js.native
  var fiscalYear: Int = js.native
}

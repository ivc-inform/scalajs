package com.simplesys.SmartClient.System

import scala.scalajs.js

@js.native
object Number extends Types.Object {
    type Number = Number.type
    def stringify(digits: Int = js.native): String = js.native
    def toCurrencyString(currencyChar: String = js.native, decimalChar: String = js.native, padDecimal: Boolean = js.native, currencyCharLast: String = js.native):String = js.native
    def isBetween (number:Number, first:Number = js.native, second:Number = js.native, inclusive:Number = js.native):Boolean = js.native
}

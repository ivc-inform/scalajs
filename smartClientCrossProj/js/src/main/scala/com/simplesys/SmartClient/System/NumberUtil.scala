package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.System.inst._
import com.simplesys.SmartClient.System.props.NumberUtilProps
import com.simplesys.isc.System.Types._

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
object NumberUtil extends AbstractClassCompanion {
    type NumberUtil = NumberUtil.type

    val currencySymbol: String = js.native
    val decimalSymbol: String = js.native
    def format(number: Number, format: FormatString): String = js.native
    val groupingFormat: Number = js.native
    val groupingSymbol: String = js.native
    def isBetween(number: Number, first: Number = js.native, second: Number = js.native, inclusive: Number = js.native): Boolean = js.native
    val negativeFormat: Number = js.native
    val negativeSymbol: String = js.native
    def parseFloat(string: String): Double = js.native
    def parseIfNumeric(numberOrString: String | Number): js.Any = js.native
    def parseInt(string: String): Number = js.native
    def stringify(number: Number, digits: Number = js.native): String = js.native
    def toCurrencyString(number: Number, currencyChar: String = js.native, decimalChar: String = js.native, padDecimal: Boolean = js.native, currencyCharLast: Boolean = js.native): String = js.native
    def toLocalizedString(number: Number, decimalPrecision: Number = js.native, decimalSymbol: String = js.native, groupingSymbol: String = js.native, negativeSymbol: String = js.native): String = js.native
    def toUSCurrencyString(number: Number, decimalPrecision: Number = js.native): String = js.native
    def toUSString(number: Number, decimalPrecision: Number = js.native): String = js.native
}

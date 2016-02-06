package com.simplesys.System.Types2

object DateDisplayFormat extends Enumeration {
    type DateDisplayFormat = Value
    val toLocaleString, toUSShortDate, toUSShortDatetime, toEuropeanShortDate, toEuropeanShortDatetime, toJapanShortDate, toJapanShortDatetime, toSerializeableDate, toDateStamp = Value
}

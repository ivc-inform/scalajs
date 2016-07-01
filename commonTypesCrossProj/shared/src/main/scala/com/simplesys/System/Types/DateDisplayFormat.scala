package com.simplesys.System.Types

object DateDisplayFormat extends Enumeration {
    type DateDisplayFormat = Value
    val toLocaleString, toUSShortDate, toUSShortDatetime, toEuropeanShortDate, toEuropeanShortDatetime, toEuropeanDatetime, toJapanShortDate, toJapanShortDatetime, toSerializeableDate, toDateStamp = Value
}

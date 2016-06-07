package com.simplesys.System.Types

import language.implicitConversions

object FieldType extends Enumeration {
    type FieldType = Value
    val text, boolean, integer, float, date, time, datetime, enum, intEnum, sequence, link, image, binary, imageFile, any, custom, modifier, modifierTimestamp, creator, creatorTimestamp, password, ntext, localeInt, localeFloat, localeCurrency, phoneNumber = Value
}

package com.simplesys.System.Types

import language.implicitConversions

object FieldType extends Enumeration {
    type FieldType = Value
    val text, boolean, integer, float, date, time, datetime, enum, intEnum, sequence, link, image, binary, imageFile, any, custom, modifier, modifierTimestamp, creator, creatorTimestamp, password, ntext, localeInt, localeFloat, localeCurrency, phoneNumber, clob_SimpleType, dDate_SimpleType, dDateOptTime_SimpleType, dDateTime_SimpleType, dTimestamp_SimpleType, dTimestampWithTZ_SimpleType, di_SimpleType, fDouble_SimpleType, fPrice_SimpleType, fSum_SimpleType, id_SimpleType, nInt_SimpleType, sAddress_SimpleType, sBarCode_SimpleType, sCaption_SimpleType, sCode_SimpleType, sDescription_SimpleType, sEMail_SimpleType, sPasswordHashSHA_SimpleType, sPasswordPlain_SimpleType, sPhone_SimpleType, sPostalIndex_SimpleType, sURL_SimpleType, sURLDomain_SimpleType, sURLImage_SimpleType, ss_SimpleType, bBoolean_SimpleType, blob_SimpleType = Value
}

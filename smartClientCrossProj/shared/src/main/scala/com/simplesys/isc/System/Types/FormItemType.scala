package com.simplesys.isc.System.Types

import language.implicitConversions

object FormItemType extends Enumeration {
    type FormItemType = Value
    val text, boolean, integer,float, date, time, enum,sequence, link, image , imageFile, binary = Value
}
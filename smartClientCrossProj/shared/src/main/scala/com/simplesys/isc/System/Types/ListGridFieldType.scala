package com.simplesys.isc.System.Types

import language.implicitConversions

object ListGridFieldType extends Enumeration {
    type ListGridFieldType = Value
    val text, boolean, integer, float, date, time, datetime, sequence, link, image, icon, binary, imageFile, summary = Value
}

package com.simplesys.isc.System.Types

import language.implicitConversions

object ImportFormat extends Enumeration {
    type ImportFormat = Value
    val xml, json, csv, auto = Value
}

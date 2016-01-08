package com.simplesys.isc.System.Types

import language.implicitConversions

object Encoding extends Enumeration {
    type Encoding = Value
    val normal, multipart = Value
}

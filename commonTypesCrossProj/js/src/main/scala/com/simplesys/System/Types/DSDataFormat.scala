package com.simplesys.System.Types

import language.implicitConversions

object DSDataFormat extends Enumeration {
    type DSDataFormat = Value
    val iscServer, xml, json, custom = Value
}

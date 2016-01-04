package com.simplesys.isc.System.Types

import language.implicitConversions

object RecordComponentPoolingMode extends Enumeration {
    type RecordComponentPoolingMode = Value
    val viewport, data, recycle = Value
}

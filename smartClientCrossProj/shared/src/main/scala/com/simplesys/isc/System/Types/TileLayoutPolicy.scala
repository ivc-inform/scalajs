package com.simplesys.isc.System.Types

import language.implicitConversions

object TileLayoutPolicy extends Enumeration {
    type TileLayoutPolicy = Value
    val fit, flow = Value
}

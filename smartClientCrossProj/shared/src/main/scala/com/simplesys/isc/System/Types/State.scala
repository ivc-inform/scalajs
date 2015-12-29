package com.simplesys.isc.System.Types

import language.implicitConversions

object State extends Enumeration {
    type State = Value
    val Empty, Down, Over, Disabled = Value
}

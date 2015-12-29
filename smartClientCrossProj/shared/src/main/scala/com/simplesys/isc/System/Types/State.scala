package com.simplesys.isc.System.Types

import language.implicitConversions

object State extends Enumeration {
    type State = Value
    val "", Down, Over, Disabled = Value
}

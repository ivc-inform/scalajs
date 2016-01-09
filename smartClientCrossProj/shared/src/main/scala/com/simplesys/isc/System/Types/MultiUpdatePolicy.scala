package com.simplesys.isc.System.Types

import language.implicitConversions

object MultiUpdatePolicy extends Enumeration {
    type MultiUpdatePolicy = Value
    val never, clientRequest, rpcManager, always = Value
}

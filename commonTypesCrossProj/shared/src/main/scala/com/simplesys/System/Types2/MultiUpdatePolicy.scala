package com.simplesys.System.Types2

import language.implicitConversions

object MultiUpdatePolicy extends Enumeration {
    type MultiUpdatePolicy = Value
    val never, clientRequest, rpcManager, always = Value
}

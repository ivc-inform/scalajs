package com.simplesys.isc.System.Types

import language.implicitConversions

object RPCTransport extends Enumeration {
    type RPCTransport = Value
    val `xmlHttpRequest`, scriptInclude, hiddenFrame = Value
}

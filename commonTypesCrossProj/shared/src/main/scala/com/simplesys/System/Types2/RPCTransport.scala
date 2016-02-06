package com.simplesys.System.Types2

import language.implicitConversions

object RPCTransport extends Enumeration {
    type RPCTransport = Value
    val `xmlHttpRequest`, scriptInclude, hiddenFrame = Value
}

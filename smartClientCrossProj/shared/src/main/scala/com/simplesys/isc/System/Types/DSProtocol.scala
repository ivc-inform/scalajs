package com.simplesys.isc.System.Types

import language.implicitConversions

object DSProtocol extends Enumeration {
    type DSProtocol = Value
    val getParams, postParams, postXML, soap, postMessage, clientCustom = Value
}

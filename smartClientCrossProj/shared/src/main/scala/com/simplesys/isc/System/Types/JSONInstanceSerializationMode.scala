package com.simplesys.isc.System.Types

import language.implicitConversions

object JSONInstanceSerializationMode extends Enumeration {
    type JSONInstanceSerializationMode = Value
    val long, short, skip = Value
}

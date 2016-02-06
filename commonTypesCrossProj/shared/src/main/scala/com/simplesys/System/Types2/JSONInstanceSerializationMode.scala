package com.simplesys.System.Types2

import language.implicitConversions

object JSONInstanceSerializationMode extends Enumeration {
    type JSONInstanceSerializationMode = Value
    val long, short, skip = Value
}

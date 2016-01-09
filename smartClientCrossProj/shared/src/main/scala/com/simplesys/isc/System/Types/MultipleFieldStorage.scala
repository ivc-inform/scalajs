package com.simplesys.isc.System.Types

import language.implicitConversions

object MultipleFieldStorage extends Enumeration {
    type MultipleFieldStorage = Value
    val simpleString, json, none = Value
}

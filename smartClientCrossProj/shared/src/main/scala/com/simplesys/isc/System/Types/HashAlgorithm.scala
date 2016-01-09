package com.simplesys.isc.System.Types

import language.implicitConversions

object HashAlgorithm extends Enumeration {
    type HashAlgorithm = Value
    val MD5, SHA = Value
}

package com.simplesys.System.Types

import language.implicitConversions

object HashAlgorithm extends Enumeration {
    type HashAlgorithm = Value
    val MD5, SHA = Value
}
